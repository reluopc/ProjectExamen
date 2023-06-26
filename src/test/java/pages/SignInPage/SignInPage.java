package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;


    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }


    private By loginIsDispalyed = By.id("loginButtonDesktop");
    private By closeClickPrivacy = By.xpath("//button[@class='iubenda-cs-close-btn']");
    private By clickLogin = By.id("loginButtonDesktop");
    private By typeEmailField=By.id("emaillogin");
    private By typePasswordField=By.id("passwordlogin");
    private By clickLoginButton=By.id("submit");


    //Metods
    public boolean isLogInButtonDisplayed()
    {
        LOG.info("Verify if 'Login' button is displayed");
        return driver.findElement(loginIsDispalyed).isDisplayed();
    }

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
}



