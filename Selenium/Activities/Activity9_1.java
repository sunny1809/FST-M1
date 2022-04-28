package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");      
        WebElement dropdown = driver.findElement(By.id("single-select"));
        WebElement dropdownMsg = driver.findElement(By.id("single-value"));
        
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        System.out.println("Second option is : " + dropdownMsg.getText());
        
        select.selectByIndex(3);
        System.out.println("Third option is : " + dropdownMsg.getText());
        
        select.selectByValue("4");
        System.out.println("Fourth option is : " + dropdownMsg.getText());
        
        List<WebElement> options = select.getOptions();
        for(WebElement i : options) {
            System.out.println("All the Options are : " + i.getText());
        }

        driver.close();

	}

}
