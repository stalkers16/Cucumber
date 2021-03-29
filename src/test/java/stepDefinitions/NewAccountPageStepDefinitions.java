package stepDefinitions;

import Utils.WebElementUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.NewAccountPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class NewAccountPageStepDefinitions {
    private WebDriver driver;
    public NewAccountPage newAccountPage;
    private Map<String, String> credentials;

    public NewAccountPageStepDefinitions() {
        this.driver = Hooks.driver;
        newAccountPage = PageFactory.initElements(Hooks.driver, NewAccountPage.class);
    }
    @Given("^I should see registration page heading (.*)$")
    public void iShouldSeeRegistrationPageHeading(String heading) throws Throwable {
        String actualHeading = heading;
        WebElementUtils.waitForElementPresent(newAccountPage.heading);
        assertEquals(newAccountPage.getNewAccountHeading().getText(), actualHeading);
    }

    @And("^I click  on Register button$")
    public void iClickOnRegisterButton() throws Throwable {
        newAccountPage.registerButton.click();
    }

    @And("^I fill fields with values$")
    public void iFillFieldsWithValues(Map<String, String> credentials) throws Throwable {
        this.credentials = credentials;

        newAccountPage.enterFirstName(credentials.get("customer_firstname"));
        newAccountPage.enterLastName(credentials.get("customer_lastname"));
        newAccountPage.enterPassword(credentials.get("passwd"));
        newAccountPage.enterAddress(credentials.get("address1"));
        newAccountPage.enterCity(credentials.get("city"));
        newAccountPage.enterZip(credentials.get("postcode"));
        newAccountPage.enterMobilePhone(credentials.get("phone_mobile"));
        }


        @And("^I fill rest fields with corresponding values$")
        public void iFillRestFieldsWithCorrespondingValues(Map<String, String> credentials) throws Throwable {
            this.credentials = credentials;

            newAccountPage.enterState(credentials.get("id_state"));
            newAccountPage.enterCountry(credentials.get("id_country"));
            newAccountPage.enterMonth(credentials.get("months"));
            newAccountPage.enterNewsletter(credentials.get("newsletter"));
            newAccountPage.enterGender(credentials.get("id_gender2"));
            newAccountPage.enterYear(credentials.get("years"));
            newAccountPage.enterDays(credentials.get("days"));
    }
}







