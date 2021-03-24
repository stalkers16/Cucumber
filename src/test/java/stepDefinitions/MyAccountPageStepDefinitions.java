package stepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.MyAccountPage;

import static org.junit.Assert.assertEquals;

public class MyAccountPageStepDefinitions {
    private WebDriver driver;
    static MyAccountPage myAccountPage;

    public MyAccountPageStepDefinitions() {
        this.driver = Hooks.driver;
        myAccountPage = PageFactory.initElements(Hooks.driver, MyAccountPage.class);
    }

    @Given("^I should see MyAccount page heading (.*)$")
    public void iShouldSeeMyAccountPageHeading(String myAccHeading) throws Throwable {
        String actualHeading = myAccHeading;
        assertEquals(myAccountPage.getMyAccountHeading().getText(), actualHeading);
    }
}