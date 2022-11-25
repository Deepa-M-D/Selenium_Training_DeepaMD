package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ShadowDom {
	@Test
	public void mainyy() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.cssSelector("#userName"));
		SearchContext shadow=element.getShadowRoot();
		Thread.sleep(3000);
		shadow.findElement(By.xpath("#kils")).sendKeys("Deepa");


	}
}
