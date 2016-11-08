package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * @author Md Alam (11/8/2016)
 */

public class ApproachPage {
	   private static WebElement element = null;
	   
	   // Approach Heading Label
	   public static WebElement approachHeadingLabel (WebDriver driver) {
	      element = driver.findElement(By.xpath(".//*[@id='how']/div/h2"));
	      return element;
	   }
}
