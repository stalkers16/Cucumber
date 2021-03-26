package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import pages_sample.NewAccountPage;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class NewAccountPageStepDefinitions {
    private WebDriver driver;
    static NewAccountPage newAccountPage;
    private Map<String, String> credentials;

    public NewAccountPageStepDefinitions() {
        this.driver = Hooks.driver;
        newAccountPage = PageFactory.initElements(Hooks.driver, NewAccountPage.class);
    }
    @Given("^I should see registration page heading (.*)$")
    public void iShouldSeeRegistrationPageHeading(String heading) throws Throwable {
        String actualHeading = heading;
        Thread.sleep(2000); //added for stability of test
        assertEquals(newAccountPage.getNewAccountHeading().getText(), actualHeading);
    }

    @And("^I click  on Register button$")
    public void iClickOnRegisterButton() {
        newAccountPage.registerButton.click();
    }

    @And("^I fill fields with values$")
    public void iFillFieldsWithValues(Map<String, String> credentials) throws Throwable {
        this.credentials = credentials;

        for (Map.Entry<String, String> e : credentials.entrySet()) {
            if (e.getKey() == "Field_ID"){break;}else{
            driver.findElement(By.id(e.getKey())).clear();
            driver.findElement(By.id(e.getKey())).sendKeys(e.getValue());}
        }
    }

        @And("^I fill rest fields with corresponding values$")
        public void iFillRestFieldsWithCorrespondingValues(Map<String, String> credentials) throws Throwable {
            this.credentials = credentials;

            for (Map.Entry<String, String> e : credentials.entrySet()) {
                if (e.getKey() == "Field_ID"){break;}else {
                    driver.findElement(By.id(e.getKey())).sendKeys(e.getValue());
                }
            }
    }
}





