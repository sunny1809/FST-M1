package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity4 {
	
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
  @Test
  public void addContact() {
	  
	  driver.findElementById("floating_action_button").click();
	  driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aaditya");
	  driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Varma");
	  driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("9991284782");
	  driver.findElementById("editor_menu_save_button").click();
	  
      wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));
      MobileElement mobileCard = driver.findElementById("toolbar_parent");
      Assert.assertTrue(mobileCard.isDisplayed());
      
      String contactName = driver.findElementById("large_title").getText();
      Assert.assertEquals(contactName, "Aaditya Varma");

  }
  
  
  @BeforeTest
  public void setUp() throws MalformedURLException {
	  
	    DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator_TestAPI");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.contacts");
		caps.setCapability("appActivity", ".activities.PeopleActivity");
		caps.setCapability("noReset", true);

		URL location = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(location, caps);
		wait = new WebDriverWait(driver, 20);

  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
