package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestA3 {
	@BeforeMethod
	public void beforeMethod(){
		
		Reporter.log("in Before Method A..", true);
	}
	@Test(invocationCount=2)
	public void testA3(){
		
		Reporter.log("in test Method A3..", true);
	}
	@AfterMethod
	public void afterMethod(){
		
		Reporter.log("in Before Method A..", true);
	}
}
