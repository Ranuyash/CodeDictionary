package MAVEN_Module01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepom02 {
	
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement CTN;
	
	
	public kitepom02(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void inpKiteLogin2PagePin(String PINvalue) 
	{
		PIN.sendKeys(PINvalue);
	}
	
	public void ClickKiteLoginCntBtn() 
	{
		CTN.click();
	}
	
	

}
