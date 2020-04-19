package dog;

import org.junit.Assert;
import org.junit.Test;

public class LoginNegativeTest extends BaseTest {

    @Test
    public void testLoginNegative() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        LoginPage loginPage = homePage.clickLoginButton();

        Thread.sleep(5000);

        loginPage.inputEmail(user2.getEmail());

        loginPage.inputPassword(user2.getPassword());

        loginPage.clickLogin();

        String errorField = loginPage.getLoginErrorField();
        System.out.println(errorField);

        Assert.assertEquals("Authentication Failed", errorField);




    }

}
