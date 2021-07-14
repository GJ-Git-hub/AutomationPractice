package OfflineProject;


import SeleniumPractice.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupOfflineApplication {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir");
        String url = path + "/src/main/Application/EHS.html";
        System.out.println(url);
        driver.get(url);


    }
}
