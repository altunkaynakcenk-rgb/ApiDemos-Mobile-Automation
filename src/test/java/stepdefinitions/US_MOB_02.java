package stepdefinitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class US_MOB_02 {

        @When("kullanici Views menusune gider")
        public void kullanici_views_menusune_gider() {

            Driver.driver.findElement(
                    AppiumBy.accessibilityId("Views")
            ).click();
        }

        @When("kullanici Controls menusune gider")
        public void kullanici_controls_menusune_gider() {

            Driver.driver.findElement(
                    AppiumBy.accessibilityId("Controls")
            ).click();
        }

        @When("kullanici Light Theme ekranini acar")
        public void kullanici_light_theme_ekranini_acar() {

            Driver.driver.findElement(
                    AppiumBy.accessibilityId("1. Light Theme")
            ).click();
        }

        @When("kullanici input alanina {string} yazar")
        public void kullanici_input_alanina_yazar(String text) {

            WebElement input = Driver.driver.findElement(
                    AppiumBy.className("android.widget.EditText")
            );

            input.sendKeys(text);
        }

        @When("kullanici checkbox secer")
        public void kullanici_checkbox_secer() {

            Driver.driver.findElement(
                    AppiumBy.accessibilityId("Checkbox 1")
            ).click();
        }

        @Then("checkbox secili olmalidir")
        public void checkbox_secili_olmalidir() {

            WebElement checkbox = Driver.driver.findElement(
                    AppiumBy.accessibilityId("Checkbox 1")
            );
            String isChecked = checkbox.getAttribute("checked");
            Assert.assertEquals("true", isChecked);
        }
    }

