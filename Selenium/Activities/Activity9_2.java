package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");

		WebElement multiSelect = driver.findElement(By.id("multi-value"));
		Select select = new Select(driver.findElement(By.id("multi-select")));

		if (select.isMultiple()) {
			select.selectByVisibleText("Javascript");
			System.out.println(multiSelect.getText());

			select.selectByValue("node");
			System.out.println(multiSelect.getText());

			for (int i = 4; i <= 6; i++) {
				select.selectByIndex(i);
			}

			select.deselectByValue("node");
			System.out.println(multiSelect.getText());

			select.deselectByIndex(7);
			System.out.println(multiSelect.getText());

			List<WebElement> selectedOptions = select.getAllSelectedOptions();
			for (WebElement j : selectedOptions) {
				System.out.println("Selected all the options: " + j.getText());
			}

			select.deselectAll();
			System.out.println("Deselected all the options: " + multiSelect.getText());

		}

		driver.close();

	}

}
