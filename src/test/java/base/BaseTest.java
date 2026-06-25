package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }
  //  @AfterMethod
    public void tearDown() throws InterruptedException {
         Thread.sleep(1000);
        driver.quit();
     }


}
