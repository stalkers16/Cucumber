package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement submitLoginButton;
    @FindBy(how = How.ID, using = "email") // By.id("name")
    private WebElement inputEmail; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.ID, using = "passwd") // By.id("name")
    private WebElement inputPassword; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.ID, using = "passwd") // By.id("name")
    private WebElement message; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/ol/li")
    private WebElement messageText;

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

}
