package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testKeyBackSpace() {
        var keyPressPage = homePage.clickKeyPress();
        keyPressPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressPage.checkResult(),"You entered: BACK_SPACE", "The text does not match");
    }

    @Test
    public void testPi() {
        var keyPressPage = homePage.clickKeyPress();
        keyPressPage.enterPi();
        assertEquals(keyPressPage.checkResult(), "You entered: 4", "pi was not entered");
    }
}
