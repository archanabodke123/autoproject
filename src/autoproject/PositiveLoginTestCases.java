package autoproject;
import org.openqa.selenium.By;

import module.LoginModule;

public class PositiveLoginTestCases extends TestCaseBase{
	
	public static void main(String[] args) {
		verify_successful_login();
	}
	
	public static void verify_successful_login()
	{
		beforeEveryTest();
		
		LoginModule.login(driver,"standard_user","secret_sauce");
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		driver.findElement(By.className("product_sort_container")).click();
		
			
		//afterEveryTest();
		
	}
	

}
