package tests.CartTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class CartTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(tests.CartTest.CartTest.class);

    String emailAddress="relu_scorpion14@yahoo.com";
    String password1="ThisIsPassword23.";
    String Quantity="1";
    String Note="Ciao Nexths, preferirei che il mio ordine fosse consegnato al mattino se questa preferenza è possibile";

    @Test
    public void cart() {

//        LOG.info("Click 'X' button  to close Privacy Policy");
//        cartPage.clickClosePrivacy();

//        LOG.info("Click on 'Login' button");
//        signInPage.clickOnLoginButton();
//
//
//        LOG.info("Add email intro 'Email' field");
//        signInPage.addEmailField(emailAddress);
//
//        LOG.info("Add password intro 'Password' field ");
//        signInPage.addPasswordlField(password1);
//
//        LOG.info("Click on 'Login' button to enter intro Account");
//        signInPage.clickLoginButtonTo();


        LOG.info("Verify if 'Cart' it is display on home page");
        cartPage.verifyCartIsDisplay();


        LOG.info("Click on 'Cart' button to open  ");
        cartPage.openCart();


        LOG.info("Click on quantity of 'AOC 24G2ZU/BK' and change it ");
         cartPage.changeQuantity();
         sleep(3000);


        LOG.info("Change quantity to '1' ");
        cartPage.addNewQuantity(Quantity);
        sleep(3000);


        LOG.info("Click on 'VAI ALLA CASSA' to order ");
        cartPage.clickVAIALLACASSA();
        sleep(2000);

        LOG.info("Verify if'Negozio di Lambiate' is displayed");
        Assert.assertTrue(cartPage.verifyNegozioLimbiate(),"'Negozio di Lambiate' is not displayed");

        LOG.info("Verify if'Negozio di Cantu' is displayed");
        Assert.assertTrue(cartPage.verifyNegozioCantu(),"'Negozio di Cantu' is not displayed");

        LOG.info("Verify if'Negozio di Monza' is displayed");
        Assert.assertTrue(cartPage.verifyNegozioMonza(),"'Negozio di Monza' is not displayed");

        LOG.info("Verify if'Negozio di Milano Via Vitruvio' is displayed");
        Assert.assertTrue(cartPage.verifyNegozioMilanoVitruvio(),"'Negozio di Milano Via Vitruvio' is not displayed");

        LOG.info("Verify if'Negozio di Como' is displayed");
        Assert.assertTrue(cartPage.verifyNegozioComo(),"'Negozio di Como' is not displayed");

        LOG.info("Verify if'Negozio di Seregno' is displayed");
        Assert.assertTrue(cartPage.verifyNegozioSeregno(),"'Negozio di Seregno' is not displayed");

        LOG.info("Verify if'Negozio di Milano Via Procaccini' is displayed");
        Assert.assertTrue(cartPage.verifyNegozioViaProcaccini(),"'Negozio di Milano Via Procaccini' is not displayed");

        LOG.info("Click 'Negozio di Monza' checkbox");
        cartPage.clickSelectMonza();

        LOG.info("Click'Consegna Tramite Corriere'checkbox");
        cartPage.clickCCorriere();


        LOG.info("Click on 'Carta di Credito' checkbox");
        cartPage.clickOnCartaDiCredito();

        LOG.info("Type message  in 'Note' text field");
        cartPage.typeInNote(Note);

        LOG.info("Click on 'Ho letto e accetto le condizioni generali di vendita' and select  checkbox ");
        cartPage.clickCondizioniGeneraliVendita();

        LOG.info("Click on Account ");
        cartPage.clickOnAccount();

        LOG.info("Click 'Esci(LogOut)");
        cartPage.clickLogOutButton();

    }
}
