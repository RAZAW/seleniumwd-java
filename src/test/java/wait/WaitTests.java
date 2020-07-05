package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.loading.DynamicLoadingExample1Page;
import pages.loading.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testDynamicLoading() {
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        DynamicLoadingExample1Page dynamicLoadingExample1Page = dynamicLoadingPage.clickExample1();
        dynamicLoadingExample1Page.clickStartButtton();
        assertEquals(dynamicLoadingExample1Page.getHelloWorldText(), "Hello World!", "text does not match");
    }
}
