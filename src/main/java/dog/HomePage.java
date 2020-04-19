package dog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage  {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.elWjVh")
    private WebElement bookWagButton;

    @FindBy(css = ".sc-ifAKCX.GCetG")
    private List<WebElement> upperButton;

    public ApplyWalkPage clickBookWagButton() {
        bookWagButton.click();

        return new ApplyWalkPage(driver);
    }

    public LoginPage clickLoginButton() {

        upperButton.get(2).click();

        return new LoginPage(driver);
    }

}
