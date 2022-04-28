package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity1 {
    @Test
    public void calc() throws MalformedURLException{
      
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Emulator_TestAPI");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");

       
        AppiumDriver<MobileElement> driver = null;
        
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        System.out.println("Calculator is open");
        
        driver.quit();
       
    }
}