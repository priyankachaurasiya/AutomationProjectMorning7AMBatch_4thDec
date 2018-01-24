package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotationParameterDemo {
	@Test
	public void createuser(){
		
		Reporter.log("createuser...", true);
	}
	@Test
	public void edituser(){
		
		Reporter.log("edituser...", true);
	}
	@Test
	public void deleteuser(){
		
		Reporter.log("deleteuser...", true);
	}

}
/*
 *[RemoteTestNG] detected TestNG version 6.13.1
createuser...
deleteuser...
edituser...
PASSED: createuser
PASSED: deleteuser
PASSED: edituser

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Failures: 0, Skips: 0
===============================================


 
 * */
