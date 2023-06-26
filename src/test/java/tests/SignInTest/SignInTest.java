package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);



    String emailAddress="relu_scorpion14@yahoo.com";
    String password1="ThisIsPassword23.";


    @Test
    public void SignIn()
    {
        LOG.info("Check 'Login' button ");
        Assert.assertTrue(signInPage.isLogInButtonDisplayed(), "Login Button is not displayed");
        sleep(3000);

        LOG.info("Click 'X' button  to close Privacy Policy");
        signInPage.clickClosePrivacy();

        LOG.info("click on 'Login' button ");
        signInPage.clickOnLoginButton();

        LOG.info("Add email intro 'Email' field");
        signInPage.addEmailField(emailAddress);

        LOG.info("Add password intro 'Password'field ");
        signInPage.addPasswordlField(password1);

        LOG.info("Click on 'Login' button to enter intro Account  ");
        signInPage.clickLoginButtonTo();

    }

}