package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/***
 * build() method in Actions class is use to create chain of action or operation you want to perform.
 * perform() this method in Actions Class is use to execute chain of action which are build
 * using Action build method.
 */


public class ActionsClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/newtours/");
        WebElement link_Home = driver.findElement(By.linkText("Home"));

        Actions builder = new Actions(driver);

        Action act = builder.moveToElement(link_Home).build();


    }
}
