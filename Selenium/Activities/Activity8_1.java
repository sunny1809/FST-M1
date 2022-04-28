package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.training-support.net/selenium/tables");
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));

        System.out.println("Number of columns are: " + cols.size());
        System.out.println("Number of rows are: " + rows.size());

        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }
        
        String secondRowCol = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]")).getText();
        System.out.println("Second row and Second Column value is : "+secondRowCol);
        
        driver.close();
        

	}

}
