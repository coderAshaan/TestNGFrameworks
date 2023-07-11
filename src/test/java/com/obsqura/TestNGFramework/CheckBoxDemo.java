package com.obsqura.TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxDemo extends Base {
	
	@Test
	public void checkBoxDemo() {
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxClick = driver.findElement(By.xpath("//input[@id = 'gridCheck']"));
		checkBoxClick.click();
		Boolean isCheckBoxIsSelected = checkBoxClick.isSelected();
		
	}

}
