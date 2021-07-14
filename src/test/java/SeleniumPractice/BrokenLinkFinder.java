package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinkFinder {

    public static void main(String args[]) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guru99.com/");
        List<WebElement> listOfTheLink = driver.findElements(By.tagName("a"));
        System.out.println("Size of the link on webPage ==========> " + listOfTheLink.size());
        // add the imag tag as well in the list
        listOfTheLink.addAll(driver.findElements(By.tagName("img")));
        System.out.println("After add Imeges total count of links are  ==========> " + listOfTheLink.size());


        // check the valid Linke with are having href attribute only
        List<WebElement> activeLinks = new ArrayList<WebElement>();
        for (int i = 0; i < listOfTheLink.size(); i++) {
            //System.out.println(listOfTheLink.get(i).getAttribute("href"));
            if (listOfTheLink.get(i).getAttribute("href") != null && (!listOfTheLink.get(i).getAttribute("href").contains("javascript")))

                activeLinks.add(listOfTheLink.get(i));

        }

        System.out.println("List of the vlaid Links  ==========> " + activeLinks.size());

        //Check the URL of valid connection using httpConnection API

        for (int j = 0; j < activeLinks.size(); j++) {
            HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
            connection.connect();
            int respose = connection.getResponseCode();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href") + "===========>" + respose);
        }
        driver.close();

    }
}
