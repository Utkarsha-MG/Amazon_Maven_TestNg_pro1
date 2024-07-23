package project_1_source_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_New_User_Register_Page {
	
  WebDriver driver;
  
  @FindBy(name="customerName")
  WebElement fname;
  
  @FindBy(id="ap_phone_number")
  WebElement mobileno;
  
  @FindBy(id="ap_password")
  WebElement pwd;
  
  @FindBy(id="continue")
  WebElement  conti;
  
  public void un()
  {
      fname.sendKeys("Utkarsha Meshramm");
  }
  
  public void phonenum()
  {
      mobileno.sendKeys("9209840079");
  }
  public void password()
  {
      pwd.sendKeys("Utkarsha281");
  }
  
  public void verifymobno()
  {
      conti.click();
  }
  
  public Amazon_New_User_Register_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
  
	}


}
