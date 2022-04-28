package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity5 {

	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@Test
	public void smsApplication() {

		driver.findElementById("start_new_conversation_button").click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("action_ime_dialpad_toggle")));

		driver.findElementById("recipient_text_view").sendKeys("9007729775");

		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("compose_message_text")));

		driver.findElementById("compose_message_text").sendKeys("Hello from Appium");

		driver.findElementById("send_message_button_icon").click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/message_text\")")));
        String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/message_text\")")).getText();
        Assert.assertEquals(sentMessageText, "Hello from Appium");
        
        System.out.println("Message Sent !!");

	}

	@BeforeTest
	public void setUp() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator_TestAPI");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.google.android.apps.messaging");
		caps.setCapability("appActivity", ".ui.ConversationListActivity");
		caps.setCapability("noReset", true);

		URL location = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(location, caps);
		wait = new WebDriverWait(driver, 20);

	}

	@AfterTest
	public void closeApps() {

		driver.quit();
	}

}
