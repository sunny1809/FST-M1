package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	
	WebDriver driver;
	
  @Test (groups = {"HeaderTests", "ButtonTests"})
  public void pageTitle() {
	  
	  String title = driver.getTitle();
	  System.out.println("Page title is : "+title);
	  Assert.assertEquals(title, "Target Practice");
  }
  
  @Test (dependsOnMethods = {"pageTitle"}, groups = {"HeaderTests"})
  public void headerTest() {
	  
	  String headerText = driver.findElement(By.id("third-header")).getText();
	  Assert.assertEquals(headerText, "Third header");
	  System.out.println("headerText assertion passed.");
	  
	  String headerColor = driver.findElement(By.tagName("h5")).getCssValue("color");
	  Assert.assertEquals(headerColor, "rgb(33, 186, 69)");
	  System.out.println("headerColor assertion passed.");
	  
  }
  
  @Test (dependsOnMethods = {"pageTitle"}, groups = {"ButtonTests"})
  public void buttonTest() {
	  
	  String buttonText = driver.findElement(By.cssSelector("button.olive") ).getText();
	  Assert.assertEquals(buttonText, "Olive");
	  System.out.println("buttonTest assertion passed.");
	  
	  String buttonColor = driver.findElement(By.cssSelector("button.brown")).getCssValue("color");
	  Assert.assertEquals(buttonColor, "rgb(255, 255, 255)");
	  System.out.println("buttonColor assertion passed.");

	  
  }
  
  
  @BeforeClass (alwaysRun = true)
  public void beforeClass() {
	  
	driver = new FirefoxDriver();
	driver.get("https://www.training-support.net/selenium/target-practice");
	
  }

  @AfterClass (alwaysRun = true)
  public void afterClass() {
	  driver.close();
  }

}
