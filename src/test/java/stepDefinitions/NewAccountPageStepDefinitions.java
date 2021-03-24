package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.NewAccountPage;

import static org.junit.Assert.assertEquals;

public class NewAccountPageStepDefinitions {
    private WebDriver driver;
    static NewAccountPage newAccountPage;

    public NewAccountPageStepDefinitions() {
        this.driver = Hooks.driver;
        newAccountPage = PageFactory.initElements(Hooks.driver, NewAccountPage.class);
    }
    @Given("^I should see registration page heading (.*)$")
    public void iShouldSeeRegistrationPageHeading(String heading) throws Throwable {
        String actualHeading = heading;
        assertEquals(newAccountPage.getNewAccountHeading().getText(), actualHeading);
    }

    @When("^I fill field First Name with value (.*)$")
    public void iFillFieldFirstNameWithValue(String firstName) throws Throwable {
        newAccountPage.enterFirstName(firstName);
    }

    @When("^I fill field Last Name with value (.*)$")
    public void iFillFieldLastNameWithValue(String lastName) throws Throwable {
        newAccountPage.enterLastName(lastName);
    }

    @When("^I fill field Password with value (.*)$")
    public void iFillFieldPasswordWithValue(String password) throws Throwable {
        newAccountPage.enterPassword(password);
    }

    @When("^I fill field Address with value (.*)$")
    public void iFillFieldAddressWithValue(String address) throws Throwable {
        newAccountPage.enterAddress(address);
    }

    @When("^I fill field City with value (.*)$")
    public void iFillFieldCityWithValue(String city) throws Throwable {
        newAccountPage.enterCity(city);
    }

    @When("^I fill field Zip with value (.*)$")
    public void iFillFieldZipWithValue(String zip) throws Throwable {
        newAccountPage.enterZip(zip);
    }

    @When("^I fill field MobilePhone with value (.*)$")
    public void iFillFieldMobilePhoneWithValue(String mobilePhone) throws Throwable {
        newAccountPage.enterMobilePhone(mobilePhone);
    }

    @And("^I click  on Register button$")
    public void iClickOnRegisterButton() {
        newAccountPage.registerButton.click();
    }
}
