package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	
	@BeforeTest
	public void WebDriverSetup() {
		WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
		}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	public void CaptureScreenShot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourceFile =screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/img.png");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved Successfully");
		
	}
	
}
