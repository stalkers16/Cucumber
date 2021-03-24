package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.LoginPage;

import static org.junit.Assert.assertEquals;

public class ShopLoginPageStepDefinitions {
    private WebDriver driver;
    static LoginPage loginPage;

    public ShopLoginPageStepDefinitions() {
        this.driver = Hooks.driver;
        loginPage = PageFactory.initElements(Hooks.driver, LoginPage.class);
    }

    @When("^I enter email: (.*) for authentification$")
    public void iEnterEmailEmailForAuthentification(String email) throws Throwable {
        loginPage.enterEmail(email);
    }

    @And("^I enter password: (.*) for authentification$")
    public void iEnterPasswordPasswordForAuthentification(String password) throws Throwable {
        loginPage.enterPassword(password);
    }


    @And("^I click sign in using PO$")
    public void iClickSignInUsingPO() {
        loginPage.submitLoginButton();
    }

    @Then("^I see following message: \"(.*)\" of authentification$")
    public void iSeeFollowingMessageOfAuthentification(String message) throws Throwable {
        assertEquals(loginPage.checkMessageText().getText(), message);
    }
}
