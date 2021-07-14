package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HtmlDynanicWebTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        List<WebElement> findvalue = driver.findElements(By.xpath("//td[text()='Ernst Handel']//following-sibling::td"));
        for(int i=0;i<findvalue.size();i++)
        {
            System.out.println(findvalue.get(i).getText());
        }

    }
}
