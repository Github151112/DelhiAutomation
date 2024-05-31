package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebook {
	
	
	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		//click on create new account
		driver.findElement(By.className("_6lti")).click();
		
		
		//enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Aman");
		
		//enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		
		//enter the phone no
		driver.findElement(By.name("reg_email__")).sendKeys("7852154156");
		
		//enter the new password
		driver.findElement(By.id("password_step_input")).sendKeys("Aman@1230");
		
		//click on male button
		driver.findElement(By.cssSelector("input[value='2']")).click();
		
		
		
		
		
		
		
	}

}
