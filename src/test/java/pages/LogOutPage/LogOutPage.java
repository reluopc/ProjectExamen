package pages.LogOutPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LogOutPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.LogOutPage.LogOutPage.class);
    public static pages.LogOutPage.LogOutPage instance;

    private LogOutPage(){

    }

    public static pages.LogOutPage.LogOutPage getInstance() {
        if (instance == null) {
            instance = new pages.LogOutPage.LogOutPage();
        }
        return instance;
    }

    private By closeClickPrivacy = By.xpath("//button[@class='iubenda-cs-close-btn']");
    private By clickLogin = By.id("loginButtonDesktop");
    private By typeEmailField=By.id("emaillogin");
    private By typePasswordField=By.id("passwordlogin");
    private By clickLoginButton=By.id("submit");
    private By clickOnLogOut=By.xpath("//a[@href='https://www.nexths.it/user/logoutrequest']");







    public void clickClosePrivacy()
    {
        LOG.info("Close 'X' button on Privacy popup");
        driver.findElement(closeClickPrivacy).click();
    }

    public void clickOnLoginButton()
    {
        LOG.info("Click 'SignIn' button ");
        driver.findElement(clickLogin).click();
    }

    public void addEmailField(String emailAddress)
    {
        LOG.info("Add Email in'Email' field ");
        driver.findElement(typeEmailField).sendKeys(emailAddress);
    }


    public void addPasswordlField(String password1)
    {
        LOG.info("Add Password in'Password' field ");
        driver.findElement(typePasswordField).sendKeys(password1);
    }

    public void clickLoginButtonTo()
    {
        LOG.info("Click 'Login' button  to enter intro account ");
        driver.findElement(clickLoginButton).click();
    }

    public void clickLogOutButton()
    {
        LOG.info("Click on 'Esci(LogOut)'");
        driver.findElement(clickLogin).click();
    }










}
