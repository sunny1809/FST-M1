package projectActivities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity2 {

	WebDriverWait wait;
	AndroidDriver<MobileElement> driver;
	
	@Test
	public void googleKeep1() {

		wait.until(ExpectedConditions.elementToBeClickable(By.id("new_note_button")));
		driver.findElementById("new_note_button").click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("editable_title")));
		driver.findElementById("editable_title").sendKeys("Proj Activity2");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("edit_note_text")));
		driver.findElementById("edit_note_text").sendKeys("Google Keep Activity 1");

		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("index_note_title")));
		String msg = driver.findElementById("index_note_title").getText();
		Assert.assertEquals(msg, "Proj Activity2");

	}
  
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  
	    DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator_TestAPI");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.google.android.keep");
		caps.setCapability("appActivity", ".activities.BrowseActivity");
		caps.setCapability("noReset", true);

		URL location = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(location, caps);
		wait = new WebDriverWait(driver, 30);

  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
