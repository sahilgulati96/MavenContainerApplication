package mavenApp;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
	
	@Test
	public void test() throws InterruptedException, MalformedURLException {
		WebDriver wd = Driver.launchbrowser();
		System.out.println("Starting Test");
		wd.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement heading = wd.findElement(By.xpath("/html"));
		System.out.println(heading.getText());
		wd.close();
		
	}

}
