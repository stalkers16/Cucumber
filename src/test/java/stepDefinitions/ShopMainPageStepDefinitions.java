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

    @Given("^I am on shop page$")
    public void iAmOnShopPage() throws Throwable {
        driver.get(shopPage.getPageUrl());
    }

    @Given("^I should see shop page title (.*)$")
    public void iShouldSeeShopPage(String title) throws Throwable {
<<<<<<< HEAD
        assertEquals(driver.getTitle(), title);
=======
        String actualTitle = title;
        assertEquals(driver.getTitle(), actualTitle);
>>>>>>> 59fcb985af6a20a28b9099dd5878e1466e0e6e1b
    }

    @Then("^I should see shop page phone top (.*)$")
    public void iShouldSeeShopPagePhoneTop(String topPhone) throws Throwable {
        String actualTopPhone = topPhone;
        assertEquals(shopPage.getTopPhone().getText(), actualTopPhone);
    }

<<<<<<< HEAD
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
=======
    @Then("^I should see shop page phone bottom (.*)$")
    public void iShouldSeeShopPagePhoneBottom(String bottomPhone) throws Throwable {
        String actualBottomPhone = bottomPhone;
        assertEquals(shopPage.getBottomPhone().getText(), actualBottomPhone);
    }

    @When("^I enter email: (.*) for authentification$")
    public void iEnterEmailEmailForAuthentification(String email) throws Throwable {
        shopPage.enterEmail(email);
    }

    @And("^I enter password: (.*) for authentification$")
    public void iEnterPasswordPasswordForAuthentification(String password) throws Throwable {
>>>>>>> 59fcb985af6a20a28b9099dd5878e1466e0e6e1b
        shopPage.enterPassword(password);
    }

    @And("^I click sign in using PO$")
    public void iClickSignInUsingPO() {
        shopPage.submitLoginButton();
    }

<<<<<<< HEAD
    @Then("^I see following message: \"(.*)\" using PO$")
    public void iSeeFollowingMessage(String message) throws Throwable {
        assertEquals(shopPage.checkMessageText(), message);
=======
    @Then("^I see following message: \"(.*)\" of authentification$")
    public void iSeeFollowingMessageOfAuthentification(String message) throws Throwable {
        assertEquals(shopPage.checkMessageText().getText(), message);
>>>>>>> 59fcb985af6a20a28b9099dd5878e1466e0e6e1b
    }

    @And("^I click sign in button$")
    public void iClickSignInButton() {
        shopPage.clickSignInButton();
    }
}
