package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * @author Md Alam (11/8/2016)
 */

public class HomePage {

	   private static WebElement element = null;
	   
	   // Approach Link
	   public static WebElement approachLink (WebDriver driver) {
	      element = driver.findElement(By.xpath(".//*[@id='menu-item-4164']/a"));
	      return element;
	   }
		
	   // Platform Link
	   public static WebElement platformLink (WebDriver driver) {
	      element = driver.findElement(By.xpath(".//*[@id='menu-item-4163']/a"));
	      return element;
	   }
}
