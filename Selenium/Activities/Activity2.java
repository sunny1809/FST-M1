package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		System.out.println("Page title is : "+driver.getTitle());
		
		WebElement text = driver.findElement(By.id("about-link"));
		System.out.println("Text in the element (using ID) :"+text.getText());

		WebElement text2 = driver.findElement(By.className("green"));
		System.out.println("Text in the element (using ClassName) :"+text2.getText());
		

		WebElement text3 = driver.findElement(By.linkText("About us"));
		System.out.println("Text in the element (using LinkText) :"+text3.getText());

		WebElement text4 = driver.findElement(By.cssSelector(".green"));
		System.out.println("Text in the element (using CSS Selector) :"+text4.getText());
		
		driver.close();

	}

}
