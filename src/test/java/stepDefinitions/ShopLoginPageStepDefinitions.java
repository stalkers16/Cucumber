package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.utility.RandomString;
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

    @When("^I enter email: (.*) for registration$")
    public void iEnterEmailEmailForRegistration(String regEmail) throws Throwable {
        loginPage.enterRegEmail(regEmail);
    }

    @When("^I enter random email for registration$")
    public void iEnterRandomEmailForRegistration() throws Throwable {
        //String easy = RandomString.digits + "abcdefhijkprstuvwx";
        RandomString randString = new RandomString(8);
        String randEmail = randString+".com";
        loginPage.enterRegEmail(randEmail);
    }
    @And("^I enter password: (.*) for authentification$")
    public void iEnterPasswordPasswordForAuthentification(String password) throws Throwable {
        loginPage.enterPassword(password);
    }

    @And("^I click sign in using PO$")
    public void iClickSignInUsingPO() {
        loginPage.submitLoginButton.click();
    }

    @Then("^I see following message: \"(.*)\" of authentification$")
    public void iSeeFollowingMessageOfAuthentification(String message) throws Throwable {
        assertEquals(loginPage.checkMessageText().getText(), message);
    }

    @And("^I click Create account button$")
    public void iClickCreateAccountButton() throws Throwable {
        loginPage.createAccountButton.click();
        Thread.sleep(3000);//without/or with lower timeout here test does not work
    }
}
