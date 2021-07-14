package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {

    /*/
    FindElements will return the List of Web elements then we have to retrieve one by one using list interface


     */

    public static void main (String args[])
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> options =  driver.findElements(By.cssSelector("input[type=radio]"));
        System.out.println("Size of the options is :" +options.size());
        for (int i=0;i<options.size();i++)
        {
            System.out.println(options.get(i).getAttribute("value"));
        }
    }
}
