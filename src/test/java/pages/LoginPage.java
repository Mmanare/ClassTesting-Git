package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private static WebDriver driver;

    //Define Locators for Login page elements
    private By usernameField = By.xpath("//*[@id=\"user-name\"]");
    private static By passwordField = By.xpath("//*[@id=\"password\"]");
    private static By loginButton = By.xpath("//*[@id=\"login-button\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // Actions

    public void enterUsername(String username) {
        //driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }
    public static void enterPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickloginButton(){
        driver.findElement(loginButton).click();
    }
}


