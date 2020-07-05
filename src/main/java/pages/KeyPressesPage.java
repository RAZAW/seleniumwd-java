package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputKeys = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(inputKeys).sendKeys(text);
    }

    public String checkResult() {
        return driver.findElement(resultText).getText();

    }

    public void enterPi() {
        enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }


}
