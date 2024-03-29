package day5;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SeleniumGridDemo {
    WebDriver driver;
    
    
    @BeforeTest
    public void setup() {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("os", "Android");
        capabilities.setCapability("osVersion","13.0" );
        capabilities.setCapability("deviceName", "Google Pixel 7 Pro");
        // capabilities.setCapability("browserName","Chrome" );
        //capabilities.setCapability("browserVersion","latest-beta" );
        
        
        URL url=null;
        try {
            url = new URL("https://deepadandin_OFnAaC:Zcjh7xaUzMxgEct5T2Hi@hub-cloud.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
          driver=new RemoteWebDriver(url,capabilities);
        
    }
    
	@AfterMethod
    public void tearDown() {
        driver.quit();
    }
  @Test
  public void ineuron() {
      driver.get("https://ineuron-courses.vercel.app/login");
      AssertJUnit.assertTrue(driver.getCurrentUrl().contains("https://ineuron-courses.vercel.app/login"));
  }
}