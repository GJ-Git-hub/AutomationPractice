package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

/***
 * build() method in Actions class is use to create chain of action or operation you want to perform.
 * perform() this method in Actions Class is use to execute chain of action which are build
 * using Action build method.
 */


public class ActionsClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        HashMap<String, Object> chromePref = new HashMap<>();
        chromePref.put("profile.default_content_settins.popups", 0);
        //chromePref.put("download.default_directory", OUTPUT_FOLDER_Config.getAbsolutePath());
        chromePref.put("safebrowsing.enabled", "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("prefs", chromePref);
        dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        dc.setCapability(ChromeOptions.CAPABILITY, options);
        options.setCapability("chrome.switches", "--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);


        driver.get("http://demo.guru99.com/test/newtours/");
        WebElement link_Home = driver.findElement(By.linkText("Home"));

        Actions builder = new Actions(driver);

        Action act = builder.moveToElement(link_Home).build();


    }
}
