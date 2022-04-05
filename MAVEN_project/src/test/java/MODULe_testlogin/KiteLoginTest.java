package MODULe_testlogin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MAVEN_Module01.kitepom01;
import MAVEN_Module01.kitepom02;
import MAVEN_Module01.kitepom03;
import Packege_MAVENfiles.BaseClass;
import Packege_MAVENfiles.UtilityClass;

public class KiteLoginTest extends BaseClass {

	kitepom01 kt01;
	kitepom02 kt02;
	kitepom03 kt03;
	
	

	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
      initializeBrowser();
		
		 kt01=new kitepom01(driver);// we can't use "kt01" in next mtd b/c it is local 
		 kt02=new kitepom02(driver);                          //so we convert it into global
		 kt03=new kitepom03(driver);
		
		
	}
	
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException 
	{ 
		kt01.inpKiteLogin1PageUsername(UtilityClass.TestData(2, 1));
		kt01.inpKiteLogin1PagePassword(UtilityClass.TestData(2, 2));
		kt01.clickKiteLogin1PageLoginBtn();
		kt02.inpKiteLogin2PagePin(UtilityClass.TestData(2, 3));
		kt02.ClickKiteLoginCntBtn();
		
	}
	//TEST CASE:check whether actual and expected UI is same
	@Test
	public void verifyUI() throws EncryptedDocumentException, IOException // i have made changes in class pom class 3
	{  
		String actUserID=kt03.GetKiteHomeUI();
		String expUI = UtilityClass.TestData(2,4);
		
	Assert.assertEquals(actUserID, expUI,"Failed:both result are diff");
	
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.close();
	}
	
	
	
}
