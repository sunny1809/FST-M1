package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Activity9 {
	
	WebDriver driver;
	
  @Test (priority = 1)
  public void simpleAlertTestCase() {
	  
	  driver.findElement(By.id("simple")).click();
	  Reporter.log("Clicked on Simple Alert button !");
	  
	 String alertMsg = driver.switchTo().alert().getText();
	 Reporter.log("Assertion Check !!");
	 Assert.assertEquals(alertMsg, "This is a JavaScript Alert!");
	 System.out.println("Simple Alert message is "+alertMsg);
	 
	 driver.switchTo().alert().accept();
	 Reporter.log("Simple Alert Closed !");
	 
  }
  
  @Test (priority = 2)
  public void confirmAlertTestCase() {
	  
	  driver.findElement(By.id("confirm")).click();
	  Reporter.log("Clicked on Confirmation button !");
	  
	  String alertMsg2 = driver.switchTo().alert().getText();
	  Reporter.log("Assertion Check !!");
	  Assert.assertEquals(alertMsg2, "This is a JavaScript Confirmation!");
	  System.out.println("Simple Alert message is "+alertMsg2);
	  
		 
	  driver.switchTo().alert().accept();
	  Reporter.log("Confirmation Alert Closed !");
	  
  }
  
  @Test (priority = 3)
  public void promptAlertTestCase() {
	  
	  driver.findElement(By.id("prompt")).click();
	  Reporter.log("Clicked on Prompt button !");
	  
	  String alertMsg3 = driver.switchTo().alert().getText();
	  Reporter.log("Assertion Check !!");
	  Assert.assertEquals(alertMsg3, "This is a JavaScript Prompt!");
	  System.out.println("Simple Alert message is "+alertMsg3);
	  
	  driver.switchTo().alert().sendKeys("FST Activity");
	  Reporter.log("Message send to the Prompt alert !");
	  driver.switchTo().alert().accept();
	  Reporter.log("Confirmation Alert Closed !");

  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  Reporter.log("Ready to execute");
	  driver.switchTo().defaultContent();
  }

  @BeforeTest
  public void beforeTest() {
	  
	  Reporter.log("Test case Starting");
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/javascript-alerts");
	  Reporter.log("Browser is opening !");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  Reporter.log("Browser closed.");
  }

}
