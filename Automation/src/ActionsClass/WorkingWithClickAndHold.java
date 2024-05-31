package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithClickAndHold {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		//create the object 
		Actions a = new Actions(driver);
		
		//click and hold method
		a.clickAndHold(driver.findElement(By.id("circle"))).perform();
		
		//give 2 sec wait
		Thread.sleep(2000);
		
		//to release the circle
		a.release().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
