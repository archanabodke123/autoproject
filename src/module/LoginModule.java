package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModule {
	
	public static void login(WebDriver driver,String username, String password)
	{
		driver.findElement(By.id("user-name")).sendKeys(username); //standard_user
		driver.findElement(By.id("password")).sendKeys(password); //secret_sauce
		driver.findElement(By.id("login-button")).click();

	}

	public static void validateErrorMsg(WebDriver driver, String errorMsg) {
		//className locator
		String errorText=driver.findElement(By.className("error-message-container")).getText();

		if(errorText.contains(errorMsg))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
