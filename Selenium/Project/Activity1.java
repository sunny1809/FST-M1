package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity1 {
	
	WebDriver driver;
	
  @Test
  public void pageTitle() {
	  
	  String title = driver.getTitle();
	  System.out.println("Page title is "+title );
	  Assert.assertEquals(title, "SuiteCRM");
	  
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
