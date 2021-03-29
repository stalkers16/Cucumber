package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Map;

public class NewAccountPage {
    @FindBy(how = How.CSS, using = ".page-heading")
    public WebElement heading;
    @FindBy(how = How.ID, using = "customer_firstname")
    public WebElement inputFirstName;
    @FindBy(how = How.ID, using = "customer_lastname")
    public WebElement inputLastName;
    @FindBy(how = How.ID, using = "passwd")
    public WebElement inputPassword;
    @FindBy(how = How.ID, using = "address1")
    public WebElement inputAddress;
    @FindBy(how = How.ID, using = "city")
    public WebElement inputCity;
    @FindBy(how = How.ID, using = "postcode")
    public WebElement inputZip;
    @FindBy(how = How.ID, using = "phone_mobile")
    public WebElement inputMobilePhone;
    @FindBy(how = How.ID, using = "submitAccount")
    public WebElement registerButton;
    @FindBy(how = How.ID, using = "id_state")
    public WebElement inputState;
    @FindBy(how = How.ID, using = "id_country")
    public WebElement inputCountry;
    @FindBy(how = How.ID, using = "months")
    public WebElement inputMonth;
    @FindBy(how = How.ID, using = "newsletter")
    public WebElement inputNewsletter;
    @FindBy(how = How.ID, using = "uniform-id_gender1")
    public WebElement inputGender;
    @FindBy(how = How.ID, using = "years")
    public WebElement inputYear;
    @FindBy(how = How.ID, using = "days")
    public WebElement inputDays;

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

    public void enterState(String state) throws Throwable {
        inputState.sendKeys(state);
    }

    public void enterCountry(String country) throws Throwable {
        inputCountry.sendKeys(country);
    }

    public void enterMonth(String month) throws Throwable {
        inputMonth.sendKeys(month);
    }

    public void enterNewsletter(String newsletter) throws Throwable {
        inputNewsletter.click();
    }

    public void enterGender(String gender) throws Throwable {
        inputGender.click();
    }

    public void enterYear(String year) throws Throwable {
        inputYear.sendKeys(year);
    }

    public void enterDays(String days) throws Throwable {
        inputDays.sendKeys(days);
    }
}






