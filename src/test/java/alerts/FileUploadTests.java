package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.clickOnFileUpload();
        fileUploadPage.uploadFile("/Users/waqasraza/seleniumwd-java/src/test/resources/test-upload.doc");
        assertEquals(fileUploadPage.getUploadedFileName(), "test-upload.doc", "Uploaded file name is different");
    }
}
