package com.obsqura.TestNGFramework;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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
	
	
	@Test
	public void checkMultipleCheckBoxSelected()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		boolean isSelectAllButtonDisplayed = selectAllButton.isDisplayed();

	    WebElement checkBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean isCheckBoxOneSelected = checkBoxOne.isSelected();
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean isCheckBoxTwoSelected = checkBoxTwo.isSelected();
		WebElement checkBoxThree = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean isCheckBoxThreeSelected = checkBoxThree.isSelected();
		WebElement checkBoxFour = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean isCheckBoxFourSelected = checkBoxFour.isSelected();
		
		assertTrue(isCheckBoxOneSelected,"Check box one is unselected");
		assertTrue(isCheckBoxTwoSelected,"Check box two is unselected");
		assertTrue(isCheckBoxThreeSelected,"Check box three is unselected");
		assertTrue(isCheckBoxFourSelected,"Check box four is unselected");
		assertTrue(isSelectAllButtonDisplayed, "Select all button is not displayed");
	}
	
	@Test
	public void checkMultipleCheckBoxUnSelected()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		WebElement  unSelectAll = driver.findElement(By.xpath("//input[@value='Unselect All']"));
		unSelectAll.click();
		boolean isSelectAllButtonDisplayed = unSelectAll.isDisplayed();
		
		WebElement checkBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean isCheckBoxOneSelected = checkBoxOne.isSelected();
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean isCheckBoxTwoSelected = checkBoxTwo.isSelected();
		WebElement checkBoxThree = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean isCheckBoxThreeSelected = checkBoxThree.isSelected();
		WebElement checkBoxFour = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean isCheckBoxFourSelected = checkBoxFour.isSelected();
		
		assertTrue(isSelectAllButtonDisplayed, "Unselect all is displayed");
		assertFalse(isCheckBoxOneSelected, "Check box one is selected");
		assertFalse(isCheckBoxTwoSelected, "Check box two is selected");
		assertFalse(isCheckBoxThreeSelected, "Check box three is selected");
		assertFalse(isCheckBoxFourSelected, "Check box four is selected");	
	}

}
