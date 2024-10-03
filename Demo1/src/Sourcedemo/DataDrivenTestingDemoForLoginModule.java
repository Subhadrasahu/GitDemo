package Sourcedemo;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestingDemoForLoginModule {
	private WebDriver driver;
	@BeforeClass
	public void SetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test()
	public void Signin() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@DataProvider(name="loginData")
	public Object[][] loginData()
	{
		return new Object[][]
				{
			     {"JohnSmith123","Welcome123#"}
			     
				};
	}
	
	//@SuppressWarnings("deprecation")
	@Test(dataProvider ="loginData")
	public void testlogin(String username,String password) throws InterruptedException {
		//locate username and password fileds and login
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement user_name = driver.findElement(By.xpath("//input[@id=\"id_username\"]"));
		Thread.sleep(50);
		WebElement pssword = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Thread.sleep(10);
		WebElement login=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		user_name.clear();
		pssword.clear();
		
		user_name.sendKeys(username);
		pssword.sendKeys(password);
		login.click();	
		
	}
	@AfterClass()
	public void teardown()
	{
		driver.close();
	}

}
