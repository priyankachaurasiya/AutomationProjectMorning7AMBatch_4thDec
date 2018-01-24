package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class User_ModuleWiseExecutionUsingTestNG {
	@Test(groups={"User","smoke"})
	public void createUser(){
		Reporter.log("createUser", true);
		
	}@Test(groups={"User","regression"})
	public void editUser(){
		Reporter.log("editUser", true);
		
	}
	@Test(groups={"User","regression"})
	public void deleteUser(){
		Reporter.log("deleteUser", true);
		
	}


}
