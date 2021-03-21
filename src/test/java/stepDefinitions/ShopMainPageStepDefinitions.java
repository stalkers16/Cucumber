package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopMainPageStepDefinitions {
    private WebDriver driver;
    static ShopPage shopPage;

    public ShopMainPageStepDefinitions() {
        this.driver = Hooks.driver;
        shopPage = PageFactory.initElements(Hooks.driver, ShopPage.class);
    }

    @Given("^I am on shop page using po$")
    public void iAmOnShopPageUsingPo() throws Throwable {
        driver.get(shopPage.getPageUrl());
    }

    @Given("^I should see shop page title (.*)$")
    public void iShouldSeeShopPage(String title) throws Throwable {
        assertEquals(driver.getTitle(), title);
    }

    @Then("^I should see shop page phone top PO (.*)$")
    public void iShouldSeeShopPagePhoneTopPO(String topPhone) throws Throwable {
        assertEquals(shopPage.getTopPhone().getText(), topPhone);
    }

    @Then("^I should see shop page phone bottom PO (.*)$")
    public void iShouldSeeShopPagePhoneBottomPO(String bottomPhone) throws Throwable {
        assertEquals(shopPage.getBottomPhone().getText(), bottomPhone);
    }

    @When("^I enter email: (.*) using PO$")
    public void iEnterEmailEmailUsingPO(String email) throws Throwable {
        shopPage.enterEmail(email);
    }

    @And("^I enter password: (.*) using PO$")
    public void iEnterPasswordPasswordUsingPO(String password) throws Throwable {
        shopPage.enterPassword(password);
    }

    @And("^I click sign in using PO$")
    public void iClickSignInUsingPO() {
        shopPage.submitLoginButton();
    }

    @Then("^I see following message: \"(.*)\" using PO$")
    public void iSeeFollowingMessage(String message) throws Throwable {
        assertEquals(shopPage.checkMessageText(), message);
    }

    @And("^I click sign in button$")
    public void iClickSignInButton() {
        shopPage.clickSignInButton();
    }
}
