package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	
	WebDriver driver;
	
  @Test
  public void activity3() {
	  
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("password");
	  System.out.println("Username & password successfully provided.");
	  
	  driver.findElement(By.xpath("//button[text() ='Log in']")).click();
	  String msg = driver.findElement(By.id("action-confirmation")).getText();
	  
	  Assert.assertEquals("Welcome Back, admin", msg);
	  System.out.println("Passed ... Correct message has been printed !");
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
