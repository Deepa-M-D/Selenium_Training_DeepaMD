package reportgeneration;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript {

	@Test
	public void mainrr() {


		ChromeDriver driver=new ChromeDriver();
		//		FirefoxDriver driver1=new FirefoxDriver();
		//		EdgeDriver driver2=new EdgeDriver();

		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Deepa Dandin");

		String title=driver.getTitle();
		System.out.println("Title is "+ title);
		String url = driver.getCurrentUrl();
		System.out.println("URL is "+url);
		//driver.quit();

		//		String title1=driver1.getTitle();
		//		System.out.println("Title is "+ title);
		//		String url1 = driver1.getCurrentUrl();
		//		System.out.println("URL is "+url1);
		//
		//		String title2=driver2.getTitle();
		//		System.out.println("Title is "+ title);
		//		String url2 = driver2.getCurrentUrl();
		//		System.out.println("URL is "+url2);
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("google.com"));
		driver.quit();


	}

}
