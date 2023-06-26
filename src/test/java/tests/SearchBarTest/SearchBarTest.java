package tests.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.sleep;


public class SearchBarTest extends BaseTest {
    private static final Logger LOG= LoggerFactory.getLogger(SearchBarTest.class);




    String searchProduct1="AOC Full HD";


    @Test
    public void search(){


        LOG.info("Click 'X' button  to close Privacy Policy");
        searchBarPage.clickClosePrivacy();

        searchBarPage.clickToSearch();

        searchBarPage.searchProduct(searchProduct1);
        sleep(4000);

        searchBarPage.clickBKproduct();

        searchBarPage.clickOnDescriptionTab();
        sleep(2000);

        searchBarPage.clickOnSpecificationsTab();
        sleep(2000);

        searchBarPage.clickOnRecensionTab();
        sleep(3000);

        searchBarPage.clickGuarantyTab();
        sleep(3000);

        searchBarPage.clickOnRetunedTab();
        sleep(3000);
































    }
}
