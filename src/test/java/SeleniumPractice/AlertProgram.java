package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;

public class AlertProgram {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("submit")).click();

        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.dismiss();
        alert.sendKeys("jayant");
        alert.accept();
        Thread.sleep(2000);
        alert.accept();


        Actions Builder = new Actions(driver);



    }
}
