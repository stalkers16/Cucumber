package pages_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.*;

public class ShopPage {

    @FindBy(how = How.ID, using = "name") // By.id("name")
    private WebElement nameInput; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.NAME, using = "age") // By.name("age")
    private WebElement ageInput;
    @FindBy(how = How.ID, using = "submit")
    private WebElement submitButton;
    @FindBy(how = How.CLASS_NAME, using = "error") // By.className("error)
    private WebElement errorText;
    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'0123-456-789')]")
    private WebElement topPhone;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'(347) 466-7432')]")
    private WebElement bottomPhone;

    public String getPageUrl() {
        return "http://automationpractice.com/index.php";
    }

    public WebElement getTopPhone() {
        return topPhone;
    }

    public WebElement getBottomPhone() {
        return bottomPhone;
    }
}


