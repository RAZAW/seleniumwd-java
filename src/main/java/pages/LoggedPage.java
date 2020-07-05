package pages;

import basepages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedPage extends BasePage {

    private WebDriver driver;

    private By confirmationMessage = By.id("flash");

    public LoggedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getConfirmation() {
        String msg;
        msg = driver.findElement(confirmationMessage).getText();
        return msg;
    }
}
