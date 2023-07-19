package pages.HardwareTab;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HardwareTabPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.HardwareTab.HardwareTabPage.class);
    public static pages.HardwareTab.HardwareTabPage instance;

    private HardwareTabPage() {

    }

    public static pages.HardwareTab.HardwareTabPage getInstance() {
        if (instance == null) {
            instance = new pages.HardwareTab.HardwareTabPage();
        }
        return instance;
    }



    private By closeClickPrivacy = By.xpath("//button[@class='iubenda-cs-close-btn']");
    private By checkLogoHomePage= By.xpath("//img[@src='https://cdn.nexths.it/immagini/2017/desktop-next.png']");

    private By hoverComputerTablet =By.xpath("//a[@href='https://www.nexths.it/Products/getCategory/l0/Computer%20Tablet%20Notebook']");
    private By hooverConsumabileAc= By.xpath("//a[@href='https://www.nexths.it/Products/getCategory/l0/Consumabile%20Accessori']");
    private By hoverHardwareSoft=By.xpath("//a[@href='https://www.nexths.it/Products/getCategory/l0/Hardware%20Software']");
    private By hoverMonitorStampanti=By.xpath("//a[@href='https://www.nexths.it/Products/getCategory/l0/Monitor%20Stampanti%20Periferiche']");
    private By hoverTelefonia = By.xpath("//a[@href='https://www.nexths.it/Products/getCategory/l0/Telefonia%20Wearable']");
    private By hoverTVAudio=By.xpath("//a[@href='https://www.nexths.it/Products/getCategory/l0/TV%20Audio%20Video%20Foto%20Home']");

    private By clickOnHSTab=By.xpath("//a[@href='https://www.nexths.it/Products/getCategory/l0/Hardware%20Software']");
    private By clickONCPU=By.cssSelector("body > div.container-fluid.filtertopbar2.hidden-xs > div > div:nth-child(6) > a");
    private By selectIntel=By.cssSelector("#myNavbar > ul:nth-child(2) > li:nth-child(2) > a");
    private By selectI5= By.cssSelector("#myNavbar > ul:nth-child(6) > li:nth-child(3) > a");
    private By select1700=By.xpath("//*[@id='myNavbar']/ul[2]/ul/ul[1]/li[2]/a");
    private By verifyProduct =By.xpath("/html/body/div[13]/div/div[2]/div[1]/div[17]/div/div/div[1]/b");
    private By clickOn12600k=By.id("BX8071512600K");
    private By clickAddCart= By.xpath("//a[@class='btn btn-first greennext']");

    private By clickOnAlimentatori=By.cssSelector("body > div.container-fluid.filtertopbar2.hidden-xs > div > div:nth-child(1) > a");
    private By clickAsus=By.xpath("//a[@href='https://www.nexths.it/Products/getSkuFromLev/page/1/l0/Hardware%20Software/l1/Alimentatori/filterBrand/Asus']");
    private By clickOnWatt = By.xpath("//a[@href='https://www.nexths.it/Products/getSkuFromLev/page/1/l0/Hardware%20Software/l1/Alimentatori/filterBrand/Asus/filterAttributi/Watt%3D850%20W']");
    private By selectTufGaming=By.id("4711081786573");
    private By addToCartAsus=By.xpath("//a[@class='btn btn-first greennext']");





    public void clickClosePrivacy()
    {
        LOG.info("Close 'X' button on Privacy popup");
        driver.findElement(closeClickPrivacy).click();
    }

    public boolean verifyLogoHome()
    {
        LOG.info("Verify if 'Logo' top left from the ribbon is displayed");
        return driver.findElement(checkLogoHomePage).isDisplayed();
    }


    public void hoverComputerTablet()
    {
        LOG.info("Hover with mouse on 'COMPUTER TABLET NOTBOOK'");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(hoverComputerTablet)).build().perform();
    }

    public void hoverConsumabileAccessori()
    {
        LOG.info("Hover with mouse on 'CONSUMABILE ACCESSORI'");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(hooverConsumabileAc)).build().perform();
    }

    public void hoverHardwareSoftware()
    {
        LOG.info("Hover with mouse on 'HARDWARE SOFTWARE'");
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(hoverHardwareSoft)).build().perform();
    }

    public void hoverMONITORSTAMPANTIPERIFERICHE()
    {
        LOG.info("Hover with mouse on 'MONITOR STAMPANTI PERIFERICHE'");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(hoverMonitorStampanti)).build().perform();
    }

    public void hoverTELEFONIAWEARABLE()
    {
        LOG.info("Hover with mouse on 'TELEFONIA WEARABLE'");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(hoverTelefonia)).build().perform();
    }


    public void hoverTVAUDIOVIDEOFOTOHOME()
    {
        LOG.info("Hover with mouse on 'TV AUDIO VIDEO FOTO HOME'");
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(hoverTVAudio)).build().perform();
    }


    public void clickHSTabRibbon()
    {
        LOG.info("Click on 'HARDWARE SOFTWARE' tab on the ribbon");
        driver.findElement(clickOnHSTab).click();
    }

    public void clickCPUButton()
    {
        LOG.info("Click on 'CPU' button from the 'HARDWARE SOFTWARE' tab ");
        driver.findElement(clickONCPU).click();
    }

    public void clickIntelB()
    {
        LOG.info("Click on 'Intel'button from the left side in 'Brand' category ");
        driver.findElement(selectIntel).click();
    }

    public void clickI5Button()
    {
        LOG.info("Select 'Intel Core I5' from the left side in 'CPU' category");
        driver.findElement(selectI5).click();
    }


    public void click1700Button()
    {
        LOG.info("Select '1700'from the left side in 'Socket' category");
        driver.findElement(select1700).click();
    }

    public boolean verifyProductAvailable()
    {
        LOG.info("Verify if Product  'BX8071512600K' still have available");
        return driver.findElement(verifyProduct).isDisplayed();
    }

    public void clickOn12600kProduct()
    {
        LOG.info("Click on 'Intel Core i5-12600K 10 Core 2.8GHz 20MB sk1700 Box'");
        driver.findElement(clickOn12600k).click();
    }

    public void addProductToCart()
    {
        LOG.info("Click on 'Cart' button ");
        driver.findElement(clickAddCart).click();
    }

    public void clickAlimentatori()
    {
        LOG.info("Choose 'Alimentatori' from the list");
        driver.findElement(clickOnAlimentatori).click();
    }

    public void clickAsusBrand()
    {
        LOG.info("Click on 'Asus'button from the left side in 'Brand' category ");
        driver.findElement(clickAsus).click();
    }

    public void clickWatt()
    {
        LOG.info("Click on '850W'button from the left side in 'Watt' category ");
        driver.findElement(clickOnWatt).click();
    }

    public void selectAsusTUFGaming850W()
    {
        LOG.info("Select 'Asus TUF Gaming 850W Modulare 80+ Gold PFC Attivo ATX' product and click ");
        driver.findElement(selectTufGaming).click();
    }

    public void clickAggiungiallCarrelloAsusTUFGaming()
    {
        LOG.info("Click 'Aggiungi al Carrello' Asus TUF Gaming 850W  ");
        driver.findElement(addToCartAsus).click();
    }











}
