package tests.LogOutTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import tests.BaseTest;
import static pages.BasePage.sleep;

public class LogOutTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(tests.LogOutTest.LogOutTest.class);



    String emailAddress="relu_scorpion14@yahoo.com";
    String password1="ThisIsPassword23.";

    @Test
    public void logout()
    {
        logOutPage.clickClosePrivacy();
        sleep(3000);
        logOutPage.clickOnLoginButton();
        sleep(3000);
        logOutPage.addEmailField(emailAddress);

        logOutPage.addPasswordlField(password1);

        logOutPage.clickLoginButtonTo();

        logOutPage.clickOnLoginButton();

        logOutPage.clickLogOutButton();
        sleep(3000);


    }
}
