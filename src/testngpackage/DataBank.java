package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataBank {
	@DataProvider
	public Object[][] dataBank(){
		Object[][] data = new Object[2][2];
		data[0][0]="admin123";
		data[0][1]="manager123";
		data[1][0]="admin345";
		data[1][1]="manager345";
		return data;	
}
@Test(dataProvider = "dataBank")
public void testLogin(String un,String pwd){
	Reporter.log("Username   Password", true);
	Reporter.log(un+"   "+pwd, true);
	
}
}
