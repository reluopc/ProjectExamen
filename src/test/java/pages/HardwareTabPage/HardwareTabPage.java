package pages.HardwareTabPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HardwareTabPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.HardwareTabPage.HardwareTabPage.class);
    public static pages.HardwareTabPage.HardwareTabPage instance;

    private HardwareTabPage() {

    }

    public static pages.HardwareTabPage.HardwareTabPage getInstance() {
        if (instance == null) {
            instance = new pages.HardwareTabPage.HardwareTabPage();
        }
        return instance;
    }

    private By closeClickPrivacy = By.xpath("//button[@class='iubenda-cs-close-btn']");
    private By checkLogoHomePage= By.xpath("//img[@src='https://cdn.nexths.it/immagini/2017/desktop-next.png']");
    private By clickOnHSTab=By.xpath("//a[@href='https://www.nexths.it/Products/getCategory/l0/Hardware%20Software']");
    private By clickONCPU=By.cssSelector("body > div.container-fluid.filtertopbar2.hidden-xs > div > div:nth-child(6) > a");
    private By selectIntel=By.cssSelector("#myNavbar > ul:nth-child(2) > li:nth-child(2) > a");
    private By selectI5= By.cssSelector("#myNavbar > ul:nth-child(6) > li:nth-child(3) > a");
    private By select1700=By.xpath("//*[@id='myNavbar']/ul[2]/ul/ul[1]/li[2]/a");
    private By verifyProduct =By.xpath("/html/body/div[13]/div/div[2]/div[1]/div[17]/div/div/div[1]/b");
    private By clickAddCart= By.xpath("/html/body/div[13]/div/div[2]/div[1]/div[17]/div/div/div[4]/button/span");
    private By clickToTop= By.xpath("//a[@class='scrolltotop']");








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
        LOG.info("Click on 'Intel'button from the left side where it is displayed 'Brand'");
        driver.findElement(selectIntel).click();
    }

    public void clickI5Button()
    {
        LOG.info("Select 'Intel Core I5' from the left side where it is displayed 'CPU'");
        driver.findElement(selectI5).click();
    }


    public void click1700Button()
    {
        LOG.info("Select '1700'from the left side where it is displayed 'Socket'");
        driver.findElement(select1700).click();
    }

    public boolean verifyProductAvailable()
    {
        LOG.info("Verify if Product  'BX8071512600K' still have available");
        return driver.findElement(verifyProduct).isDisplayed();
    }
//
    public void addProductToCart()
    {
        LOG.info("Click on 'Cart' button ");
        driver.findElement(clickAddCart).click();
    }

    public void clickScrollTop()
    {
        LOG.info("Click 'Scroll top' button to turn back top on the page ");
        driver.findElement(clickToTop).click();
    }











}
