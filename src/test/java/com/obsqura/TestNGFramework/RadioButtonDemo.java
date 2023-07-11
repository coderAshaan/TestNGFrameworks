package com.obsqura.TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonDemo extends Base {
	
	@Test
	private void radioButtonDemo() {
		// TODO Auto-generated method stub
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement radioButtonElement = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioButtonElement.click();
		Boolean isRadioButtonSelected = radioButtonElement.isSelected();

	}

}
