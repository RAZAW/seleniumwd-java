package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    private By emailAddressField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public PasswordResetPage sendForgetPasswordRequest(String email) {
        driver.findElement(emailAddressField).sendKeys(email);
        driver.findElement(retrievePasswordButton).submit();
        return new PasswordResetPage(driver);
    }
}
