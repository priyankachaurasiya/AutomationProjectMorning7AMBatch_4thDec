package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestB3 {
	@BeforeMethod
	public void beforeMethod(){
		
		Reporter.log("in Before Method B..", true);
	}
	@Test
	public void testB1(){
		
		Reporter.log("in test Method B3..", true);
	}
	@AfterMethod
	public void afterMethod(){
		
		Reporter.log("in Before Method B..", true);
	}

}
