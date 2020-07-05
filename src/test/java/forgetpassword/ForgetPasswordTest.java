package forgetpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.PasswordResetPage;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTest extends BaseTests {

    @Test
    public void testSuccessfulPasswordForget() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordLink();
        PasswordResetPage passwordResetPage =
                forgotPasswordPage.sendForgetPasswordRequest("tau@example.com");
        assertTrue(passwordResetPage.testPasswordSuccessfullySaved().contains("Your e-mail's been sent!"));
    }
}
