package MAVEN_Module01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepom03 {

	@FindBy(xpath="//span[@class='user-id']") private WebElement takeUI;
	@FindBy(xpath="//a[@href='/holdings']")  private WebElement listbox;
	
	public kitepom03(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
}
	public String GetKiteHomeUI() 
	{
		String actUI = takeUI.getText();
		
		return actUI;
		
	}
	
	
	
	
	
	
	
	
	
//	public void verifyKiteHomePageUserID(String expUIvalue) 
//	{
//		String actUI= expUIvalue;
//	    String expUI = takeUI.getText();
//	    
//	    if(expUI.equals(actUI)) 
//	    {
//	    	System.out.println("pass");
//	    }
//	    else {
//	    	System.out.println(" fail");
//	    }
//	}
//	
//	public void selectHolding_ListBox()
//	{
//	  
//		listbox.click();
//	
//	}
//	
}
