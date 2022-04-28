package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println("Page Title is "+driver.getTitle());
        
        driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("Abhijit");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password");
        driver.findElement(By.xpath("//input[contains(@class, 'email')]")).sendKeys("abc@xyz.com");
        driver.findElement(By.xpath("//button[contains(@onclick, 'signUp')]")).click(); 
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        String pageMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login screen message is : "+pageMessage);
        
        driver.close();


	}

}
