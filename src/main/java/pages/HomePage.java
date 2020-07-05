package pages;

import basepages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.frames.FramesPage;
import pages.loading.DynamicLoadingPage;

public class HomePage extends BasePage {

    private WebDriver driver;

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By hoversLink = By.linkText("Hovers");
    private By fileUploadLink = By.linkText("File Upload");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {

        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink() {
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);

    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHoversPageLink() {
        clickLinkByText("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPress() {
        clickLinkByText("Key Presses");
        return new KeyPressesPage(driver);
    }

    private void clickLinkByText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    private void clickByPartialLinkText(String partialLinkText) {
        driver.findElement(By.partialLinkText(partialLinkText)).click();
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLinkByText("Horizontal Slider");
        return new HorizontalSliderPage(driver);

    }

    public AlertsPage clickJSAlerts() {
        clickByPartialLinkText("Alert");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickOnFileUpload() {
        clickLinkByText("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenuLink() {
        clickLinkByText("Context Menu");
        return new ContextMenuPage(driver);
    }

    public FramesPage clickFramesLink() {
        clickLinkByText("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLinkByText("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom() {
        clickLinkByText("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsLink() {
        clickLinkByText("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

}
