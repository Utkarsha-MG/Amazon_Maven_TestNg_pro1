package project_1_source_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login_page {

	public static WebDriver driver;
	
	
	@FindBy(id="nav-link-accountList")
	WebElement accandlist;
	
	public void accountandlist(WebDriver driver)
	{
	Actions s1 = new Actions (driver);
	s1.moveToElement(accandlist).perform();
	}
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement signclk;
	
	public void signinmain() throws InterruptedException
	{
		Thread.sleep(4000);
		signclk.click();
	}
	
	
	@FindBy(id="ap_email_login")
	WebElement emailid;
	
	@FindBy(id="continue")
	WebElement conti;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy (id="signInSubmit")
	WebElement  signinbtn;
	
	public void email()
	{
		emailid.sendKeys("utkarsha2811@gmail.com");
	}
	
	public void continuebtn()
	{
		conti.click();
	}
	
	public void password() throws InterruptedException
	{
		Thread.sleep(4000);
		pwd.sendKeys("Rabhya@2020");
	}
	
	public void signin()
	{
		signinbtn.click();
	}
	
	public Amazon_login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
  
	}
	
}
