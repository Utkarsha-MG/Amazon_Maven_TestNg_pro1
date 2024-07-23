package project_1_source_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ShoppingCart_S9 {
	
	WebDriver driver;
	
	/*@FindBy (xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement firstprod;
	
	public void FProduct()
	{
		firstprod.click();*/
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	public void Add_to_Cart() throws InterruptedException
	{
		Thread.sleep(2000);
		addtocart.click();
		
 }
	
	@FindBy(linkText="Go to Cart")
	WebElement Gotocart;
	
	public void Go_Cart() throws InterruptedException
	{
		Thread.sleep(4000);
		Gotocart.click();
	}
	 public Amazon_ShoppingCart_S9(WebDriver driver)
	   {
			PageFactory.initElements(driver, this);	
}
}
