package SeleniumPractice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericDropDownHandle {
    static WebDriver driver;

    public static WebElement getElement(By locator)
    {
        return driver.findElement(locator);
    }

    public static void doSelectByVisibleText(By locator, String value)
    {
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(value);
    }

    public static void doSelectByIndex(By locator, int index)
    {
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public static void doSelectDropDownValue(By locator, String value)
    {
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }

    public static void selectDropDownvalue(By locator, String type, String value)
    {
        Select select = new Select(getElement(locator));

        switch(type) {

            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;

            case "value":
                select.selectByValue(value);
                break;

            case "visibleText":
                select.selectByVisibleText(value);
                break;

                default:
                    System.out.println("please pass the correct selection");
                    break;
        }

    }


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

        By industry = By.xpath("//select[@id='Form_submitForm_Industry']");
        By country = By.xpath("//select[@id='Form_submitForm_Country']");

        // we insert the dropdown from enum class

        selectDropDownvalue(country,DropDown.INDEX.toString(),"5");



    }
}
