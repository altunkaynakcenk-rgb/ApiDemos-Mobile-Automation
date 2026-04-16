package stepdefinitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class US_MOB_01 {
    @Given("kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {

        Driver.getDriver();
    }

    @Then("API Demos basligi gorulur")
    public void api_demos_basligi_gorulur() {

        WebElement title = Driver.driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiSelector().textContains(\"API Demos\")"
                )
        );

        Assert.assertTrue(title.isDisplayed());

        System.out.println("API Demos goruldu");
    }
}


