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

public class NestedFramePage {

	WebDriver driver;

	public NestedFramePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "frame-top")
	WebElement topFrame;

	@FindBy(how = How.NAME, using = "frame-left")
	WebElement leftFrame;

	@FindBy(how = How.NAME, using = "frame-middle")
	WebElement middleFrame;

	@FindBy(how = How.NAME, using = "frame-right")
	WebElement rightFrame;

	@FindBy(how = How.NAME, using = "frame-bottom")
	WebElement bottomFrame;

	public void switchToNestedFrames() {

		WebDriverWait wdw = new WebDriverWait(driver, 30);
		wdw.until(ExpectedConditions.visibilityOf(topFrame));
	
		driver.switchTo().frame(topFrame);
		
		driver.switchTo().frame(leftFrame);
		Assert.assertEquals("LEFT",driver.findElement(By.xpath("//body")).getText().trim());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(middleFrame);
		Assert.assertEquals( "MIDDLE", driver.findElement(By.xpath("//div")).getText().trim());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(rightFrame);
		Assert.assertEquals("RIGHT", driver.findElement(By.xpath("//body")).getText().trim());

		//driver.switchTo().parentFrame();
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(bottomFrame);
		Assert.assertEquals("BOTTOM", driver.findElement(By.xpath("//body")).getText().trim());

		driver.switchTo().defaultContent();

	}

}
