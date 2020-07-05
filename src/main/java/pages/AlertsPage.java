package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    //elements on the page
    private By clickJSAlert = By.xpath("//button[text()='Click for JS Alert']");
    private By resultMessage = By.id("result");
    private By clickJSConfirm = By.xpath("//button[text()='Click for JS Confirm']");
    private By clickJSPrompt = By.xpath("//button[text()='Click for JS Prompt']");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(clickJSAlert).click();
    }

    public void triggerJSConfirmAlert() {
        driver.findElement(clickJSConfirm).click();
    }

    public void triggerJSPromptAlert() {
        driver.findElement(clickJSPrompt).click();
    }

    public void acceptAlert() {
        Alert alertBox = driver.switchTo().alert();
        alertBox.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void setInputAlert(String input) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(input);
    }

    public String getJSPromptText() {
        return driver.findElement(resultMessage).getText();
    }

    public String getJSConfirmText() {
        return driver.switchTo().alert().getText();
    }

    public String getResultText() {
        return driver.findElement(resultMessage).getText();
    }


}
