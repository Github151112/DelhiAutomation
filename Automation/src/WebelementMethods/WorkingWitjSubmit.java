package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWitjSubmit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("Toys");
		WebElement button = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
		button.submit();
		
		
	}
	

}
