package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Activity9 {
	
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
  public void traversingTables2() {
	  
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("bigbutton")).click();
	  System.out.println("Succesfully logged in.");
	  
	  driver.findElement(By.id("grouptab_0")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("moduleTab_9_Leads")));
	  driver.findElement(By.id("moduleTab_9_Leads")).click();
	  System.out.println("Succesfully navigate to Sales -> Leads tab");
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab")));
	  
	  System.out.println("Print the first 10 values of 'Names' coloumn :");
	  
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[1]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[2]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[3]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[4]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[5]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[6]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[7]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[8]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[9]/td[3]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[10]/td[3]")).getText());
	  
	  System.out.println("Print the first 10 values of 'User' coloumn :");
	  
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[1]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[2]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[3]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[4]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[5]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[6]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[7]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[8]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[9]/td[8]")).getText());
	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[10]/td[8]")).getText());
		
		
	  
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
