package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity6 {
	
	WebDriver driver;
	
  @Test
  public void activitiesMenu() {
	  
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("bigbutton")).click();
	  System.out.println("Succesfully logged in.");
	  
	  WebElement menu = driver.findElement(By.id("grouptab_3"));
	  
	  String menuName = menu.getText();
	  Assert.assertEquals(menuName, "ACTIVITIES");
	  System.out.println("'ACTIVITIES' menu exists !");
	  
	  if (menu.isEnabled()) {
		  System.out.println("'ACTIVITIES' menu is clickable !");
	  } else {
		  System.out.println("'ACTIVITIES' menu is not clickable !");
	  }
	  
	  
	  
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
