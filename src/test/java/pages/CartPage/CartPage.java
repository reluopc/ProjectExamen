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
    private By changeQuantity=By.xpath("//input[@class='form-control']");
    private By addAnotherQuantity=By.xpath("//input[@class='form-control']");
    private By clearCart=By.xpath("//a[@href='https://www.nexths.it/shopcart/DeleteAllItemDetail'][1]");


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















}

