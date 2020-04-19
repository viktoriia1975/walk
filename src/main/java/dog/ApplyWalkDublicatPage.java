package dog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplyWalkDublicatPage extends BasePage {

    public ApplyWalkDublicatPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> inputFields;

    public void inputEmail(String email) {

        inputFields.get(0).sendKeys(email);
    }

    public void inputPassword(String password) {

        inputFields.get(1).sendKeys(password);
    }

    public void inputFirstName(String firstName) {

        inputFields.get(2).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {

        inputFields.get(3).sendKeys(lastName);
    }

    public void inputPhone(String phone) {

        inputFields.get(4).sendKeys(phone);
    }


}
