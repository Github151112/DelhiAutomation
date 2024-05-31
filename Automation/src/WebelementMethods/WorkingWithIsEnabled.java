package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;

public class WorkingWithIsEnabled {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//identify the username text field
		WebElement usnTextField = driver.findElement(By.name("username"));
		if(usnTextField.isEnabled())
		{
			usnTextField.sendKeys("admin");
		}
		else
		{
			System.out.println("Username text field is disabled");
		}
	}

}
