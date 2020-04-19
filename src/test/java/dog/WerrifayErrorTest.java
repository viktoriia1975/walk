package dog;

import org.junit.Assert;
import org.junit.Test;

public class WerrifayErrorTest extends BaseTest {

    @Test
    public void testWerrifayError() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        ApplyWalkPage applyWalkPage = homePage.clickBookWagButton();

        Thread.sleep(6000);

        applyWalkPage.clickEmailField();

        applyWalkPage.clickPasswordField();

        applyWalkPage.clickFirstNameField();

        applyWalkPage.clickLastNameField();

        applyWalkPage.clickPnoheField();

        applyWalkPage.clickEmailField();



        String errorEmail = applyWalkPage.getEmailError();
        System.out.println(errorEmail);

        Assert.assertEquals("required", errorEmail);

        String errorFirstName = applyWalkPage.getFirstNameError();
        System.out.println(errorFirstName);

        Assert.assertEquals("required", errorFirstName);

        String errorLastName = applyWalkPage.getLastNameError();
        System.out.println(errorLastName);

        Assert.assertEquals("required", errorLastName);

        String errorPhone = applyWalkPage.getPhoneError();
        System.out.println(errorPhone);

        Assert.assertEquals("required", errorPhone);
    }
}
