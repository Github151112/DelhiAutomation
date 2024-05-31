package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithdeselectByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		//click on multi select option
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		
		//identify the multi-select dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		//create the object of select class
		Select s = new Select(dropdown);
		
		System.out.println(s.isMultiple());
		//selectByIndex()
		for(int i=0;i<4;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		//deselectByIndex
//		for(int i=0;i<4;i++)
//		{
//			s.deselectByIndex(i);
//			Thread.sleep(2000);
//		}
		s.deselectAll();
		
		
		
		
		
	}

}
