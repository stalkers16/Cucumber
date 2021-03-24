package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages_sample.NewAccountPage;
import pages_sample.ShopPage;

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
        driver.navigate().refresh();
    }

    @When("^I fill field First Name with value (.*)$")
    public void iFillFieldFirstNameWithValue(String firstName) throws Throwable {
        newAccountPage.enterFirstName(firstName);
    }
}
