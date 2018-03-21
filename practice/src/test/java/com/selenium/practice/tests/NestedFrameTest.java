package com.selenium.practice.tests;

import org.testng.annotations.Test;

import com.selenium.practice.Configuration;

public class NestedFrameTest extends Configuration {
	

	@Test
	public void testIFrame()
	{
		pageContainer.nestedFramePage.switchToNestedFrames();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
