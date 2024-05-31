package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitWait {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//span[text()='SANTOOR']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("132103");
		
		WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(checkButton));
	
		checkButton.click();

	}

}
