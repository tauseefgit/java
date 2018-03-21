package com.selenium.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class IFramePage {

	WebDriver driver;

	public IFramePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "mce_0_ifr")
	WebElement iFrame;

	public void switchToIFrame() {

		WebDriverWait wdw = new WebDriverWait(driver, 60);
		wdw.until(ExpectedConditions.visibilityOf(iFrame));

		driver.switchTo().frame(iFrame);
		driver.findElement(By.xpath("//body")).clear();
		driver.findElement(By.xpath("//body")).sendKeys("I suppose there is a good reason for this and thus I don't want to break other tests\r\n" + 
				"while fixing the ones affected by this issue. And of course, running tests on Windows\r\n" + 
				"is out of discussion.");
		driver.switchTo().defaultContent();
		WebElement link = driver.findElement(By.linkText("Elemental Selenium"));
		Assert.assertTrue(link.isDisplayed());
	}

}
