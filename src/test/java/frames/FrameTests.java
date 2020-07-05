package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.frames.FramesPage;
import pages.frames.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrames() {

        var framesPage = homePage.clickFramesLink();
        var nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.switchToLeftFrameAndGetText(), "LEFT", "Left frame message is incorrect");
        assertEquals(nestedFramesPage.switchToRightFrameAndGetText(), "BOTTOM", "Bottom frame message is incorrect");

    }


}
