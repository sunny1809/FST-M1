package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Activity6 {

	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@Test
	public void activity() {

		wait.until(ExpectedConditions.elementToBeClickable(By.className("android.view.View")));
		List<MobileElement> numberOfImages = driver
				.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
		System.out.println("Number of image shown currently: " + numberOfImages.size());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));
		numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
		System.out.println("Number of image shown currently: " + numberOfImages.size());

	}

	@BeforeTest
	public void beforeTest() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator_TestAPI");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/lazy-loading");

	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
