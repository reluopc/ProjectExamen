package pages.SignInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;


    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }


    private By loginIsDispalyed = By.id("loginButtonDesktop");
    private By closeClickPrivacy = By.xpath("//button[@class='iubenda-cs-close-btn']");
    private By clickLogin = By.id("loginButtonDesktop");
    private By typeEmailField=By.id("emaillogin");
    private By typePasswordField=By.id("passwordlogin");
    private By clickLoginButton=By.id("submit");
    private By clickMFatturazione=By.xpath("//a[@href='https://www.nexths.it/user/edtUsrAccount']");
    private By verifyMSpedizione=By.xpath("//a[@href='https://www.nexths.it/user/lstUsrShipAdd']");
    private By verifyMPassword=By.xpath("//a[@href='https://www.nexths.it/user/lstUsrShipAdd']");
    private By verifyNextCard=By.xpath("//a[@href='https://www.nexths.it/nextcardd/ShowNcInfo']");
    private By verifyOrdini=By.xpath("//a[@href='https://www.nexths.it/user/UserOrders']");
    private By verifyFatture=By.xpath("//a[@href='https://www.nexths.it/user/UserInvoice']");
    private By verifyLPreferiti=By.xpath("//a[@href='https://www.nexths.it/user/UserOrders']");
    private By verifyGaranziaR=By.xpath("//a[@href='https://www.nexths.it/user/richiestaRMA']/span");
    private By verifyMailingL=By.xpath("//a[@href='https://www.nexths.it/user/usermailinglist']");

    private By changeAddress= By.xpath("//input[@placeholder='Via']");
    private By clickSalva=By.id("submit");




    //Methods
    public boolean isLogInButtonDisplayed()
    {
        LOG.info("Verify if 'Login' button is displayed");
        return driver.findElement(loginIsDispalyed).isDisplayed();
    }

    public void clickClosePrivacy()
    {
        LOG.info("Close 'X' button on Privacy popup");
        driver.findElement(closeClickPrivacy).click();
    }


    public void clickOnLoginButton()
    {
        LOG.info("Click 'SignIn' button ");
        driver.findElement(clickLogin).click();
    }

    public void addEmailField(String emailAddress)
    {
        LOG.info("Add Email in'Email' field ");
        driver.findElement(typeEmailField).sendKeys(emailAddress);
    }


    public void addPasswordlField(String password1)
    {
        LOG.info("Add Password in'Password' field ");
        driver.findElement(typePasswordField).sendKeys(password1);
    }

    public void clickLoginButtonTo()
    {
        LOG.info("Click 'Login' button  to enter intro account ");
        driver.findElement(clickLoginButton).click();
    }


    public boolean verifyFatturazioneTab()
    {
        LOG.info("Verify if 'Modifica Dati Fatturazione' Tab is displayed");
        return driver.findElement(clickMFatturazione).isDisplayed();
    }

    public boolean verifySpedizioneTab()
    {
        LOG.info("Verify if 'Modifica Dati Spedizione' Tab is displayed");
         return driver.findElement(verifyMSpedizione).isDisplayed();
    }

    public boolean verifyModificaPasswordTab()
    {
        LOG.info("Verify if 'Modifica Password' Tab is displayed");
        return driver.findElement(verifyMPassword).isDisplayed();
    }

    public boolean verifyNEXTCARDTab()
    {
        LOG.info("Verify if 'NEXTCARD' Tab is displayed");
        return driver.findElement(verifyNextCard).isDisplayed();
    }

    public boolean verifyIMieiOrdiniTab()
    {
        LOG.info("Verify if 'I Miei Ordini' Tab is displayed");
        return driver.findElement(verifyOrdini).isDisplayed();
    }

    public boolean verifyLeMieFattureTab()
    {
        LOG.info("Verify if 'Le Mie Fatture' Tab is displayed");
        return driver.findElement(verifyFatture).isDisplayed();
    }


    public boolean verifyListaPreferiti()
    {
        LOG.info("Verify if 'Lista Preferiti' Tab is displayed");
        return driver.findElement(verifyLPreferiti).isDisplayed();
    }


    public boolean verifyGaranziaeRMA()
    {
        LOG.info("Verify if 'Garanzia e RMA' Tab is displayed");
        return driver.findElement(verifyGaranziaR).isDisplayed();
    }

    public boolean verifyMailingList()
    {
        LOG.info("Verify if ' Mailing List' Tab is displayed");
        return driver.findElement(verifyMailingL).isDisplayed();
    }


    public void clickOnMFatturazione()
    {
        LOG.info("Click on 'MFatturazione'Tab ");
        driver.findElement(clickMFatturazione).click();
    }


    public boolean verifyIfExistVia()
    {
        LOG.info("Verify if 'Via 'text field exist ");
        return driver.findElement(changeAddress).isDisplayed();
    }


    public void modifyAddress ()
    {
        LOG.info("Click on 'Via' text field and delete address");
        driver.findElement(changeAddress).click();
        driver.findElement(changeAddress).clear();
    }


    public void modifyAddress2 (String mAddress)
    {
        LOG.info("Insert new address");
        driver.findElement(changeAddress).sendKeys(mAddress);
    }


    public void pressSalvabtn()
    {
        LOG.info("Click on 'SALVA' button to save  new number address");
        driver.findElement(clickSalva).click();
    }




}



