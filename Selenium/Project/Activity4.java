package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity4 {
	
	WebDriver driver;
	
  @Test
  public void login() {
	  
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("bigbutton")).click();
	  String homepage = driver.findElement(By.id("tab0")).getText();
	  
	  Assert.assertEquals(homepage, "SUITECRM DASHBOARD");
	  System.out.println("Verified that homepage has opened !");
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
