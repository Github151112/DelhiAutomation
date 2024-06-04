package WindowBasedPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		Thread.sleep(3000);
		
		WebElement fileUpload = driver.findElement(By.id("fileInput"));
		fileUpload.sendKeys("C:\\Users\\AMAN SINGH\\OneDrive\\Desktop\\ProfileAman.pdf");
	}
	
	
}
