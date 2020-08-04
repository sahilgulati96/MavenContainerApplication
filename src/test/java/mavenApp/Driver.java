package mavenApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
	public static WebDriver launchbrowser() throws InterruptedException, MalformedURLException {
		
		
		 // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe"); 
		  ChromeOptions options = new ChromeOptions(); 
		 // options.addArguments("--headless");
		  options.addArguments("start-maximized"); //https://stackoverflow.com/a/26283818/1689770
		  options.addArguments("enable-automation"); //https://stackoverflow.com/a/43840128/1689770
		  options.addArguments("--ignore-certificate-errors"); // Ignore Certificate
		  options.addArguments("--no-sandbox");
		  //https://stackoverflow.com/a/50725918/1689770
		  options.addArguments("--disable-infobars");
		  //https://stackoverflow.com/a/43840128/1689770
		  options.addArguments("--disable-dev-shm-usage");
		  //https://stackoverflow.com/a/50725918/1689770
		  options.addArguments("--disable-browser-side-navigation");
		  //https://stackoverflow.com/a/49123152/1689770
		  options.addArguments("--disable-gpu");
		  //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc //return new
		//  ChromeDriver(options);
		 
	//	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		return new RemoteWebDriver(new URL("http://selenium-hub:4444/wd/hub"), options);

	}
}
