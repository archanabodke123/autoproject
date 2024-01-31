package autoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seltraining {

	public static void main(String[] args) {
		
		//chrome driver exe configuration
		BrowserUtil.setDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\archa\\git\\autoproject\\drivers\\chromedriver.exe");
		
		//object for chrome
		WebDriver driver=new ChromeDriver();
		
		//maximize window		
		driver.manage().window().maximize();
		
		//get url
		driver.get("https://www.google.com");	//https://opensource-demo.orangehrmlive.com
		
		//locate element name="q"
		By textbox = By.name("q");
		WebElement textBoxElem = driver.findElement(textbox);
		
		textBoxElem.sendKeys("Akshay Kumar", Keys.ENTER); //use varex concept to write multiple keys under one
		//textBoxElem.sendKeys(Keys.ENTER);
		
		//close current session
		driver.close();
		
		//close entire sessions
		//driver.quit();

	}

}
