package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.CartPage.CartPage;
import pages.HardwareTabPage.HardwareTabPage;
import pages.LogOutPage.LogOutPage;
import pages.SearchBarPage.SearchBarPage;
import pages.SignInPage.SignInPage;


public class BaseTest {
    public SignInPage signInPage =SignInPage.getInstance();
    public SearchBarPage searchBarPage = SearchBarPage.getInstance();
    public CartPage cartPage = CartPage.getInstance();
    public LogOutPage logOutPage=LogOutPage.getInstance();
    public HardwareTabPage hardwareTabPage=HardwareTabPage.getInstance();




    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }


}
