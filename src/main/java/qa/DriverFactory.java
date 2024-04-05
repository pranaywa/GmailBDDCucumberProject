package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	WebDriver driver;
	
	public WebDriver initBrowser() {
		driver = new ChromeDriver();
		return driver;
	}
	public WebDriver getDriver() {
		return driver;
	}
	
	
}
