package dog;

import org.junit.Test;

public class BookWalkDublicatTest extends BaseTest {

    @Test
    public void testBookWalk() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        ApplyWalkPage applyWalkPage = homePage.clickBookWagButton();

        Thread.sleep(5000);

        applyWalkPage.inputEmail(user.getEmail());

        applyWalkPage.inputPassword(user.getPassword());

        applyWalkPage.inputFirstName(user.getFirstName());

        applyWalkPage.inputLastName(user.getLastName());

        applyWalkPage.inputPhone(user.getPhone());
    }
}
