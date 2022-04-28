package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Activity2 {
	
	WebDriver driver;
	
  @Test
  public void printURL() {
	  
	   String url = driver.findElement(By.tagName("img")).getAttribute("src");
	   System.out.println("URL of the header image is "+url);
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
