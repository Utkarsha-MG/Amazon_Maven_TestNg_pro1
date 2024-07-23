package project_1_testcase_classes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import project_1_source_classes.Amazon_Home_page;
import project_1_source_classes.Amazon_login_page;
import project_1_source_classes.Amazon_product_PRD;

public class Testcase_7_PRD extends Screenshot_Listner {
	
	@Test
	
	public void Product_reviewpage() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		
        Amazon_login_page a2= new Amazon_login_page(driver);
		
		a2.accountandlist(driver);
		a2.signinmain();
		a2.email();
		a2.continuebtn();
		a2.password();
		a2.signin();
		
		Amazon_Home_page a5 = new Amazon_Home_page(driver);
		a5.Searching();
		a5.firstproduct();

		Amazon_product_PRD a7 = new Amazon_product_PRD(driver);
		a7.custreview(driver);
		a7.Customerating();
	}

}
