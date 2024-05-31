package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-eeas1cv9/login.do");
		Thread.sleep(3000);
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys("admin");
		usernameTextField.clear();
		usernameTextField.sendKeys("admin123");
		
		
		
		
		
	}

}
