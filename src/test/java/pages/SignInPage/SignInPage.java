package pages.SignInPage;

import org.openqa.selenium.By;
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

//Variabile
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
    private By verifyLPreferiti=By.xpath("/html/body/div[8]/div[2]/div[1]/div[3]/p[8]/a");
    private By verifyGaranziaR=By.xpath("//a[@href='https://www.nexths.it/user/richiestaRMA']/span");
    private By verifyMailingL=By.xpath("//a[@href='https://www.nexths.it/user/usermailinglist']");
    private By remove1stProduct =By.xpath("//a[@alt='Rimuovi dai Preferiti']");
    private By remove2ndProduct=By.xpath("//a[@alt='Rimuovi dai Preferiti']");
    private By remove3rdProduct=By.xpath("//a[@alt='Rimuovi dai Preferiti']");
    private By remove4thProduct=By.xpath("//a[@alt='Rimuovi dai Preferiti']");
    private By remove5thProduct=By.xpath("//a[@alt='Rimuovi dai Preferiti']");




    //Metode
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


    public void clickOnListaPreferiti()
    {
        LOG.info("Click on 'Lista Preferiti 'Tab ");
        driver.findElement(verifyLPreferiti).click();
    }


    public void clickRimouvi()
    {
        LOG.info("Click on 'Rimouvi' button to delete products from Lista dei Desideri");
        driver.findElement(remove1stProduct).click();
        driver.findElement(remove2ndProduct).click();
        driver.findElement(remove3rdProduct).click();
        driver.findElement(remove4thProduct).click();
        driver.findElement(remove5thProduct).click();
    }

}



