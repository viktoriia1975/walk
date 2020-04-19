package dog;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseTest {

    @Test
    public void testFirst() {

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-ifAKCX.elWjVh"));
        bookWalkButton.click();

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailField.sendKeys("avb@gmail.com");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));
        passwordField.sendKeys("Password2");

        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
        firstNameField.sendKeys("Roman");

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));
        lastNameField.sendKeys("Stem");

        WebElement cellPhoneField = driver.findElement(By.cssSelector("input[name=\"phone\"]"));
        cellPhoneField.sendKeys("917-678-90-45");
    }
}
