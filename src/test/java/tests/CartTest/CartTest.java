package tests.CartTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class CartTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(tests.CartTest.CartTest.class);
    private String newUrl = getBaseUrl() + "/Shopcart/ShowCart";



    @Test
    public void cart() {
        driver.get(newUrl);

        LOG.info("Click 'X' button  to close Privacy Policy");
        cartPage.clickClosePrivacy();

        LOG.info("Verify if 'Cart' it is display on home page ");
        cartPage.verifyCartIsDisplay();

        LOG.info("Click on 'Cart' button to open  ");
        cartPage.openCart();
        sleep(3000);

    }
}
