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
    String mAddress = "Via Meda , Nr 35";


    @Test
    public void SignIn()
    {
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

        LOG.info("Verify if 'Modifica Dati Fatturazione'tab is displayed");
        Assert.assertTrue(signInPage.verifyFatturazioneTab(), "'Modifica Dati Fatturazione' is not displayed");

        LOG.info("Verify if 'Modifica Dati Spedizione'tab is displayed");
        Assert.assertTrue(signInPage.verifySpedizioneTab(), "'Modifica Dati Spedizione' is not displayed");

        LOG.info("Verify if 'Modifica Password'tab is displayed");
        Assert.assertTrue(signInPage.verifyModificaPasswordTab(), "'Modifica Password' is not displayed");

        LOG.info("Verify if 'NEXTCARD'tab is displayed");
        Assert.assertTrue(signInPage.verifyNEXTCARDTab(), "'NEXTCARD' is not displayed");

        LOG.info("Verify if 'I Miei Ordini'tab is displayed");
        Assert.assertTrue(signInPage.verifyIMieiOrdiniTab(), "'I Miei Ordini' is not displayed");

        LOG.info("Verify if 'Le Mie Fatture'tab is displayed");
        Assert.assertTrue(signInPage.verifyLeMieFattureTab(), "'Le Mie Fatture' is not displayed");

        LOG.info("Verify if 'Lista Preferiti'tab is displayed");
        Assert.assertTrue(signInPage.verifyListaPreferiti(), "'Lista Preferiti' is not displayed");

        LOG.info("Verify if 'Garanzia e RMA 'tab is displayed");
        Assert.assertTrue(signInPage.verifyGaranziaeRMA(), "'Garanzia e RMA' is not displayed");

        LOG.info("Verify if 'Mailing List'tab is displayed");
        Assert.assertTrue(signInPage.verifyMailingList(), "'Mailing List' is not displayed");


        LOG.info("Click on 'Modifica Dati Fatturazione'");
        signInPage.clickOnMFatturazione();

        LOG.info(" Verify if text field 'Via' exist on page");
        Assert.assertTrue(signInPage.verifyIfExistVia(), "'Via' text field doesn't exist on page");


        LOG.info("Click on 'Via' text field");
        signInPage.modifyAddress();
        LOG.info("Delete old address");
        signInPage.modifyAddress();


        LOG.info("Add new address ");
        signInPage.modifyAddress2(mAddress);


        LOG.info("Press on 'SALVA' button");
        signInPage.pressSalvabtn();

    }

}