package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotationWithPriorityInvocationCountEnabledParam {
	@Test(priority=1)
	public void createuser(){
		Reporter.log("createuser..", true);
		
	}
	@Test(priority=2,invocationCount=2,enabled=false)
public void edituser(){
		Reporter.log("edituser..", true);
		
	}
	@Test(priority=3)
public void deleteuser(){
		Reporter.log("deleteuser", true);	
}
	
}
/*[RemoteTestNG] detected TestNG version 6.13.1
createuser..
deleteuser
PASSED: createuser
PASSED: deleteuser

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================


 */