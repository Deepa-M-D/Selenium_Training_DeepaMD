package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Deepa Dandin");

		Thread.sleep(3000);
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

		List<WebElement> allElements=driver.findElements(By.xpath("//div[@role='option']"));

		for(WebElement ele:allElements) {
			String str=ele.getText();
			System.out.println(str);

			if(str.contains("condition")) {
				ele.click();
				break;
			}
		}



	}

}
