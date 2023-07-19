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
    private By clickOnAOCBK=By.id("C24G2AE");
    private By clickDescription=By.xpath("//a[@href='#descrizione']");
    private By clickSpecification=By.xpath("//a[@href='#schedatecnica']");
    private By clickRecension=By.xpath("//a[@href='#recensioni']");
    private By clickGuaranty=By.xpath("//a[@href='#garanzia']");
    private By clickRetuned=By.xpath("//a[@href='#recesso']");
    private By deleteOnePz=By.xpath("//input[@value='1']");
    private By chooseQuantity=By.id("setqtycart");
    private By clickaddToCart=By.xpath("//a[@class='btn btn-first greennext']");

    private By selectGigabyte=By.xpath("//a[@href='https://www.nexths.it/products/getSkuFromLev/query/Scheda%20Video/filterBrand/Gigabyte/page/1']");
    private By clickONRTX3070=By.xpath("//img[@src='https://cdn.nexths.it/scheda_prodotto/image/4719331309404.jpg']");
    private By addToCart=By.xpath("//a[@class='btn btn-first greennext']");

    private By selectBrand=By.xpath("//a[@href='https://www.nexths.it/products/getSkuFromLev/query/Case/filterBrand/Corsair/page/1']/span");
    private By nextpage=By.xpath("/html/body/div[10]/div/div[2]/div/div[35]/a[1]");
    private By cc9011191ww=By.id("CC-9011191-WW");
    private By clickPhoto=By.xpath("//img[@src='https://cdn.nexths.it/scheda_prodotto/image/low/cc-9011191-ww.jpg']");
    private By nextPhoto=By.xpath("//a[@class='glyphicon glyphicon-chevron-right']");
    private By closeXbutton=By.xpath("//div[@class='ekko-lightbox modal fade in']//button[@class='close']");
    private By AddCartCase=By.xpath("//a[@class='btn btn-first greennext']");






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

    public void searchProduct (String AOC)
    {
        LOG.info("Searching product in 'Cerca prodotti o marca'");
        driver.findElement(typeProduct).sendKeys(AOC);
        driver.findElement(typeProduct).sendKeys(Keys.ENTER);
    }

    public void clickBKproduct()
    {
        LOG.info("Select product 'AOC C24G2AE/BK Monitor Curvo 24\" VA 165Hz FullHD 1ms Multimediale FreeSync VGA/HDMI/DP'");
        driver.findElement(clickOnAOCBK).click();
    }


    public  void clickOnDESCRIZIONETab()
    {
        LOG.info("Click on 'DESCRIZIONE ' tab ");
        driver.findElement(clickDescription).click();
    }


    public void clickOnSCHEDATECNICATab()
    {
        LOG.info("Click on 'SCHEDA TECNICA'tab ");
        driver.findElement(clickSpecification).click();
    }

    public void clickOnRECENSIONITab()
    {
        LOG.info("Click on 'RECENSIONI'tab ");
        driver.findElement(clickRecension).click();
    }

    public void clickGARANZIATAB()
    {
        LOG.info("Click on 'GARANZIA'tab ");
        driver.findElement(clickGuaranty).click();
    }

    public void clickOnRESOFACILETab()
    {
        LOG.info("Click on 'RESO FACILE'tab ");
        driver.findElement(clickRetuned).click();
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


    public void searchProduct2 (String searchProduct2)
    {
        LOG.info("Searching product in 'Cerca prodotti o marca'");
        driver.findElement(typeProduct).sendKeys(searchProduct2);
        driver.findElement(typeProduct).sendKeys(Keys.ENTER);
    }

    public void clickGigabyteRTX()
    {
        LOG.info("Click on 'Gigabyte 'button left side from category 'Brand'");
        driver.findElement(selectGigabyte).click();
    }


    public void clickGigabyteGVn30()
    {
        LOG.info("Click on  number product 'GV-N3070GAMING OC-8GD 2.0'");
        driver.findElement(clickONRTX3070).click();
    }
    public void addCartGV()
    {
        LOG.info("Click on 'Aggiungi al Carrello' button to add product in cart ");
        driver.findElement(addToCart).click();
    }

    public void searchCase (String Case)
    {
        LOG.info("Search product in 'Cerca prodotti o marca'");
        driver.findElement(typeProduct).sendKeys(Case);
        driver.findElement(typeProduct).sendKeys(Keys.ENTER);
    }

    public void clickBrand()
    {
        LOG.info("Click on 'Corsair'from 'Brand'category");
        driver.findElement(selectBrand).click();
    }
    public void  clickPaginaSuccesiva()
    {
        LOG.info("Click on 'Pagina Successiva' to go next page");
        driver.findElement(nextpage).click();
    }

    public void clickCaseCC9011191ww()
    {
        LOG.info("Click on 'Corsair iCUE 220T RGB Middle Tower'");
        driver.findElement(cc9011191ww).click();
    }

    public void clickViewPhotos()
    {
        LOG.info("Click on'Pictures'of the Corsair iCUE");
        driver.findElement(clickPhoto).click();
    }

    public void clickNextPhotos()
    {
        LOG.info("Click on 'Next'photo");
        driver.findElement(nextPhoto).click();
    }

    public void pressXbutton()
    {
        LOG.info("Click 'X' button to close page with photos ");
        driver.findElement(closeXbutton).click();
    }

    public void clickAggiungialCarrello()
    {
        LOG.info("Click 'Aggiungi al Carrello' ");
        driver.findElement(AddCartCase).click();
    }




















}
