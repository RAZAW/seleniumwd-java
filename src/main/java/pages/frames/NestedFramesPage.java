package pages.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    public String topFrame = "frame-top";
    public String leftFrame = "frame-left";
    public String bottomFrame = "frame-bottom";

    public By leftFrameBody = By.tagName("body");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String switchToLeftFrameAndGetText() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;

    }

    public String switchToRightFrameAndGetText() {
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }

    private String getFrameText() {
        return driver.findElement(leftFrameBody).getText();
    }

}
