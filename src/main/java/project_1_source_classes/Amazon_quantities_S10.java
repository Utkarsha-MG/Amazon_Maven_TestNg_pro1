package project_1_source_classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_quantities_S10 {

	WebDriver driver;
	
	@FindBy(css="[name='quantityBox']")
	WebElement update_qty;
	
	public void Update_dropdown1()
	{
		update_qty.clear();
		update_qty.sendKeys("5");
	}
	
	@FindBy(xpath="//i[@class='a-icon a-icon-dropdown']")
	WebElement qtyupdate;
	
	public void Update_Quantity()
	{
		qtyupdate.click();
	}
     
	@FindBy(name="quantity")
	WebElement selectProductQuantity;
	
	public void selectQuantityFromDropdown() throws InterruptedException 
	{
         Thread.sleep(1500);
		Select selectQuantity=new Select(selectProductQuantity);
		selectQuantity.selectByValue("3");	
	}
	
	@FindBy(css="[value='Delete]")
	WebElement deleteproductbutton;
	
	public void deletProductFromCart() throws InterruptedException
	{
         Thread.sleep(2000);
		deleteproductbutton.clear();
	}
	public Amazon_quantities_S10(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
}

