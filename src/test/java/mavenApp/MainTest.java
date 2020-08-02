package mavenApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver wd = Driver.launchbrowser();
		System.out.println("Starting Test");
		wd.get("file:///"+System.getProperty("user.dir")+"/index.html");
		Thread.sleep(2000);
		WebElement heading = wd.findElement(By.xpath("/html/body/h1"));
		Assert.assertEquals(heading.getText(), "\"Welcome to the Sample Application\"");
		wd.close();
		
	}

}
