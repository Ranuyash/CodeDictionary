package Packege_MAVENfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String TestData(int RowIndex,int collIndex) throws EncryptedDocumentException, IOException 
	{

		FileInputStream file= new FileInputStream("D:\\Selenium\\MAVEN_project\\Folder_Testdata\\login_credentials.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDFlogin");
		String value = sh.getRow(RowIndex).getCell(collIndex).getStringCellValue();
		
		return value;
	} 
	
//	
//	public void captureScreenShot(WebDriver driver, int TCID) throws IOException 
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File dest= new File("D:\\Selenium\\Selenium_Oct\\screenshot\\TeatCase"+TCID+".jpg");
//		
//		FileHandler.copy(src, dest);
//	}

}
