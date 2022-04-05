package MAVEN_Module01;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepom01{

	@ FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']") private WebElement PW;
	@FindBy(xpath="//button[@type='submit']") private WebElement CLk;
	
	
	
	public kitepom01(WebDriver driver) 
	{
		
PageFactory.initElements(driver,this);
	}
   
     public void  inpKiteLogin1PageUsername(String UNvalue)       
    {
    	 UN.sendKeys(UNvalue);
    	 
	  }
     
     public void inpKiteLogin1PagePassword(String PWDvalue)  
     {
    	PW.sendKeys(PWDvalue); 
     }     
	
     public void clickKiteLogin1PageLoginBtn() 
     {
    	 
    	 CLk.click();
     }

	
     
     
}
