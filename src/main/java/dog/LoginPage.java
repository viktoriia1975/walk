package dog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {

        super(driver);
    }


    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = ".btn.btn-secondary.btn-block")
    private WebElement loginButton;

    /*
    loginErrorField I cannot find element by css
     */

    @FindBy(css = ".WagLoginForm_alert__1AnhH.bootstrap_alert__micD4.bootstrap_alert-warning__3CyDn")
    private WebElement loginErrorField;


    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public String getLoginErrorField() {
        return loginErrorField.getText();
    }


}
