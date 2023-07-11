package com.obsqura.TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class Base {
	public WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	public void initialiseBrowser()
	{
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\USER\\Documents\\JavaEclipseProgs\\ObscuraAutomation\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	
	@AfterMethod
	public void browserCloseorQuit()
	{
		driver.quit();
	}
	
	
	

}