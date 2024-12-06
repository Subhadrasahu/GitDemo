package com.screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ITestListenerClass.class})
public class TestClass extends BaseClass {
	
    @Test(testName="TestGoogle")
    public void TestGoogle() {
    	
    	driver.get("https://www.google.com/");
    	driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("HYR Tutorial", Keys.ENTER);
    	JavascriptExecutor js = (JavascriptExecutor)(driver);
    	//js.executeScript("window.scrollBy(0,250)");
    	js.executeScript("window.scrollBy(0,250)");
    	//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div/div/div[1]/div/div/span/a/h3/text()")).click();
    	String expected="HYD Tutorial - Google Search";
    	String actual=driver.getTitle();
    	Assert.assertEquals(actual,expected);
    
    }
   @Test(testName="NN")
  public static void login() throws InterruptedException{
	 //WebDriverWait wait = new WebDriverWait(driver,3);
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().window().maximize();
  	System.out.println(Thread.currentThread());
  	driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
  	
  	Thread.sleep(1000);
  	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("techteam");
  	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Time4team$");
  	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
  }
   
   
}
