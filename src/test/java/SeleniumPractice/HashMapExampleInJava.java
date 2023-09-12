package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class HashMapExampleInJava {

    /*
    we can user hashmap in our framework when there is need to define user credentials role based
     */
    WebDriver driver;
    String user;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/index.html");
    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }

    @Test
    public void validlogin() {
        user = loginCredesials().get("valid");
        System.out.println(user);
        driver.findElement(By.cssSelector("#signin_button")).click();
        driver.findElement(By.cssSelector("#user_login")).sendKeys(user.split(":")[0]);
        driver.findElement(By.cssSelector("#user_password")).sendKeys(user.split(":")[1]);
        driver.findElement(By.cssSelector("input[name='submit']")).click();


    }

    @Test
    public void InValidlogin() {
        user = loginCredesials().get("Invalid");
        System.out.println(user);

        driver.findElement(By.cssSelector("#signin_button")).click();
        driver.findElement(By.cssSelector("#user_login")).sendKeys(user.split(":")[0]);
        driver.findElement(By.cssSelector("#user_password")).sendKeys(user.split(":")[1]);
        driver.findElement(By.cssSelector("input[name='submit']")).click();


    }

    public HashMap<String, String> loginCredesials() {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("valid", "username:password");
        userMap.put("Invalid", "Gauri:Jawalekar");
        return userMap;
    }


}
