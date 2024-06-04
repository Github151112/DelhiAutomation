package WindowHandling;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTheWindow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		
		
//		String parentId = driver.getWindowHandle();
//		System.out.println("Parent window session id is: "+parentId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String id:allWindowId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Apple iPhone 15 (Blue, 128 GB)"))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		
		
		
	}

}
