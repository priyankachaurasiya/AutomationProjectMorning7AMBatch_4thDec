package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Product_ModuleWiseExecutionUsingTestNG {
	@Test(groups={"Product","smoke"})
	public void createProduct(){
		Reporter.log("createProduct", true);
		
	}@Test(groups={"Product","regression"})
	public void editProduct(){
		Reporter.log("editProduct", true);
		
	}
	@Test(groups={"Product","regression"})
	public void deleteProduct(){
		Reporter.log("deleteProduct", true);
		
	}
}
