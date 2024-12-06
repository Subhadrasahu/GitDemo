package Sourcedemo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.TimeUnit;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dtt_excel_practice {

	private WebDriver driver;
	@BeforeClass
	public void SetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	@Test()
	public void Signin() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	//@SuppressWarnings("deprecation")
	@Test()
	public void testlogin() throws InterruptedException, IOException {
		Thread.sleep(8000);
		String filepath = "C:\\Users\\subha\\git\\repository\\Demo1\\src\\testData.csv";
		System.out.println("Filepath is: "+filepath);
		//Load the CSV file
		//FileReader reader = new FileReader(filepath);
		Reader reader = new FileReader(filepath);
		try (@SuppressWarnings("deprecation")
		CSVParser csvparser = new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
			for(CSVRecord record:csvparser)
			{
				String username1=record.get("username");
				String password1=record.get("password");
			
			
			//locate username and password fileds and login
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement user_name = driver.findElement(By.xpath("//input[@id=\"id_username\"]"));
			Thread.sleep(50);
			WebElement pssword = driver.findElement(By.xpath("//input[@name=\"password\"]"));
			Thread.sleep(10);
			WebElement login=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
			user_name.clear();
			pssword.clear();
			
			user_name.sendKeys(username1);
			pssword.sendKeys(password1);
			login.click();	
			
			}
		}
	}
	@AfterClass()
	public void teardown()
	{
		driver.close();
	}

}
