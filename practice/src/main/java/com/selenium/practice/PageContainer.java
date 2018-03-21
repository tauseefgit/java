package com.selenium.practice;

import org.openqa.selenium.WebDriver;

import com.selenium.practice.pages.DragAndDropPage;
import com.selenium.practice.pages.IFramePage;
import com.selenium.practice.pages.MultipleWindowsPage;
import com.selenium.practice.pages.NestedFramePage;

public class PageContainer {
	
	WebDriver driver;
	
	public MultipleWindowsPage mainPage;
	public DragAndDropPage dragAndDropPage;
	public IFramePage iFramePage;
	public NestedFramePage nestedFramePage;
	
	public PageContainer(WebDriver driver) {
		this.driver=driver;
		initPages();

	}
	
	
	public void initPages()
	{
		mainPage = new MultipleWindowsPage(driver);
		dragAndDropPage = new DragAndDropPage(driver);
		iFramePage = new IFramePage(driver);
		nestedFramePage = new NestedFramePage(driver);
	}

}
