package day1;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSeleniumScript4 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.linkText("New user? Signup")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sushma");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Sushma@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sush@1234");


		WebElement username=driver.findElement(By.name("state"));
		WebElement stateDropdown=driver.findElement(By.id("state"));
		Select state=new Select(stateDropdown);


		List<WebElement> allValues=state.getOptions();

		state.selectByValue("Rajasthan");
		List<WebElement> allValues1=state.getOptions();
		for(WebElement ele:allValues1)
		{
			System.out.println(ele.getText());
		}
		driver.findElement(By.xpath("")).click();

		driver.findElement(By.linkText("New user? Signup")).click();
	}





}