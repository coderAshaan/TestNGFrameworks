package com.obsqura.TestNGFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MenuOptions extends Base {

	
	@Test
	public void menuOptionsDemo() {
		
	//	driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		
		String menuCategory = "Radio Buttons Demo";
		List<WebElement> menu = driver.findElements(By.xpath("//li[@class = 'list-group-item']//a"));
		
		for (WebElement menuOption : menu) {
			String menutext = menuOption.getText();
			if (menutext.equals(menuCategory)) {
				menuOption.click();
				break;
			}
		}
		
		
	}
}
