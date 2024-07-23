package project_1_testcase_classes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_1_source_classes.Amazon_New_User_Register_Page;


@Listeners(Screenshot_Listner.class)
public class Testcase1_New_User_reg_page extends Screenshot_Listner {
	
	@Test
	
	public void Createaccount()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		Amazon_New_User_Register_Page a1 = new Amazon_New_User_Register_Page(driver);
		a1.un();
		a1.phonenum();
		a1.password();
		a1.verifymobno();
		
	}

	
}
