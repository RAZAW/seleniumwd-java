package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSlider = By.cssSelector("#content>div>div>input");
    private By horizontalSliderRange = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragHorizonralSliderRight(String value) {
        while (!getHorizontalSliderRange().equals(value)) {
            driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getHorizontalSliderRange() {
        return driver.findElement(horizontalSliderRange).getText();
    }


}
