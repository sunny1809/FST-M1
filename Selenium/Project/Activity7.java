package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Activity7 {

	WebDriver driver;
	WebDriverWait wait;

	@Test
	public void readInfo() {

		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		System.out.println("Succesfully logged in.");
		
		driver.findElement(By.id("grouptab_0")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("moduleTab_9_Leads")));
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		System.out.println("Succesfully navigate to Sales -> Leads tab");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab")));
		
		driver.findElement(By.id("adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab")).click();
		System.out.println("Clicked on Additional information icon.");
		
		driver.switchTo().activeElement();
		
		String mobNum = driver.findElement(By.className("phone")).getText();
		System.out.println("Selected Lead's mobile number is "+mobNum);

	}

	@BeforeTest
	public void beforeTest() {

		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		System.out.println("Browser is open.");
		wait = new WebDriverWait(driver, 30);
		

	}

	@AfterTest
	public void afterTest() {

		driver.close();
		System.out.println("Close the browser.");
	}

}
