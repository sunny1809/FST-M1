package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	
	WebDriver driver;
	
  @Test
  public void activity1() {
	  
	  
	  String title = driver.getTitle();
	  System.out.println("Page Title is : "+title);
	  
	  Assert.assertEquals("Training Support", title);
	  
	  driver.findElement(By.id("about-link")).click();
	  System.out.println("New page title is : "+driver.getTitle());
	  
	  }
	  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
	 
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
  }

}
