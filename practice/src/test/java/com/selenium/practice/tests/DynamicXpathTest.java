package com.selenium.practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicXpathTest {
	WebDriver driver;

	public void testDynamicXpath() {
		WebElement link = driver.findElement(By.linkText("Challenging DOM"));
		link.click();

		WebElement deleteBtn = driver
				.findElement(By.xpath("//tr[td[text()='Iuvaret0'] and td[text()='Apeirian0']]/td/a[text()='delete']"));
		deleteBtn.click();
	}

}
