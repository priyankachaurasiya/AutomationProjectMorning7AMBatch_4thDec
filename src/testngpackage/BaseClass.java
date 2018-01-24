package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static {
		//System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
	} 
		//static WebDriver driver = new ChromeDriver();
		
		
	static WebDriver driver =new FirefoxDriver();

}
