package reportgeneration;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {

	WebDriver driver;
	WebElement id;
	WebElement pass;
	WebElement btnLogin;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		id=driver.findElement(By.id("txtUsername"));
		pass=driver.findElement(By.id("txtPassword"));
		btnLogin=driver.findElement(By.id("btnLogin"));

	}


	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test(priority = 1)
	public void validUsernameandPassword() throws InterruptedException
	{
		id.sendKeys("Admin");
		pass.sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		btnLogin.click();
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}

	@Test(priority = 2)
	public void invalidUsernameandPassword() throws InterruptedException
	{
		id.sendKeys("abc");
		pass.sendKeys("abc");
		btnLogin.click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@id='divLoginButton']//span")).getText().contains("Invalid credentials"));
	}
	@Test(priority = 3)
	public void blankUsernameandPassword() throws InterruptedException{
		id.sendKeys("");
		pass.sendKeys("");
		btnLogin.click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@id='divLoginButton']//span")).getText().contains("Username cannot be empty"));
	}
	@Test(priority = 4)
	public void noUsernameandPassword() throws InterruptedException{
		//id.sendKeys("");
		//pass.sendKeys("");
		btnLogin.click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@id='divLoginButton']//span")).getText().contains("Username cannot be empty"));
	}
	@Test(priority = 5)
	public void noPassword() throws InterruptedException{
		id.sendKeys("Admin");
		//pass.sendKeys("");
		btnLogin.click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@id='divLoginButton']//span")).getText().contains("Password cannot be empty"));
	}



}