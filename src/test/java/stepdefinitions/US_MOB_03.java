package stepdefinitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class US_MOB_03 {

    AndroidDriver driver = Driver.getDriver();

    @When("kullanici Viewes menusune gider")
    public void kullanici_views_menusune_gider() {

        driver.findElement(
                AppiumBy.accessibilityId("Views")
        ).click();
    }

    @When("us03 kullanici {string} ekranina gider")
    public void kullanici_ekranina_gider(String hedefItem) {

        WebElement element = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + hedefItem + "\"))"
        ));

        element.click();
    }

    @Then("detay ekrani goruntulenmelidir")
    public void detay_ekrani_goruntulenmelidir() {

        Assert.assertTrue(driver.getPageSource().length() > 0);
    }
}