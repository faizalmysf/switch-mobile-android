package operation;

import com.ssts.pcloudy.appium.PCloudyAppiumSession;
import constants.AndroidCapabilityType;
import constants.BaseData;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    public static TouchAction touchAction;
    public WebDriverWait wait;

    public void setupAppium(String urlServer) throws MalformedURLException, IOException {

        System.out.println("instance " + this.getClass().getSimpleName());
        PCloudyAppiumSession pCloudySession;
        Properties configFile = new Properties();
        configFile.load(BaseTest.class.getClassLoader().getResourceAsStream("config.properties"));
        String apk_Path = System.getProperty("user.dir")
                + configFile.getProperty("androidAppLocation");
        capabilities = new DesiredCapabilities();
        try {
            url = new URL(configFile.getProperty(urlServer));
            switch (urlServer) {
                /* Use Local Server */
                case "localURL":
                    capabilities.setCapability(MobileCapabilityType.UDID, configFile.getProperty("udid"));
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, configFile.getProperty("androidPlatformName"));
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, configFile.getProperty("androidPlatformVersion"));
                    capabilities.setCapability(AndroidCapabilityType.APP_PACKAGE, configFile.getProperty("androidAppPackage"));
                    capabilities.setCapability(AndroidCapabilityType.APP_ACTIVITY, configFile.getProperty("androidAppActivity"));
                    capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
                    capabilities.setCapability(AndroidCapabilityType.AUTO_GRANT_PERMISSION, "true");
                    capabilities.setCapability(MobileCapabilityType.APP, apk_Path);
                    break;

                /* Use Cloud Server */
                case "cloudURL":
                    capabilities.setCapability("pCloudy_Username", configFile.getProperty("pCloudyUsername"));
                    capabilities.setCapability("pCloudy_ApiKey", configFile.getProperty("pCloudyApiKey"));
                    capabilities.setCapability("pCloudy_DurationInMinutes", 30);
                    capabilities.setCapability("newCommandTimeout", 600);
                    capabilities.setCapability("launchTimeout", 90000);
                    capabilities.setCapability("pCloudy_DeviceFullName", configFile.getProperty("samsungS9"));
                    capabilities.setCapability("platformVersion", configFile.getProperty("platformVersion"));
                    capabilities.setCapability("platformName", configFile.getProperty("androidPlatformName"));
                    capabilities.setCapability("automationName", "uiautomator2");
                    capabilities.setCapability("pCloudy_ApplicationName", "switch.apk");
                    capabilities.setCapability("appPackage", configFile.getProperty("androidAppPackage"));
                    capabilities.setCapability("appActivity", configFile.getProperty("androidAppActivity"));
                    capabilities.setCapability("pCloudy_WildNet", "false");
                    capabilities.setCapability("autoGrantPermissions", true);
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.hideKeyboard();
        wait = new WebDriverWait(driver, 15);

        //Populating the properties file
        configFile.setProperty("Device Name", "udid");
        configFile.setProperty("Android Version", "androidPlatformVersion");
        File file = new File("target\\allure-results");
        FileOutputStream fileOut = new FileOutputStream(file);
        configFile.store(fileOut, "Device Info");
        fileOut.close();
    }

    public void closeApp() {
        driver.closeApp();
    }

    public void uninstallApp() {
        driver.removeApp(BaseData.ApplicationInformation.ANDROID_APPLICATION_PACKAGE);
    }
}