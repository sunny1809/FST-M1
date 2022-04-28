package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");

		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("Checkbox is selected : " + textbox.isEnabled());
		driver.findElement(By.id("toggleInput")).click();
		System.out.println("Checkbox is selected : " + textbox.isEnabled());

		driver.close();

	}

}
