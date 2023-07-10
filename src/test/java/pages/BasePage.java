package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);

    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver114.0.5735.90.exe");
        driver = new ChromeDriver();
        String url = "https://www.nexths.it";
        driver.get(url);

        Dimension dimension = new Dimension(1920,1080);
        driver.manage().window().setSize(dimension);
    }

    public static void tearDown() {
        LOG.info("Close  the browser");
        driver.quit();

    }


    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String returnBaseUrl() {
        return "https://www.nexths.it";
    }

    public static String getBaseUrl() {
        String baseurl = returnBaseUrl();
        if (baseurl != null) {
            return baseurl.replace("", "");
        }
        return baseurl;
    }


}
