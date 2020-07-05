package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.LargeAndDeepDomPage;

import static org.testng.Assert.assertEquals;

import java.util.List;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeepDom();
        largeAndDeepDomPage.scrollToTable();
    }

    @Test
    public void testSettingMultiple() throws InterruptedException {
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.setMultiple();
        dropdownPage.selectFromDropdown("Option 1");
        dropdownPage.selectFromDropdown("Option 2");
        List<String> selectedElements = dropdownPage.getAllSelectedOptions();
        assertEquals(selectedElements.get(0), "Option 1", "First selected option does not match");
        assertEquals(selectedElements.get(1), "Option 2", "Second selected option does not match");
    }

}
