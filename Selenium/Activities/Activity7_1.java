package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println("Page Title is "+driver.getTitle());
        
        driver.findElement(By.xpath("//input[contains(@class, 'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class, 'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        String pageMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login screen message is : "+pageMessage);
        
        driver.close();

	}

}
