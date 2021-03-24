package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
    @FindBy(how = How.CSS, using = ".page-heading")
    private WebElement heading;
    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElement inputFirstName;

    public WebElement getNewAccountHeading() {
        return heading;
    }

    public void enterFirstName(String firstName) throws Throwable {
        inputFirstName.clear();
        inputFirstName.sendKeys(firstName);
        Thread.sleep(5000);
    }

//   public WebElement getFirstName() {
//      return firstName;
//    }
}
