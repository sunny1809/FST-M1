package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.training-support.net/selenium/dynamic-controls");

		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
		System.out.println("Button invisible !!");
		
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
		System.out.println("Button Visible !");
		
		driver.close();

	}

}
