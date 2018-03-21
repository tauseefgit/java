package com.selenium.practice.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MultipleWindowsPage {
	
	WebDriver driver;

	String parentHandle;
	String childHandle;
	
	public MultipleWindowsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Click Here")
	WebElement clickHereLink;
	
	
	public void clickOnClickHereLink()
	{
		clickHereLink.click();
	}
	
	
	public void switchToChildWindow()
	{
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		Iterator<String> itr = handles.iterator();

		parentHandle = itr.next();
		childHandle = itr.next();
		driver.switchTo().window(childHandle);
	}
	
	public void switchToParentWindow()
	{
		driver.switchTo().window(parentHandle);
	}
	
	
	

}
