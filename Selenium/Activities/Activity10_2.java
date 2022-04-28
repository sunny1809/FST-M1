package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page Title is "+driver.getTitle());
        
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        WebElement pKey = driver.findElement(By.id("keyPressed"));
        Action keyboardAction= actions.sendKeys("A").build();
        keyboardAction.perform();
        System.out.println("Pressed key is: " + pKey.getText());
        
        Action keyboardAction2 = actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        keyboardAction2.perform();
        System.out.println("Pressed key is: " + pKey.getText());

        driver.close();

	}

}
