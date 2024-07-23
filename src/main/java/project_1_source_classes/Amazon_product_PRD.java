package project_1_source_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_product_PRD {
	
	WebDriver driver;
	
	
	@FindBy (xpath="(//i[@class='a-icon a-icon-popover'])[1]")
	WebElement reviewdd;
	
	public void custreview(WebDriver driver)
	{
		reviewdd.click();
		
		/*Actions s1 = new Actions (driver);
		s1.moveToElement(reviewdd).perform();*/
	}
	
	@FindBy (id="acrPopoverLink")
	WebElement custrating;
	
	public void Customerating() throws InterruptedException
	{
		Thread.sleep(2000);
		custrating.click();
	}
	
   public Amazon_product_PRD(WebDriver driver)
   {
		PageFactory.initElements(driver, this);	

}

}
