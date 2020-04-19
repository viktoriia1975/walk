package dog;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;

    protected static User user;

    protected static User2 user2;


    @BeforeClass
    public static void setUp() {

        System.out.println("Start setUp method");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Администратор\\Desktop\\driver\\chromedriver.exe");

        driver = new ChromeDriver();

        user = new User("vika@gmail.com", "Password123", "Vika", "Stem", "9167899087");

        user2 = new User2("roman@gmail.com", "roman123", "roman", "Stem2", "7896785645" );

        driver.get("https://wagwalking.com/");

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @AfterClass
    public static void tearDown() {

        System.out.println("Finish Test");

        driver.quit();


    }
}
