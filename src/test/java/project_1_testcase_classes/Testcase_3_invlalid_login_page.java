package project_1_testcase_classes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_1_source_classes.Amazon_Invalid_login_page;

@Listeners(Screenshot_Listner.class)
public class Testcase_3_invlalid_login_page extends Screenshot_Listner {
	
	@Test
	
	public void Invalidcred() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		Amazon_Invalid_login_page a3 =new Amazon_Invalid_login_page(driver);
		a3.AccountandList(driver);
		a3.sign_button();
		a3.email();
		a3.continuebtn();
		a3.password();
		a3.signin();
		
	}
	

}
