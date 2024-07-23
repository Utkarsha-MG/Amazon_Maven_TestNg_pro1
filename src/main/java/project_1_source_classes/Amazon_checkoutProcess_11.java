package project_1_source_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_checkoutProcess_11 {

	WebDriver driver;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement checkout;
	
	public void ProceedtoBuy()
	{
		checkout.click();
	}
	
	@FindBy(name="submissionURL")
	WebElement radiobutton;
	
	public void Selectaddress() 
	{
		radiobutton.click();
	}
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement address;
	
	public void useaddresbtn() 
	{
		

		address.click();
	}
	
	@FindBy(id="pp-jbT5kh-141")
	WebElement paymentbtn;
	
	public void paymentmethod() throws InterruptedException
	{
		Thread.sleep(2000);

		paymentbtn.click();
	}
	
	@FindBy(linkText="Use this payment method")
	WebElement paymethodbtn;
	
	public void usepaymentbutton()
	{
		paymethodbtn.click();
	}
	
	@FindBy(xpath="(//div[@class='a-column a-span2 a-text-right a-span-last'])[4]")
	WebElement revieworder;
	
	public void Reviewbutton()
	{
		revieworder.click();
	}
	public Amazon_checkoutProcess_11(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
}
}

