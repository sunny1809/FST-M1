package activities;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
	
	WebDriver driver;
	
  @Test
  @Parameters ({"username", "password"})
  public void activity6Test(String username, String password) {
	  
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
	  
	  
	  String loginMsg = driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals(loginMsg, "Welcome Back, admin");
	  System.out.println("succesfully logged in !");
	  
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
