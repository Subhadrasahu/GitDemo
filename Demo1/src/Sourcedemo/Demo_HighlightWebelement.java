package Sourcedemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_HighlightWebelement {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript(argument[0].setAttribute('style', 'background:yellow'));
		//js.executeScript("alert('hello')");
      
		//For Screenshots
		//TakeScreenshot ts =(TakeScreenshot) driver;
		Utils.CaptureScreenShot(driver, "img.png");
	   //driver.quit();
		
	
		

	}

}
