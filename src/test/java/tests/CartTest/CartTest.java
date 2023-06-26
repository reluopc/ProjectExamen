package tests.CartTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class CartTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(tests.CartTest.CartTest.class);
    private String newUrl = getBaseUrl() + "/Products/details/sku/24G2ZU%2FBK";


    String typeQuantity1="3";
    String typeQuantity2="1";


    @Test
    public void cart() {
        driver.get(newUrl);

        LOG.info("Click 'X' button  to close Privacy Policy");
        cartPage.clickClosePrivacy();
        sleep(3000);

        cartPage.verifyCartIsDisplay();
        cartPage.deletePzOne();
        cartPage.typeQuantity(typeQuantity1);
        cartPage.addProductToCart();
        cartPage.openCart();
        cartPage.changeQnty();
        sleep(3000);
        cartPage.addNewQuantity(typeQuantity2);
        sleep(3000);
        cartPage.clickClearButton();
        sleep(3000);



    }
}
