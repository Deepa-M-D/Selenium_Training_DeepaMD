package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumScript2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		
		//FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		WebElement username=driver.findElement(By.name("email1"));
		username.sendKeys("SapientTraining@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		driver.findElement(By.className("submit-btn")).click();
		}

}
