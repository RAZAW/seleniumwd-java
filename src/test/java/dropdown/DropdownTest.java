package dropdown;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {

    @Test
    public void testDropdownField() {
        var dropdownPage = homePage.clickDropdownLink();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOption = dropdownPage.getAllSelectedOptions();
        assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOption.contains(option));
    }
}
