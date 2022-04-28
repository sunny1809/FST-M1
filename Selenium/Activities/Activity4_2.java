package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println("Page Title is "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys("Abhijit");
		driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("Dey");
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("abc@xyz.com");
		driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("123456789");
		driver.findElement(By.xpath("//textarea")).sendKeys("FST class activity.");
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		System.out.println("Form successfully submitted.");
		driver.close();
	}

}
