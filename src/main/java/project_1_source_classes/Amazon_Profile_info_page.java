package project_1_source_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Profile_info_page {
	
	public static WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement AccountnList;
	
	public void accountandlist(WebDriver driver)
	{
	Actions s1 = new Actions (driver);
	s1.moveToElement(AccountnList).perform();
	}
    
	@FindBy(xpath="//div[@class='sc-fvEvSO iLGXrF']")
	WebElement profile;
	
	public void manageprofile()
	{
		profile.click();
	}
	
	@FindBy(xpath="//div[@class='sc-kgTSHT fKJwkr']")
	WebElement view;
	
	public void View_prof() throws InterruptedException 
	{
		Thread.sleep(4000);
		view.click();
		
	}
	public Amazon_Profile_info_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
  
}
}
