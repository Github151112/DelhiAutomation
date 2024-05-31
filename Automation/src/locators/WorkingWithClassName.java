package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//search books inside demoweb shop
	WebElement searchTextField = driver.findElement(By.tagName("input"));
	searchTextField.sendKeys("books");
	//clicking on search button
	WebElement searhButton = driver.findElement(By.className("search-box-button"));
	searhButton.click();
		
	}
}
