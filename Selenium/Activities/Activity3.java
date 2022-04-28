package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println("Title of the page is : "+driver.getTitle());
		
		driver.findElement(By.id("firstName")).sendKeys("Abhijit");
		driver.findElement(By.id("lastName")).sendKeys("Dey");
		driver.findElement(By.id("email")).sendKeys("abcxyz@xyz.com");
		driver.findElement(By.id("number")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		System.out.println("User information submitted.");
		driver.close();
		
	}

}
