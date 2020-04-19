package dog;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SecondTest extends BaseTest {


    @Test
    public void testSecond() throws InterruptedException {

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-ifAKCX.elWjVh"));
        bookWalkButton.click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));
        /*
        [0]- emailField;
        [1] - password;
        [2] - firstName;
        [3] - lastName;
        [4] - cellPhone;
         */

        Thread.sleep(5000);

        inputFields.get(0).sendKeys("vika@com.ua");
        inputFields.get(1).sendKeys("Password23");
        inputFields.get(2).sendKeys("Vika");
        inputFields.get(3).sendKeys("Stem");
        inputFields.get(4).sendKeys("9176789045");
    }
}
