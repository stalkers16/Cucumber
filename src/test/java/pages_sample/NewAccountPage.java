package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
    @FindBy(how = How.CSS, using = ".page-heading")
    private WebElement heading;
    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElement inputFirstName;
    @FindBy(how = How.ID, using = "customer_lastname")
    private WebElement inputLastName;
    @FindBy(how = How.ID, using = "passwd")
    private WebElement inputPassword;
    @FindBy(how = How.ID, using = "address1")
    private WebElement inputAddress;
    @FindBy(how = How.ID, using = "city")
    private WebElement inputCity;
    @FindBy(how = How.ID, using = "postcode")
    private WebElement inputZip;
    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElement inputMobilePhone;
    @FindBy(how = How.ID, using = "submitAccount")
    public WebElement registerButton;

    public WebElement getNewAccountHeading() {
        return heading;
    }

    public void enterFirstName(String firstName) throws Throwable {
        inputFirstName.clear();
        inputFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) throws Throwable {
        inputLastName.clear();
        inputLastName.sendKeys(lastName);
    }

    public void enterPassword(String password) throws Throwable {
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void enterAddress(String address) throws Throwable {
        inputAddress.clear();
        inputAddress.sendKeys(address);
    }

    public void enterCity(String city) throws Throwable {
        inputCity.clear();
        inputCity.sendKeys(city);
    }

    public void enterZip(String zip) throws Throwable {
        inputZip.clear();
        inputZip.sendKeys(zip);
    }

    public void enterMobilePhone(String mobilePhone) throws Throwable {
        inputMobilePhone.clear();
        inputMobilePhone.sendKeys(mobilePhone);
    }
}






