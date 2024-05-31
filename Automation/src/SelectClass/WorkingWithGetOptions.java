package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetOptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		//identify the static dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		//create the object of select class
		Select s = new Select(dropdown);
		//getoptions()
//		List<WebElement> allOptions = s.getOptions();
//		
//		for(WebElement option:allOptions)
//		{
//			System.out.println(option.getText());
//		}
		
		System.out.println(s.getWrappedElement().getText());
		
		
		
		
		
	}

}
