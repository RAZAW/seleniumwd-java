package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MultipleWindowsPage;

import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTests {

    @Test
    public void testSwitchTab() {
        MultipleWindowsPage multipleWindowsPage = homePage.clickMultipleWindowsLink();
        multipleWindowsPage.clickHere();
        getWindowManager().switchToTab("New Window");
        //assertEquals(multipleWindowsPage.getNewWindowHeader(), "New Window", "Header does not match");
    }

    

}
