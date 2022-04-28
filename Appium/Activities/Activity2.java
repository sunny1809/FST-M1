package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity2 {

	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@Test
	public void activity() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/");

		String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
		System.out.println("Title on Homepage: " + pageTitle);

		MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@text='About Us']");
		aboutButton.click();

		String newPageTitle = driver.findElementByXPath("//android.view.View[@index='2']").getText();

		System.out.println("Title on new page: " + newPageTitle);

		Assert.assertEquals(pageTitle, "Training Support");
		Assert.assertEquals(newPageTitle, "About Us");

	}

	@BeforeTest
	public void capSetup() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator_TestAPI");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
