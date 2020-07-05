package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By fileUploadForm = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFileName = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickFileUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absoluteFilePath) {
        driver.findElement(fileUploadForm).sendKeys(absoluteFilePath);
        clickFileUploadButton();
    }

    public String getUploadedFileName() {
        return driver.findElement(uploadedFileName).getText();
    }


}
