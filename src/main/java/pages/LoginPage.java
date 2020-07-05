package pages;

import basepages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private WebDriver driver;

    private By userName = By.id("username");
    private By passWord = By.id("password");
    private By formSubmit = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoggedPage fillOutForm(String user, String pw) {
        driver.findElement(userName).sendKeys(user);
        driver.findElement(passWord).sendKeys(pw);
        driver.findElement(formSubmit).submit();
        return new LoggedPage(driver);
    }
}
