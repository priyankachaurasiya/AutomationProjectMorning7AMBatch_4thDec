package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class TestLogin_2 extends BaseClass{

	@Test
	public void testLogin() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException{
		FileInputStream configFile = new FileInputStream("./config.properties");
		Properties prop = new Properties();
		prop.load(configFile);
		String url = prop.getProperty("url");
		
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		
		FileInputStream fis = new FileInputStream("./testdata/inputdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String username = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String password = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		l.setUsername(username);
		Thread.sleep(2000);
		l.setPassword(password);
		Thread.sleep(2000);
		l.clickLogin();
		
		
		
	}

}
