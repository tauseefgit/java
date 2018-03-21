package com.selenium.practice.tests;

import org.testng.annotations.Test;

import com.selenium.practice.Configuration;

public class DragNDropTest extends Configuration {
	

	@Test
	public void testDragAndDrop()
	{
		
		pageContainer.dragAndDropPage.performDragAndDrop();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
