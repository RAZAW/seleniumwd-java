package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {

    @Test
    public void testHoversOnHoverPage() {
        var hoversPage = homePage.clickHoversPageLink();
        var figureCaption = hoversPage.hoverOverFigure1(1);
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(figureCaption.getTitle(), "name: user1", "Title does not match");
        assertEquals(figureCaption.getLinkText(), "View profile", "Link title does not match");
        assertTrue(figureCaption.getLink().endsWith("/users/1"), "Does not end with /users/1");
    }
}
