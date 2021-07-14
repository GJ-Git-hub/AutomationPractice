package SeleniumPractice;

import groovy.json.JsonOutput;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "SearchProvider")
    public void googleSearch(String key1, String key2, String key3,String key4, String key5, String key6) {

        System.out.println(key1+" "+key2 +" " +key3+" "+key4+" "+key5+" " +key6);


    }

    @DataProvider(name = "SearchProvider")
    public Object[][] getDataFromDataprovider() {
        return new Object[][]
                {
                        {"India", "UK", "Sweden","India", "UK", "Sweden"},
                        {"India1", "UK2", "Sweden3","India1", "UK2", "Sweden3"},

                };

    }

}
