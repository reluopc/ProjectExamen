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
    private By deleteOnePz=By.xpath("//input[@value='1']");
    private By chooseQuantity=By.id("setqtycart");
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

    public void deletePzOne()
    {
        LOG.info("Delete Pz '1' from the text field ");
        driver.findElement(deleteOnePz).sendKeys(Keys.BACK_SPACE);
    }


    public void typeQuantity(String order)
    {
        LOG.info(" Type '3'quantity products in 'PZ' text field ");
        driver.findElement(chooseQuantity).sendKeys(order);
    }

    public void addProductToCart()
    {
       LOG.info("Click on 'Aggiungi al Carrello'button to add product in cart ");
       driver.findElement(clickaddToCart).click();
    }

    public void openCart()
    {
        LOG.info("Click on 'Cart' button top right from the ribbon and open it ");
        driver.findElement(openCartRibbon).click();
    }

    public void changeQnty()
    {
        LOG.info("Select 'QUANTITÀ' text field and delete quantity");
        driver.findElement(changeQuantity).click();
        driver.findElement(changeQuantity).sendKeys(Keys.BACK_SPACE);
    }

    public void addNewQuantity(String order2)
    {
        LOG.info("Type '1'  in  'QUANTITÀ' text field ");
        driver.findElement(addAnotherQuantity).sendKeys(order2);
    }

    public void clickClearButton()
    {
        LOG.info("Click on 'Svuota Carrello' to delete all items from the Cart ");
        driver.findElement(clearCart).click();
    }
















}

