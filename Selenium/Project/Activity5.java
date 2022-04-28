package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Activity5 {
	
	WebDriver driver;
	
  @Test
  public void menuColor() {
	  
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("bigbutton")).click();
	  System.out.println("Succesfully logged in.");
	  
	  String color = driver.findElement(By.id("toolbar")).getCssValue("color");
	  System.out.println("Color of the Navigation Menu is "+color);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/crm/");
	  System.out.println("Browser is open.");

  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  System.out.println("Close the browser.");
  }

}
