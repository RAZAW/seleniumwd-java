package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordResetPage {

    private WebDriver driver;

    private By passwordResetMessage = By.id("content");

    public PasswordResetPage(WebDriver driver) {
        this.driver = driver;
    }

    public String testPasswordSuccessfullySaved() {
        return driver.findElement(passwordResetMessage).getText();
    }
}
