package reportgeneration;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript2 {

	@Test
	public void maintttt() {
		ChromeDriver driver= new ChromeDriver();


		//FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://ineuron-courses.vercel.app/login");
		WebElement username=driver.findElement(By.name("email1"));
		username.sendKeys("SapientTraining@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		driver.findElement(By.className("submit-btn")).click();
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("https://ineuron-courses.vercel.app/login"));
		driver.quit();
	}

}
