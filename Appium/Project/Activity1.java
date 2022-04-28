package projectActivities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity1 {
	
	WebDriverWait wait;
	AndroidDriver<MobileElement> driver;
	
	@Test
	public void googleTasks() {

		String[] tasks = { "Complete Activity with Google Tasks", "Complete Activity with Google Keep",
				"Complete the second Activity Google Keep" };

		for (String str : tasks) {

			wait.until(ExpectedConditions.elementToBeClickable(By.id("tasks_fab")));
			driver.findElementById("tasks_fab").click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_title")));
			driver.findElementById("add_task_title").sendKeys(str);
			driver.findElementById("add_task_done").click();
			System.out.println("Task added : " + str);

		}

		wait.until(ExpectedConditions.elementToBeClickable(By.id("task_name")));
		List<MobileElement> totalTasks = driver.findElementsById("task_name");
		Assert.assertEquals(totalTasks.get(0).getText(), "Complete the second Activity Google Keep");

	}
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator_TestAPI");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.google.android.apps.tasks");
		caps.setCapability("appActivity", ".ui.TaskListsActivity");
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
