package project_1_testcase_classes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project_1_source_classes.Amazon_Profile_info_page;
import project_1_source_classes.Amazon_login_page;

@Listeners(Screenshot_Listner.class)

public class Testcase_4_manageprofile extends Screenshot_Listner {
	@Test
	public void Manage_Profile() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		Amazon_login_page a2= new Amazon_login_page(driver);
		
		a2.accountandlist(driver);
		a2.signinmain();
		a2.email();
		a2.continuebtn();
		a2.password();
		a2.signin();
		
		Amazon_Profile_info_page a4 = new Amazon_Profile_info_page(driver);
		a4.accountandlist(driver);
		a4.manageprofile();
		a4.View_prof();
	}

}
