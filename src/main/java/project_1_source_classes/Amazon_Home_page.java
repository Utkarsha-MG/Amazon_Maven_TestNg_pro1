package project_1_source_classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_page {
	
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtab;
	
	
	public void Searching()
	{
		searchtab.sendKeys("shoes");
		searchtab.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement firstshoe;
	
	public void firstproduct()
	{
		firstshoe.click();
	}
	
	public Amazon_Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
}
}

