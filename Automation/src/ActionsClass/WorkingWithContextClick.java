package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithContextClick {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		//create the object of actions class
		Actions a = new Actions(driver);
		//identify the webelement
		WebElement rightClickButton = driver.findElement(By.id("btn30"));
		//use the methods
		a.contextClick(rightClickButton).perform();
		
	}

}
