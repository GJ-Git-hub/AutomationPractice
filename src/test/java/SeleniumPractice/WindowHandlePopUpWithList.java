package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlePopUpWithList {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();

        Set<String> handles = driver.getWindowHandles();

        List<String> handlesList = new ArrayList<String>(handles);

        String parentWindowId = handlesList.get(0);
        String childWindowId = handlesList.get(1);

        driver.switchTo().window(childWindowId);
        System.out.println("child window title is : " + driver.getTitle());

        driver.close();//close the pop up

        driver.switchTo().window(parentWindowId);
        System.out.println("parent window title is : " + driver.getTitle());

        driver.quit();

    }
}
