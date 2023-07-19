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
    public void SignIn() {
        LOG.info("Check 'Login' button ");
        Assert.assertTrue(signInPage.isLogInButtonDisplayed(), "Login Button is not displayed");
        sleep(1000);

        LOG.info("Click 'X' button  to close Privacy Policy");
        signInPage.clickClosePrivacy();

        LOG.info("Click on 'Login' button");
        signInPage.clickOnLoginButton();

        LOG.info("Add email intro 'Email' field");
        signInPage.addEmailField(emailAddress);

        LOG.info("Add password intro 'Password'field ");
        signInPage.addPasswordlField(password1);

        LOG.info("Click on 'Login' button to enter intro Account  ");
        signInPage.clickLoginButtonTo();

        LOG.info("click on 'Login' button ");
        signInPage.clickOnLoginButton();

        LOG.info("'Modifica Dati Fatturazione'tab is displayed");
        Assert.assertTrue(signInPage.verifyFatturazioneTab(), "'Modifica Dati Fatturazione' is not displayed");

        LOG.info("'Modifica Dati Spedizione'tab is displayed");
        Assert.assertTrue(signInPage.verifySpedizioneTab(), "'Modifica Dati Spedizione' is not displayed");

        LOG.info("'Modifica Password'tab is displayed");
        Assert.assertTrue(signInPage.verifyModificaPasswordTab(), "'Modifica Password' is not displayed");

        LOG.info("'NEXTCARD'tab is displayed");
        Assert.assertTrue(signInPage.verifyNEXTCARDTab(), "'NEXTCARD' is not displayed");

        LOG.info(" 'I Miei Ordini'tab is displayed");
        Assert.assertTrue(signInPage.verifyIMieiOrdiniTab(), "'I Miei Ordini' is not displayed");

        LOG.info("'Le Mie Fatture'tab is displayed");
        Assert.assertTrue(signInPage.verifyLeMieFattureTab(), "'Le Mie Fatture' is not displayed");

        LOG.info(" 'Lista Preferiti'tab is displayed");
        Assert.assertTrue(signInPage.verifyListaPreferiti(), "'Lista Preferiti' is not displayed");

        LOG.info(" 'Garanzia e RMA 'tab is displayed");
        Assert.assertTrue(signInPage.verifyGaranziaeRMA(), "'Garanzia e RMA' is not displayed");

        LOG.info(" 'Mailing List'tab is displayed");
        Assert.assertTrue(signInPage.verifyMailingList(), "'Mailing List' is not displayed");


        LOG.info("Click on 'Lista Preferiti'");
        signInPage.clickOnListaPreferiti();

        LOG.info("Click on 'Rimouvi'button");
        signInPage.clickRimouvi();

        LOG.info("Return to Home Page");
        signInPage.returnHOMEPAGE();
        sleep(1000);

    }
}