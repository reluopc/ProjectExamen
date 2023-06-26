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
        sleep(2000);

        Assert.assertTrue(hardwareTabPage.verifyLogoHome(), "'Logo' is not displayed");

        hardwareTabPage.clickHSTabRibbon();

        hardwareTabPage.clickCPUButton();

        hardwareTabPage.clickIntelB();

        hardwareTabPage.clickI5Button();
        sleep(2000);

        hardwareTabPage.click1700Button();
        sleep(2000);

        Assert.assertTrue(hardwareTabPage.verifyProductAvailable(),"'BX8071512600K' it is not available");
        sleep(2000);

        hardwareTabPage.addProductToCart();
        sleep(2000);

        hardwareTabPage.clickScrollTop();
        sleep(2000);

    }

}

