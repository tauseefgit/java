package com.selenium.practice.tests;

import org.testng.annotations.Test;

import com.selenium.practice.Configuration;

public class MultipleWindowsTest extends Configuration {

	@Test
	public void testMultipleWindows()
	{
		pageContainer.mainPage.clickOnClickHereLink();
		pageContainer.mainPage.switchToChildWindow();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pageContainer.mainPage.switchToParentWindow();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
