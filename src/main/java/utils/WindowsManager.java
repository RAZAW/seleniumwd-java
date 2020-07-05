package utils;

import org.openqa.selenium.WebDriver;

public class WindowsManager {
    private WebDriver driver;

    public WindowsManager (WebDriver driver) {
        this.driver = driver;
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("Window size is " + windows.size());

        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switching to: " +  window);
            driver.switchTo().window(window);

            String pageTitle = driver.getTitle();
            System.out.println("Current window title is " +  pageTitle);

            if (tabTitle.equals(pageTitle)) {
                break;
            }

        }
    }
}
