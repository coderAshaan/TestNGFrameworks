package com.obsqura.TestNGFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo extends Base {

	
	@Test
	public void dropDownUsingSelectClass() {
		
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id = 'single-input-field']"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Red");
		//or
		select.selectByValue("Yellow");
		//or
		select.selectByIndex(3);
		List<WebElement> colorListOptions = select.getOptions();
		int size =  colorListOptions.size();
		//Multiple drop down
		WebElement multipleDropDown = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select2 = new Select(multipleDropDown);
		//select2.isMultiple();
		Boolean isMultipleSelect = select2.isMultiple();
		select2.selectByVisibleText("Red");
		select2.selectByValue("Yellow");
		}
	
	
	@Test
	public void languageSelectionFromSeleniumWebsite() {
		String selectedlanguageName = "日本語";
		driver.navigate().to("https://www.selenium.dev/");
		List <WebElement> languagesList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		WebElement dropDown = driver.findElement(By.xpath("//a[text()='English']"));
		dropDown.click();
		for(WebElement languageList: languagesList)
		{
			String menuText = languageList.getText();
			if(menuText.equals(selectedlanguageName))
			{
				languageList.click();
				break;
			}
		}
		
	}
	
	
	@Test
	public void selectingAboutSeleniumWebsite() {
		String aboutListName= "History";
		driver.navigate().to("https://www.selenium.dev/");
		List <WebElement> about = driver.findElements(By.xpath("//div[@class='dropdown-menu']//a"));
		WebElement dropDownValue = driver.findElement(By.xpath("//a[@id='navbarDropdown']"));
		dropDownValue.click();
		for(WebElement aboutDropDown: about) {
			String menuText = aboutDropDown.getText();
			if(menuText.equals(aboutListName)) {
				aboutDropDown.click();
				break;
			}
		}
	}

}
