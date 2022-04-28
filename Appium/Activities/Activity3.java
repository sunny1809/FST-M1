package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Activity3 {
	
	WebDriverWait wait;
	AndroidDriver<MobileElement> driver;
	
  @Test(priority = 0)
  public void calculatorAdd() {
	  
	  driver.findElementById("digit_5").click();
	  driver.findElementById("op_add").click();
	  driver.findElementById("digit_9").click();
	  
	  driver.findElementById("eq").click();
	  
	  String add = driver.findElementById("result").getText();
	  System.out.println("Additon : "+add);
	  Assert.assertEquals(add, "14");
	  
  }
  
  @Test(priority = 1)
  public void calculatorSub() {
	  

      driver.findElementById("digit_1").click();
      driver.findElementById("digit_0").click();
      driver.findElementById("op_sub").click();
      driver.findElementById("digit_5").click();
      
      driver.findElementById("eq").click();
      
      String sub = driver.findElementById("result").getText();
      System.out.println("Substraction : "+sub);
      Assert.assertEquals(sub, "5");
 
  }
  
  @Test(priority = 2)
  public void calculatorMulti() {
	  
      driver.findElementById("digit_5").click();
      driver.findElementById("op_mul").click();
      driver.findElementById("digit_1").click();
      driver.findElementById("digit_0").click();
      driver.findElementById("digit_0").click();
      
      driver.findElementById("eq").click();

      String multi = driver.findElementById("result").getText();
      System.out.println("Multiplication : "+multi);
      Assert.assertEquals(multi, "500");

  }
  
  @Test(priority = 3)
  public void calculatorDiv() {
	  
	  driver.findElementById("digit_5").click();
      driver.findElementById("digit_0").click();
      driver.findElementById("op_div").click();
      driver.findElementById("digit_2").click();
      
      driver.findElementById("eq").click();

      String div = driver.findElementById("result").getText();
      System.out.println("Division : "+div);
      Assert.assertEquals(div, "25");
  
  }

	@BeforeTest
	public void setUp() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator_TestAPI");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
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
