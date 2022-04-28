package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		
		System.out.println("Total rows in the table : "+rows.size());
		System.out.println("Total cols in the table : "+cols.size());
		
		String secondRowColBefore = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Second row and Second Column value is (Before sorted)  : "+secondRowColBefore);
        
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
        
        String secondRowColAfter = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Second row and Second Column value is (After sorted) : "+secondRowColAfter);
        
		driver.close();

	}

}
