package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Activity10 {
	WebDriver driver;
	Actions builder;
	
  @Test
  public void sliderMiddleValue() {
	  
	  driver.findElement(By.id("slider")).click();
	  String midLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log(" slider Middle value: " + midLevel);
      Assert.assertEquals(midLevel, "50");
  }
  
  @Test
  public void sliderMaxValue() {
	  
	  WebElement slider = driver.findElement(By.id("slider"));
	  builder.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();
      String maxLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log("Slider Maximum value: " + maxLevel);
      Assert.assertEquals(maxLevel, "100");
  }
  
  @Test
  public void sliderMinValue() {
	  
      WebElement slider = driver.findElement(By.id("slider"));
      builder.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();
      String minLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log("Min value: " + minLevel);
      Assert.assertEquals(minLevel, "0");
  }
  
  @Test
  public void slider30pcntValue() {
	  
      WebElement slider = driver.findElement(By.id("slider"));
      builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();
      String thirtyLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log("Slider 30% level  value: " + thirtyLevel);
      Assert.assertEquals(thirtyLevel, "30");
	  
  }
  
  @Test
  public void slider80pcntValue() {

      WebElement slider = driver.findElement(By.id("slider"));
      builder.clickAndHold(slider).moveByOffset(45, 0).release().build().perform();
      String eightyLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log("Slider 80% level value: " + eightyLevel);
      Assert.assertEquals(eightyLevel, "80");
  }
  
  @BeforeTest
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/sliders");
	  builder = new Actions(driver);
	  
  }

  @AfterTest
  public void afterClass() {
	  driver.close();
  }

}
