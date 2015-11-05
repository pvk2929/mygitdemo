package sample.git;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SimpleGitTest {

	@Test
	public void testGit(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		SoftAssert sa = new SoftAssert();
		String title = driver.getTitle();
		System.out.println("title is "+title);
		sa.assertTrue(title.contains("flipkart"), " Title doesnot contains Flipkart");
		driver.close();
		driver.quit();
		sa.assertAll();
		
	}
	
}
