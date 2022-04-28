package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Activity8 {
	
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
  public void traversingTables1() {
	  
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("bigbutton")).click();
	  System.out.println("Succesfully logged in.");
	  
	  driver.findElement(By.id("grouptab_0")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("moduleTab_9_Accounts")));
	  driver.findElement(By.id("moduleTab_9_Accounts")).click();
	  System.out.println("Succesfully navigate to Sales -> Account tab");
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("module-title-text") ));
	  
	  System.out.println("Print the names of the first 5 odd-numbered rows :");
	  
	  
	  WebElement firstRow = driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[1]/td[3]"));
	  System.out.println("First row : " +firstRow.getText());
	  
	  WebElement thirdRow = driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[3]/td[3]"));
	  System.out.println("Third row : " +thirdRow.getText());
	  
	  WebElement fifthtRow = driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[5]/td[3]"));
	  System.out.println("Fifth row : " +fifthtRow.getText());
	  
	  WebElement seventhRow = driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[7]/td[3]"));
	  System.out.println("Seventh row : " +seventhRow.getText());
	  
	  WebElement ninethRow = driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[9]/td[3]"));
	  System.out.println("Nineth row : " +ninethRow.getText());
  
		
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/crm/");
	  System.out.println("Browser is open.");
	  wait = new WebDriverWait(driver, 30);

  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  System.out.println("Close the browser.");
  }

}
