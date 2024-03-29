package pages.loading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;

    private String partialLinkTextExamples = ".//a[contains(text(), '%s')]";
    private By link_example1 = By.xpath(String.format(partialLinkTextExamples, "Example 1"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(link_example1).click();
        return new DynamicLoadingExample1Page(driver);
    }
}
