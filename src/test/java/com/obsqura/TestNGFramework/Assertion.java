package com.obsqura.TestNGFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assertion extends Base {
   
	@Test
	
	public void  verifySingleInputFieldWhenEnterDataOnTextFieldAndClickOnShowMessageButton () {
		
		String textFieldInput = "HELLO";
		String expectedMessage = "Your Message : " + textFieldInput;
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(textFieldInput);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText=yourMessage.getText();
		assertEquals(expectedMessage , yourMessageText , "Your Message is not " + expectedMessage);
		
	}
	
	@Test
	
	public void assertTrueSample () {
		
		String expectedValue = "ABC";
		String actualValue = "ABC";
		Boolean flag = false;
		if (expectedValue.equals(actualValue)) {
			flag = true;
		}
		
		assertTrue(flag, "Expected value and actual value are not same");
		
	}
}
