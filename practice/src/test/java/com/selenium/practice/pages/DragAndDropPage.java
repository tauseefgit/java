package com.selenium.practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {

	WebDriver driver;

	public DragAndDropPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='column-a']")
	WebElement aBlock;
	
	@FindBy(how = How.XPATH, using = "//div[@id='column-b']")
	WebElement bBlock;

	public void performDragAndDrop() {
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(aBlock).moveToElement(bBlock).release().build().perform();
		//actions.dragAndDrop(aBlock, bBlock);
		
	}

}