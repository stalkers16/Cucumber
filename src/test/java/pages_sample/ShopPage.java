package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopPage {


    @FindBy(how = How.CSS, using = ".shop-phone strong")
    private WebElement topPhone;
    @FindBy(how = How.CSS, using = "#block_contact_infos > div > ul > li:nth-child(2) > span")
    private WebElement bottomPhone;
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

    public void clickSignInButton(){
        signInButton.click();
    }
}






