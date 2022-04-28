package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        driver.get("https://training-support.net/selenium/drag-drop");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
        
        WebElement ballimage = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        
        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(ballimage, dropzone1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1, "background-color"));
        System.out.println("Ball has entered Dropezone 1");
        
        dragAndDrop.dragAndDrop(ballimage, dropzone2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2, "background-color"));
        System.out.println("Ball has entered Dropezone 2");
        
        driver.close();

	}

}
