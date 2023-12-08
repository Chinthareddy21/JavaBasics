package pageFactory.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class objects {
	public static WebElement searchBox(WebDriver driver) {
		return driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
	}
}