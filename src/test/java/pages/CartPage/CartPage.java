package pages.CartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class CartPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.CartPage.CartPage.class);
    public static pages.CartPage.CartPage instance;

    private CartPage() {

    }

    public static pages.CartPage.CartPage getInstance() {
        if (instance == null) {
            instance = new pages.CartPage.CartPage();
        }
        return instance;
    }

    private By closeClickPrivacy = By.xpath("//button[@class='iubenda-cs-close-btn']");
    private By verifyIfCartExist = By.id("cartButtonDesktop");
    private By clickaddToCart=By.xpath("//a[@class='btn btn-first greennext']");
    private By openCartRibbon=By.id("cartButtonDesktop");
    private By cQuantity=By.xpath("//div[@class='col-xs-8 col-sm-11']//input[@name='0']");
    private By addAnotherQuantity=By.xpath("//input[@class='form-control']");
    private By clickBtnVAI=By.xpath("//a[@class='btn btn-success btncart center-block hidden-xs']");
    private By verifyNdiLimbiate=By.xpath("//input[@value='shop_Limbiate']");
    private By verifyNdiCantu=By.xpath("//input[@value='shop_Cantu']");
    private By verifyNdiMonza=By.xpath("//input[@value='shop_Monza']");
    private By verifyNdiMilano=By.xpath("//input[@value='shop_Vitruvio']");
    private By verifyNdiComo=By.xpath("//input[@value='shop_Como']");
    private By verifyNdiSeregno=By.xpath("//input[@value='shop_Seregno']");
    private By verifyNdiProcaccini=By.xpath("//input[@value='shop_Procaccini']");
    private By selectMonza=By.xpath("//input[@value='shop_Monza']");
    private By clickConsegna=By.xpath("//input[@value='ship_TNT']");
    private By clickPagamento=By.xpath("//input[@value='CRE']");
    private By writeNote=By.id("note");
    private By clickCondizioni=By.id("PrivacyCheck");


    private By clickAccountBTN=By.id("loginButtonDesktop");
    private By clickOnLogOut=By.xpath("//a[@href='https://www.nexths.it/user/logoutrequest']");




    public void clickClosePrivacy()
    {
        LOG.info("Close 'X' button on Privacy popup");
        driver.findElement(closeClickPrivacy).click();
    }

    public boolean verifyCartIsDisplay()
    {
        LOG.info("Verify if 'Cart' button from the ribbon is displayed");
        return driver.findElement(verifyIfCartExist).isDisplayed();
    }


    public void openCart()
    {
        LOG.info("Click on 'Cart' button top right from the ribbon and open it ");
        driver.findElement(openCartRibbon).click();
    }

    public void changeQuantity()
    {
        LOG.info("Change quantity of 'AOC 24G2ZU/BK' ");
        driver.findElement(cQuantity).click();
    }

    public void addNewQuantity(String nr1)
    {
        LOG.info("Change quantity from 3 to 1 product  ");
        driver.findElement(addAnotherQuantity).sendKeys(Keys.BACK_SPACE);
        driver.findElement(addAnotherQuantity).sendKeys(nr1);
        driver.findElement(addAnotherQuantity).sendKeys(Keys.ENTER);
    }


    public void clickVAIALLACASSA()
    {
        LOG.info("Click on 'VAI ALLA CASSA' ");
        driver.findElement(clickBtnVAI).click();
    }


    public boolean verifyNegozioLimbiate()
    {
       LOG.info("Check if  shop 'Negozio di Limbiate' is displayed ");
        return driver.findElement(verifyNdiLimbiate).isDisplayed();
    }

    //dupa sa faca hoover  dupa sa treaca la altul dupa hoover

    public boolean verifyNegozioCantu()
    {
        LOG.info("Check if  shop 'Negozio di Cantu' is displayed ");
        return driver.findElement(verifyNdiCantu).isDisplayed();
    }

    public boolean verifyNegozioMonza()
    {
        LOG.info("Check if  shop 'Negozio di Monza is displayed ");
        return driver.findElement(verifyNdiMonza).isDisplayed();
    }

    public boolean verifyNegozioMilanoVitruvio()
    {
        LOG.info("Check if  shop ' Negozio di Milano Via Vitruvio' is displayed ");
        return driver.findElement(verifyNdiMilano).isDisplayed();
    }

    public boolean verifyNegozioComo()
    {
        LOG.info("Check if  shop 'Negozio di Como' is displayed ");
        return driver.findElement(verifyNdiComo).isDisplayed();
    }

    public boolean verifyNegozioSeregno()
    {
        LOG.info("Check if  shop 'Negozio di Seregno' is displayed ");
        return driver.findElement(verifyNdiSeregno).isDisplayed();
    }

    public boolean verifyNegozioViaProcaccini()
    {
        LOG.info("Check if  shop 'Negozio di Milano Via Procaccini' is displayed ");
        return driver.findElement(verifyNdiProcaccini).isDisplayed();
    }

    public void clickSelectMonza()
    {
        LOG.info("Click on 'Negozio di Monza' check box ");
        driver.findElement(selectMonza).click();
    }

    public  void clickCCorriere()
    {
        LOG.info("Click on 'Consegna Tramite Corriere'checkbox");
        driver.findElement(clickConsegna).click();
    }

    public void clickOnCartaDiCredito()
    {
        LOG.info("Select 'Carta Di Credito' checkbox ");
        driver.findElement(clickPagamento).click();
    }

    public void typeInNote(String note)
    {
        LOG.info("Click on 'Note'text field and type a message");
        driver.findElement(writeNote).sendKeys(note);
    }

    public void clickCondizioniGeneraliVendita()
    {
        LOG.info("Click on 'condizioni generali di vendita'checkbox");
        driver.findElement(clickCondizioni).click();
    }


    public void clickOnAccount()
    {
        LOG.info("Click 'Login' button  to enter intro account ");
        driver.findElement(clickAccountBTN).click();
    }

    public void clickLogOutButton()
    {
        LOG.info("Click on 'Esci(LogOut)'");
        driver.findElement(clickOnLogOut).click();
    }





















}

