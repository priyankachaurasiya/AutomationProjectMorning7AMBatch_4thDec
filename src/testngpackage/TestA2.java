package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestA2 {
	@Test
	public void testA(){
		Reporter.log("in test method A2", true);
	}

}
/*
 * [RemoteTestNG] detected TestNG version 6.13.1
in test method A2
PASSED: testA

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================




___________________________________
when u open with web browser:you get following output

Default test

testngpackage.TestA2#testA


Messages


in test method A2 

*/
