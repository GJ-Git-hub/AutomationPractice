package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebdriverLisnerUsingAbstarctClass extends AbstractWebDriverEventListener {

    @Override
    public void afterAlertAccept(WebDriver driver) {
        super.afterAlertAccept(driver);
    }
}
