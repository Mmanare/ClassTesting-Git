package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {
   LoginPage loginPage = new LoginPage(driver);
   loginPage.enterUsername("standard_user");
   loginPage.enterPassword("secret_sauce");
   loginPage.clickloginButton();

   // Assertions
   //     Assert.assertTru(driver.findElement(
   //             By.id("Welcome message")
    //    ))
    }

}
