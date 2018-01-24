package testngpackage;

import org.testng.annotations.Test;
import testngpackage.BaseClass;
public class TestLogin extends BaseClass{
	@Test
	public void testLogin() throws InterruptedException{
		driver.get("http://localhost/login.do");
		LoginPage l = new LoginPage(driver);
		l.setUsername("admin1234");
		Thread.sleep(2000);
		l.setPassword("manager1234");
		Thread.sleep(2000);
		l.clickLogin();
		Thread.sleep(2000);
		l.setUsername("admin");
		Thread.sleep(2000);
		l.setPassword("manager");
		Thread.sleep(2000);
		l.clickLogin();
	}
}
