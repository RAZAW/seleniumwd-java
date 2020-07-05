package pages.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;

    private By nestedFrames = By.cssSelector("#content li:nth-child(1) a");
    private By iFrame = By.cssSelector("#content li:nth-child(2) a");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames() {
        driver.findElement(nestedFrames).click();
        return new NestedFramesPage(driver);
    }


}
