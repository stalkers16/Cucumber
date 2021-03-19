package stepDefinitions;

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
        assertEquals(driver.getTitle(),title);
    }

    @Then("^I should see shop page phone top$")
    public void iShouldSeeShopPagePhoneTop() throws Throwable {
        assertEquals("0123-456-789",
                driver.findElement(By.xpath("//strong[contains(text(),'0123-456-789')]")).getText());
    }

    @Then("^I should see shop page phone top PO (.*)$")
    public void iShouldSeeShopPagePhoneTopPO(String topPhone) throws Throwable {
        assertTrue(shopPage.getTopPhone().toString().contains(topPhone));
    }

    @Then("^I should see shop page phone bottom$")
    public void iShouldSeeShopPagePhoneBottom() throws Throwable {
        assertEquals("(347) 466-7432",
                driver.findElement(By.xpath("//span[contains(text(),'(347) 466-7432')]")).getText());
    }

    @Then("^I should see shop page phone bottom PO (.*)$")
    public void iShouldSeeShopPagePhoneBottomPO(String bottomPhone) throws Throwable {
        assertTrue(shopPage.getBottomPhone().toString().contains(bottomPhone));
    }
}
