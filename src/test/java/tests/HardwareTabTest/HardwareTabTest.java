package tests.HardwareTabTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.sleep;

public class HardwareTabTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(tests.HardwareTabTest.HardwareTabTest.class);


    @Test
    public void search()
    {
        LOG.info("Click 'X' button  to close Privacy Policy");
        hardwareTabPage.clickClosePrivacy();

        LOG.info("Verify if 'Logo' from the page is displayed");
        Assert.assertTrue(hardwareTabPage.verifyLogoHome(), "'Logo' is not displayed");

        LOG.info("Click on 'HARDWARE SOFTWARE 'tab from the ribbon ");
        hardwareTabPage.clickHSTabRibbon();


        LOG.info("Click on  'CPU' button category from the list ");
        hardwareTabPage.clickCPUButton();

        LOG.info("Click on 'Intel' button from left side 'Brand' category ");
        hardwareTabPage.clickIntelB();

        LOG.info("Click on 'Intel Core i5 ' button from left side 'CPU' category ");
        hardwareTabPage.clickI5Button();

        LOG.info("Click on '1700 ' button from left side 'Socket' category ");
        hardwareTabPage.click1700Button();

        LOG.info("Verify if product with code number 'BX8071512600K' it is still available ");
        Assert.assertTrue(hardwareTabPage.verifyProductAvailable(),"'BX8071512600K' it is not available");

        LOG.info("Product with code number 'BX8071512600K' add to Cart");
        hardwareTabPage.addProductToCart();

        LOG.info("Click on  'Scroll to top' button to return back from the ribbon on page ");
        hardwareTabPage.clickScrollTop();


    }

}

