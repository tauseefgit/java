package com.selenium.practice;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Configuration {
	public static final boolean DEFAULT_ENABLE_NATIVE_EVENTS = Platform.getCurrent().is(Platform.WINDOWS);
	public WebDriver driver;
	public PageContainer pageContainer;
	

	@Parameters({ "URL" })
	@BeforeTest
	public void launchBrowser(String URL) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		pageContainer = new PageContainer(driver);
		pageContainer.initPages();

	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}



}
