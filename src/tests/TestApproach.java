package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ApproachPage;
import pages.HomePage;

/*
 * @author Md Alam (11/8/2016)
 */

public class TestApproach {

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uptake.com/");
		
		// Following test will verify that navigation between Home page and Approach page is working properly.
		HomePage.approachLink(driver).click();
		//Thread.sleep(2000);
		String result = ApproachPage.approachHeadingLabel(driver).getText();
		//Assert.assertEquals("Five key differentiators define our approach.", result);
		if(result.equals("Five key differentiators define our approach.")) {
			System.out.println("The test is Passed");
		}
		else {
			System.out.println("The test is Failed");
		}
		driver.quit();
	}
}