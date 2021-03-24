package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {
    @FindBy(how = How.CSS, using = "h1.page-heading")
    private WebElement myAccHeading;

    public WebElement getMyAccountHeading() {
        return myAccHeading;
    }
}
