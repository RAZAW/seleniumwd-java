package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.ContextMenuPage;
import pages.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTests {

    @Test
    public void testJSAcceptAlert() {
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResultText(), "You successfuly clicked an alert", "Result is incorrect");

    }

    @Test
    public void testJSConfirmDismissAlert() {
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerJSConfirmAlert();
        String alertText = alertsPage.getJSConfirmText();
        alertsPage.dismissAlert();
        assertEquals(alertText, "I am a JS Confirm", "Alert text does not match");
    }

    @Test
    public void testJSConfirmSetInputAlert() {
        AlertsPage alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerJSPromptAlert();
        String input = "TAU Rocks!";
        alertsPage.setInputAlert(input);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getJSPromptText(), "You entered: " + input, "Result text does not match");
    }

    @Test
    public void testContextMenuAlert() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.rightClickOnhotSpotBox();
        assertTrue(contextMenuPage.getAlertText().contains("You selected a context menu"), "Does not contain expected string");
        contextMenuPage.acceptAlert();
    }
}
