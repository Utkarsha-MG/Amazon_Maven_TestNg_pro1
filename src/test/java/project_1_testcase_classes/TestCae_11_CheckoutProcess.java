package project_1_testcase_classes;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_1_source_classes.Amazon_Home_page;
import project_1_source_classes.Amazon_ShoppingCart_S9;
import project_1_source_classes.Amazon_checkoutProcess_11;
import project_1_source_classes.Amazon_login_page;

@Listeners(Screenshot_Listner.class)
public class TestCae_11_CheckoutProcess extends Screenshot_Listner{
	
	@Test
	
	public void Checkout_Page() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	

		Amazon_login_page a2 = new Amazon_login_page(driver);

		a2.accountandlist(driver);
		a2.signinmain();
		a2.email();
		a2.continuebtn();
		a2.password();
		a2.signin();

		Amazon_Home_page a5 = new Amazon_Home_page(driver);
		a5.Searching();
		a5.firstproduct();
		
		Amazon_ShoppingCart_S9 a9 = new Amazon_ShoppingCart_S9(driver);
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> pcid = s1.iterator();
		String parentid = pcid.next();
		String childid = pcid.next();
		driver.switchTo().window(childid);
		a9.Add_to_Cart();
		a9.Go_Cart();
		
		Amazon_checkoutProcess_11 a11 = new Amazon_checkoutProcess_11(driver);
		
		a11.ProceedtoBuy();
		/*Set<String> s2 = driver.getWindowHandles();
		Iterator<String> pcid1 = s1.iterator();
		String parentidd = pcid.next();
		String childidd = pcid.next();
		driver.switchTo().window(childid);*/
		
		a11.Selectaddress();
		
		
		
		a11.useaddresbtn();
		Set<String> s3 = driver.getWindowHandles();
		Iterator<String> pcid2 = s1.iterator();
		String parentiddd = pcid.next();
		String childidd1 = pcid.next();
		driver.switchTo().window(childid);
		a11.paymentmethod();
		a11.usepaymentbutton();
		a11.Reviewbutton();
		
	}

}
