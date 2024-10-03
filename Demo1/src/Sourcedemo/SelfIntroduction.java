package Sourcedemo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SelfIntroduction {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver is an interface provides sets of methods
		//selenium manager
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\subha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    //SeleniumManager
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//driver.navigate();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		String parentWindowHandle = driver.getWindowHandle();
		WebElement newWindowButton = driver.findElement(By.id("newWindowBtn"));
		newWindowButton.click();
		Set<String> handles = driver.getWindowHandles();
		for(String s:handles)
		{
			System.out.println(s);
			if(!s.equals(parentWindowHandle))
			{
			 driver.switchTo().window(s);
			 driver.manage().window().maximize();
			 Thread.sleep(5000);
			 driver.findElement(By.id("firstName")).sendKeys("subhadra");
			 Thread.sleep(5000);
			 driver.close();
			}
			 
			driver.switchTo().window(parentWindowHandle);
			Thread.sleep(1000);
			driver.findElement(By.id("name")).sendKeys("hhfdhfhfg");
			
			driver.quit();
		}
	 	
	}

}
