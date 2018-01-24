package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestA1 {
	@BeforeMethod
	public void beforeMethod(){
		
		Reporter.log("in Before Method..", true);
	}
	@Test
	public void testA1(){
		
		Reporter.log("in test Method A1..", true);
	}
	@AfterMethod
	public void afterMethod(){
		
		Reporter.log("in Before Method..", true);
	}

}
