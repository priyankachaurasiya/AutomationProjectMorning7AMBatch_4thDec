package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotationWithParamPriorityAndInvocationCount {
	@Test(priority=1)
	public void createuser(){
		Reporter.log("createuser..", true);	
	}
	@Test(priority=2,invocationCount=2)
	public void edituser(){
		Reporter.log("edituser..", true);
			
	}
	@Test(priority=3)
	public void deleteuser(){
		Reporter.log("deleteuser", true);
			
	}
}
/*
 * [RemoteTestNG] detected TestNG version 6.13.1
createuser..
edituser..
edituser..
deleteuser
PASSED: createuser
PASSED: edituser
PASSED: edituser
PASSED: deleteuser

===============================================
    Default test
    Tests run: 4, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 4, Failures: 0, Skips: 0
===============================================


 * */
