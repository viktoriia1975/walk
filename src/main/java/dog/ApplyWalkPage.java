package dog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplyWalkPage extends BasePage {

    public ApplyWalkPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = "input[name=\"email\"]" )
    private WebElement emailField;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[name=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = ".sc-bdVaJa.sc-bxivhb.laYMsi")
    private List<WebElement> errorFields;





    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clickEmailField() {
        emailField.click();
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickPasswordField() {
        passwordField.click();
    }

    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void clickFirstNameField() {
        firstNameField.click();
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void clickLastNameField() {
        lastNameField.click();
    }

    public void inputPhone(String phone) {
        phoneField.sendKeys(phone);
    }

    public void clickPnoheField() {
        phoneField.click();
    }

    public String getEmailError() {
        return errorFields.get(0).getText();
    }

    public String getFirstNameError() {
        return errorFields.get(1).getText();
    }

    public String getLastNameError() {
        return errorFields.get(2).getText();
    }

    public String getPhoneError() {
        return errorFields.get(3).getText();
    }
}
