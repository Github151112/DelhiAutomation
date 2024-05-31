package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateYatra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		//click on buses
		driver.findElement(By.id("booking_engine_buses")).click();
		//click on from 
		WebElement from = driver.findElement(By.id("BE_bus_from_station"));
		Thread.sleep(2000);
		from.click();
		Thread.sleep(2000);
		from.sendKeys("mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='active ac_over']")).click();
		//click on to
		WebElement to = driver.findElement(By.id("BE_bus_to_station"));
		Thread.sleep(2000);
		to.sendKeys("delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='active ac_over']")).click();
		//click on search buses
		driver.findElement(By.id("BE_bus_search_btn")).click();
		List<WebElement> allBuses = driver.findElements(By.xpath("//div[@class='v-card__text srp-touple']"));
		for(int i=0;i<allBuses.size();i++)
		{
			String bus = allBuses.get(i).getText();
			System.out.println(bus);
			System.out.println("----------------------------------");
		}
		
		
		
		
	}

}
