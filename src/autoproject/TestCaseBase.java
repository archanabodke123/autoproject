package autoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseBase {
	static WebDriver driver;
	public static void beforeEveryTest()
	{
		BrowserUtil.setDriver();

		//object for chrome
		driver=new ChromeDriver();

		//maximize window		
		driver.manage().window().maximize();

		//get url
		driver.get("https://www.saucedemo.com/");

	}
	

	public static void afterEveryTest()
	{
		driver.close();

	}

}
