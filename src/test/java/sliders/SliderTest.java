package sliders;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTests {

    @Test
    public void testHorizontalSlider() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.dragHorizonralSliderRight("4");
        assertEquals(horizontalSliderPage.getHorizontalSliderRange(), "4", "Range is not intended");
    }

}
