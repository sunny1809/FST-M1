package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity3 {
	
	WebDriver driver;
	
  @Test
  public void footer() {
	  
	  String footertext = driver.findElement(By.id("admin_options")).getText();
	  System.out.println("First copyright text in the footer is :  "+footertext);
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/crm/");
	  System.out.println("Browser is open.");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  System.out.println("Close the browser.");
  }

}
