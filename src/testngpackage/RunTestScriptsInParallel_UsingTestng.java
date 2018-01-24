package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunTestScriptsInParallel_UsingTestng {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	@Parameters({"browser"})
	@Test
	public void launchMultipleBrowser_usingTestNG(String browser) throws InterruptedException{
		
		if (browser.equals("firefox")) {
			driver= new FirefoxDriver();
			
		}
		else{
			
			driver=new ChromeDriver();
		}
		driver.get("http://localhost/login.do");
		WebElement unObj = driver.findElement(By.id("username"));
		for (int i = 0; i <10 ; i++) {
			unObj.sendKeys("admin"+i);
			Thread.sleep(2000);
			unObj.clear();
			
		}
	}
	
}
