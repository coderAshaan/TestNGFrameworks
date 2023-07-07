package com.obsqura.TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;

	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Documents\\JavaEclipseProgs\\ObscuraAutomation\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		// Launching website
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}

	@AfterMethod
	public void browserCloseOrQuit() {

		// driver.close();
		driver.quit();
	}
}
