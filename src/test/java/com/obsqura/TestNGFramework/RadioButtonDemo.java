package com.obsqura.TestNGFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
	
	@Test
	public void checkGroupRadioButtons()
	{
		String expectedResult = "Gender : Female"+"\n"+"Age group: 19 to 44";
		
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement patientsGenderRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		patientsGenderRadioButton.click();
		boolean isSelectedPatientsGender = patientsGenderRadioButton.isSelected();
		
		WebElement patientsAgeGroupRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		patientsAgeGroupRadioButton.click();
		boolean isSelectedPatientsAgeGroup = patientsAgeGroupRadioButton.isSelected();
		
		WebElement getResultButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		getResultButton.click();
		boolean getResultButtonIsDisplayed = getResultButton.isDisplayed();
		
		WebElement getResultText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualTextDataOfGetResult = getResultText.getText();
		
		assertTrue(isSelectedPatientsGender, "Patients gender not selected");
		assertTrue(isSelectedPatientsAgeGroup, "Patients age group is not selected");
		assertTrue(getResultButtonIsDisplayed, "Get result button is not displayed");
		assertEquals(actualTextDataOfGetResult, expectedResult, "Expected and actual result are not same");
		
		
	}


}
