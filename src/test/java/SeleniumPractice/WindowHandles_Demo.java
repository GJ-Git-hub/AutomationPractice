package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles_Demo {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        Set<String> windiows = driver.getWindowHandles();
        Iterator<String> it = windiows.iterator();

        String parentWindowid = it.next();

        System.out.println(parentWindowid);

        String childWindowId = it.next();
        System.out.println(childWindowId);

        driver.switchTo().window(childWindowId);
        Thread.sleep(2000);

        System.out.println("Child windows POP up " +driver.getTitle());
        System.out.println("Before Close " +driver);
        driver.close();
        System.out.println("\"After Close" +driver);

        driver.switchTo().window(parentWindowid);
        System.out.println(driver);




    }
}
