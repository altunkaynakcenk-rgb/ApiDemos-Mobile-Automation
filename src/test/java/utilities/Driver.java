package utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Driver {

    public static AndroidDriver driver;

    public static AndroidDriver getDriver() {

        if (driver == null) {

            try {
                DesiredCapabilities caps = new DesiredCapabilities();

                caps.setCapability("platformName", "Android");
                caps.setCapability("appium:automationName", "UiAutomator2");
                caps.setCapability("appium:deviceName", "Android");
                caps.setCapability("appium:udid", "R68R903YM2D"); // 🔥 SENİN TELEFON

                caps.setCapability("appium:app", "C:\\Users\\cenk\\Downloads\\ApiDemos-debug.apk"); // 🔥
                // 🔥 session düşmesin
                caps.setCapability("appium:newCommandTimeout", 300);

                driver = new AndroidDriver(
                        new URL("http://127.0.0.1:4723"),
                        caps
                );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

