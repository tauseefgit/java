package com.selenium.practice.tests;

import org.testng.annotations.Test;

import com.selenium.practice.Configuration;

public class IFrameTest extends Configuration {
	

	@Test
	public void testIFrame()
	{
		pageContainer.iFramePage.switchToIFrame();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
