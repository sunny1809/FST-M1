package projectActivities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity5 {
	
	WebDriverWait wait;
	AndroidDriver<MobileElement> driver;
	
	
	@Test
	public void loginForm() {

		wait.until(
				ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[@text='Selenium']")));

		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
		driver.findElementByXPath("//android.view.View[contains(@text, 'Login Form')]").click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.view.View/android.widget.EditText[@index=\"2\"]")));

		driver.findElementByXPath("//android.view.View/android.widget.EditText[@index=\"2\"]").sendKeys("admin");
		driver.findElementByXPath("//android.view.View/android.widget.EditText[@index=\"4\"]").sendKeys("password");
		driver.findElementByXPath("//android.view.View/android.widget.Button[contains(@text, 'Log in')]").click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String loginMsg1 = driver
				.findElementByXPath("//android.view.View/android.view.View[contains(@text,'Welcome Back,')]").getText();
		Assert.assertEquals(loginMsg1, "Welcome Back, admin");
		System.out.println("Correct Credentials : " + loginMsg1);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.View/android.widget.EditText[@index=\"2\"]").sendKeys("Abhijit");
		driver.findElementByXPath("//android.view.View/android.widget.EditText[@index=\"4\"]").sendKeys("password");
		driver.findElementByXPath("//android.view.View/android.widget.Button[contains(@text, 'Log in')]").click();

		String loginMsg2 = driver.findElementByXPath("//android.view.View/android.view.View[contains(@text,'Invalid')]")
				.getText();
		Assert.assertEquals(loginMsg2, "Invalid Credentials");
		System.out.println("Inorrect Credentials : " + loginMsg2);

	}
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("deviceName", "Emulator_TestAPI");
	  caps.setCapability("platformName", "Android");
	  caps.setCapability("appPackage", "com.android.chrome");
	  caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	  caps.setCapability("noReset", true);
	  	  
	  URL location = new URL("http://0.0.0.0:4723/wd/hub");
	  driver = new AndroidDriver<MobileElement>(location, caps);
	  driver.get("https://www.training-support.net/selenium");
	  wait = new WebDriverWait(driver,30);

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
