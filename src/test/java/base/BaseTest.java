package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }
  //  @AfterMethod
   public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
       driver.quit();
    }


}
