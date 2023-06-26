package pages.SearchBarPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SearchBarPage extends BasePage {
    public static final Logger LOG= LoggerFactory.getLogger(SearchBarPage.class);
    public static SearchBarPage instance;

    private SearchBarPage(){

    }

    public static SearchBarPage getInstance() {
        if (instance == null) {
            instance = new SearchBarPage();
        }
        return instance;
    }

    private By closeClickPrivacy = By.xpath("//button[@class='iubenda-cs-close-btn']");
    private By clickSearchBar= By.xpath("//input[@placeholder='Cerca prodotti o marca']");
    private By typeProduct=By.xpath("//input[@placeholder='Cerca prodotti o marca']");
    private By clickOnAOCBK=By.xpath("//img[@alt='24G2ZU/BK']");
    private By clickDescription=By.xpath("//a[@href='#descrizione']");
    private By clickSpecification=By.xpath("//a[@href='#schedatecnica']");
    private By clickRecension=By.xpath("//a[@href='#recensioni']");
    private By clickGuaranty=By.xpath("//a[@href='#garanzia']");
    private By clickRetuned=By.xpath("//a[@href='#recesso']");





    public void clickClosePrivacy()
    {
        LOG.info("Close 'X' button on Privacy popup");
        driver.findElement(closeClickPrivacy).click();
    }

    public void clickToSearch()
    {
       LOG.info("Click on 'Cerca prodotti o marca'");
       driver.findElement(clickSearchBar).click();
    }

    public void searchProduct (String AOC) {
        LOG.info("Searching product in 'Cerca prodotti o marca'");
        driver.findElement(typeProduct).sendKeys(AOC);
        driver.findElement(typeProduct).sendKeys(Keys.ENTER);
    }

    public void clickBKproduct()
    {
        LOG.info("Select product 'AOC 24G2ZU/BK Monitor 23.8\" IPS 240Hz FullHD 1ms FreeSync Multimediale USB HDMI/DP'");
        driver.findElement(clickOnAOCBK).click();
    }

    public  void clickOnDescriptionTab()
    {
        LOG.info("Click on 'DESCRIZIONE ' tab ");
        driver.findElement(clickDescription).click();
    }

    public void clickOnSpecificationsTab()
    {
        LOG.info("Click on 'SCHEDA TECNICA'tab ");
        driver.findElement(clickSpecification).click();
    }

    public void clickOnRecensionTab()
    {
        LOG.info("Click on 'RECENSIONI'tab ");
        driver.findElement(clickRecension).click();
    }

    public void clickGuarantyTab()
    {
        LOG.info("Click on 'GARANZIA'tab ");
        driver.findElement(clickGuaranty).click();
    }

    public void clickOnRetunedTab()
    {
        LOG.info("Click on 'RESO FACILE'tab ");
        driver.findElement(clickRetuned).click();
    }















}
