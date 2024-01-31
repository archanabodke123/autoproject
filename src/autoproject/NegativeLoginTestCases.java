package autoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.LoginModule;

public class NegativeLoginTestCases extends TestCaseBase {

	public static void verify_password_is_require_when_user_enter_no_password() {

		beforeEveryTest();

		LoginModule.login(driver, "standard_user","");

		LoginModule.validateErrorMsg(driver, "Password is required");

		afterEveryTest();

	}

	public static void verify_username_is_require_when_user_enter_no_username() {

		beforeEveryTest();

		LoginModule.login(driver, "","secret_sauce");

		LoginModule.validateErrorMsg(driver, "Username is required");

		afterEveryTest();
	}

	public static void verify_username_is_require_when_user_enter_no_username_and_password() {

		beforeEveryTest();

		LoginModule.login(driver, "","");

		LoginModule.validateErrorMsg(driver, "Username is required");

		afterEveryTest();
	}

	public static void verify_when_user_enter_invalid_username_and_password() {

		beforeEveryTest();

		LoginModule.login(driver, "test","test");

		LoginModule.validateErrorMsg(driver, "Username and password do not match any user in this service");

		afterEveryTest();
	}


}
