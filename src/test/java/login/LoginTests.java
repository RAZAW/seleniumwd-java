package login;

import base.BaseTests;
import basepages.BasePage;
import org.testng.annotations.Test;
import pages.LoggedPage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

   @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        LoggedPage loggedPage = loginPage.fillOutForm("tomsmith", "SuperSecretPassword!");
        assertTrue(loggedPage.getConfirmation().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }


}
