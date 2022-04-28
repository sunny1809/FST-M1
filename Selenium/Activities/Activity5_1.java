package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");

		boolean checkbox = driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
		System.out.println("Checkbox is displayed : " + checkbox);
		driver.findElement(By.id("toggleCheckbox")).click();
		System.out.println("Checkbox is displayed : " + checkbox);

		driver.close();

	}

}
