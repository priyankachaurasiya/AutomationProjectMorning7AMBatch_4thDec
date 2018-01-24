package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	@Parameters({"city","area"})
	@Test
	public void testParameters(String city,String area){
		
		Reporter.log(city+area,	true);
	}
			
		
	}


