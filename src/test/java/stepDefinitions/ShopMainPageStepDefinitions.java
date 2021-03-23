package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.ShopPage;

import static org.junit.Assert.assertEquals;

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
        String actualTitle = title;
        assertEquals(driver.getTitle(), actualTitle);
    }

    @Then("^I should see shop page phone top (.*)$")
    public void iShouldSeeShopPagePhoneTop(String topPhone) throws Throwable {
        String actualTopPhone = topPhone;
        assertEquals(shopPage.getTopPhone().getText(), actualTopPhone);
    }

    @Then("^I should see shop page phone bottom (.*)$")
    public void iShouldSeeShopPagePhoneBottom(String bottomPhone) throws Throwable {
        String actualBottomPhone = bottomPhone;
        assertEquals(shopPage.getBottomPhone().getText(), actualBottomPhone);
    }

    @And("^I click sign in button$")
    public void iClickSignInButton() {
        shopPage.clickSignInButton();
    }
}
