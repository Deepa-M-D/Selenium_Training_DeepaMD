package reportgeneration;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CalendarDateWithoutLoop {


	@Test
	public void datePicker() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td//a[contains(text(),'25')]")).click();
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html"));
		driver.quit();
	}


}
