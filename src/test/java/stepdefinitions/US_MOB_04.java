package stepdefinitions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class US_MOB_04 {

        AndroidDriver driver = Driver.getDriver();

        @When("kullanici App menusune gider")
        public void kullanici_app_menusune_gider() {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement app = wait.until(ExpectedConditions.presenceOfElementLocated(
                    AppiumBy.accessibilityId("App")
            ));

            app.click();
        }

        @When("kullanici {string} ekranina gider")
        public void kullanici_ekranina_gider(String menu) {

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiSelector().textContains(\"" + menu + "\")"
            )).click();
        }

        @When("kullanici alerti acan butona tiklar")
        public void kullanici_alerti_acar() {

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiSelector().textContains(\"OK Cancel dialog with a message\")"
            )).click();
        }

        @Then("alert goruntulenmelidir")
        public void alert_goruntulenmelidir() {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement alert = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.id("android:id/alertTitle")
            ));

            Assert.assertTrue(alert.isDisplayed());
        }

        @Then("kullanici {string} butonuna tiklar")
        public void kullanici_buton_tiklar(String buton) {

            String id = buton.equals("OK")
                    ? "android:id/button1"
                    : "android:id/button2";

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.id(id)
            ));

            button.click();
        }

        @Then("alert kapanmis olmalidir")
        public void alert_kapanmis_olmalidir() {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            boolean alertGone = wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.id("android:id/button1")
            ));

            Assert.assertTrue(alertGone);
        }

        @Then("ayni ekranda kalindigi dogrulanmalidir")
        public void ayni_ekranda_kalindigi_dogrulanmalidir() {

            WebElement title = driver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiSelector().textContains(\"Alert Dialogs\")"
                    )
            );

            Assert.assertTrue(title.isDisplayed());
        }
    }
