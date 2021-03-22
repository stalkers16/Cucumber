package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopPage {

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement submitLoginButton;
    @FindBy(how = How.CSS, using = ".shop-phone strong")
    private WebElement topPhone;
    @FindBy(how = How.CSS, using = "#block_contact_infos > div > ul > li:nth-child(2) > span")
    private WebElement bottomPhone;
    @FindBy(how = How.ID, using = "email") // By.id("name")
    private WebElement inputEmail; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.ID, using = "passwd") // By.id("name")
    private WebElement inputPassword; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.ID, using = "passwd") // By.id("name")
    private WebElement message; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.XPATH, using = "//[*[@id=\"center_column\"]/div[1]/ol/li/text()]")
    private WebElement messageText;
    @FindBy(how = How.CSS, using = "#header > div.nav > div > div > nav > div.header_user_info > a")
    private WebElement signInButton;

    public String getPageUrl() {
        return "http://automationpractice.com/index.php";
    }

    public WebElement getTopPhone() {
        return topPhone;
    }

    public WebElement getBottomPhone() {
        return bottomPhone;
    }

    public void enterEmail(String email) {
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void submitLoginButton() {
        submitLoginButton.click();
    }

    public WebElement checkMessageText() {
        return messageText;
    }
    public void clickSignInButton(){
        signInButton.click();
    }
}






