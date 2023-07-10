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
        LOG.info("Click 'X' button ");
        hardwareTabPage.clickClosePrivacy();

        LOG.info("Verify if 'Logo' is displayed");
        Assert.assertTrue(hardwareTabPage.verifyLogoHome(), "'Logo' is not displayed");

        LOG.info("Hover on 'COMPUTER TABLET NOTEBOOK'");
        hardwareTabPage.hoverComputerTablet();

        LOG.info("Hover on 'CONSUMABILE ACCESSORI'");
        hardwareTabPage.hoverConsumabileAccessori();

        LOG.info("Hover on 'HARDWARE SOFTWARE'");
        hardwareTabPage.hoverHardwareSoftware();

        LOG.info("Hover on 'MONITOR STAMPANTI PERIFERICHE'");
        hardwareTabPage.hoverMONITORSTAMPANTIPERIFERICHE();


        LOG.info("Hover on 'TELEFONIA WEARABLE'");
        hardwareTabPage.hoverTELEFONIAWEARABLE();

        LOG.info("Hover on 'TV AUDIO VIDEO FOTO HOME'");
        hardwareTabPage.hoverTVAUDIOVIDEOFOTOHOME();


        LOG.info("Click on 'HARDWARE SOFTWARE' ");
        hardwareTabPage.clickHSTabRibbon();

        LOG.info("Click on  'CPU' ");
        hardwareTabPage.clickCPUButton();

        LOG.info("Click on 'Intel' button from 'Brand' category ");
        hardwareTabPage.clickIntelB();

        LOG.info("Click on 'Intel Core i5 ' button from 'CPU' category ");
        hardwareTabPage.clickI5Button();

        LOG.info("Click on '1700 ' button from 'Socket' category ");
        hardwareTabPage.click1700Button();

        LOG.info("Verify if product with code number 'BX8071512600K' it is still available ");
        Assert.assertTrue(hardwareTabPage.verifyProductAvailable(),"'BX8071512600K' it is not available");

        LOG.info("Product with code number 'BX8071512600K' add to Cart");
        hardwareTabPage.addProductToCart();

        LOG.info("Click on 'Scroll to top' button to return back from the ribbon on page ");
        hardwareTabPage.clickScrollTop();
        sleep(1000);



        LOG.info("Choose 'Alimentatori'");
        hardwareTabPage.clickAlimentatori();

        LOG.info("Choose 'Asus'");
        hardwareTabPage.clickAsusBrand();

        LOG.info("Choose '850W'");
        hardwareTabPage.clickWatt();

        LOG.info("Click on 'Asus TUF Gaming 850W Modulare 80+ Gold PFC Attivo ATX'");
        hardwareTabPage.selectAsusTUFGaming850W();
        sleep(1000);

        LOG.info("Click 'Aggiungi al Carrello'");
        hardwareTabPage.clickAggiungiallCarrelloAsusTUFGaming();

    }

}

