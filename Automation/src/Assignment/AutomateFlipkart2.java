package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkart2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		//search iphone in searchTextField
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		//identify all iphone name list
		WebElement iphoneName = driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
		
		iphoneName.click();
		
		
		
		
		
		
		
		
		
		
	}

}
