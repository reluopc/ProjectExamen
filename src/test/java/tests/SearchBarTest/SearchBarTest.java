package tests.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.sleep;


public class SearchBarTest extends BaseTest {
    private static final Logger LOG= LoggerFactory.getLogger(SearchBarTest.class);




    String searchProduct1="AOC Full HD";
    String typeQuantity1="3";
    String searchProduct2="Scheda Video";





    @Test
    public void search(){


        LOG.info("Click 'X' button  to close Privacy Policy");
        searchBarPage.clickClosePrivacy();

        LOG.info("Click on search bar 'Cerca produtti o marca' ");
        searchBarPage.clickToSearch();

        LOG.info("Type 'AOC Full HD' ");
        searchBarPage.searchProduct(searchProduct1);

        LOG.info("Click on'AOC 24G2ZU/BK Monitor' ");
        searchBarPage.clickBKproduct();

        LOG.info("Click on 'DESCRIZIONE' ");
        searchBarPage.clickOnDESCRIZIONETab();

        LOG.info("Click on 'SCHEMA TECNICA'");
        searchBarPage.clickOnSCHEDATECNICATab();

        LOG.info("Click on 'RECENSIONI' ");
        searchBarPage.clickOnRECENSIONITab();

        LOG.info("Click on 'GARANZIA' ");
        searchBarPage.clickGARANZIATAB();

        LOG.info("Click on'RESO FACILE' ");
        searchBarPage.clickOnRESOFACILETab();

        LOG.info("Delete '1' from 'Pz' text field");
        searchBarPage.deletePzOne();

        LOG.info("Type '3' in text field ");
        searchBarPage.typeQuantity(typeQuantity1);

        LOG.info("Click on'Aggiungi al Carrello' ");
        searchBarPage.addProductToCart();

        LOG.info("Click again on search bar 'Cerca produtti o marca' ");
        searchBarPage.clickToSearch();

        LOG.info("Type 'Scheda Video' ");
        searchBarPage.searchProduct2(searchProduct2);
        sleep(3000);

        LOG.info("Click 'Gigabyte' button  ");
        searchBarPage.clickGigabyteRTX();
        sleep(3000);

        LOG.info(" Click  on  'GV-N3070GAMING OC-8GD 2.0' ");
        searchBarPage.clickGigabyteGVn30();
        sleep(3000);







































    }
}
