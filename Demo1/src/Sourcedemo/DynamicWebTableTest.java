package Sourcedemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicWebTableTest {
	WebDriver driver;

	@BeforeMethod
	public void openBrowser()
	{
		driver=BrowserSelection.usingChrome();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void tripDetails()
	{
		driver.get("https://www.nyse.com/ipo-center/recent-ipo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Finding number of rows
		List<WebElement> rownumber=driver.findElements(By.xpath("/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/table/tbody/tr"));
		int rowcount = rownumber.size();
		System.out.println("No of rows in this table : " + rowcount);
		
		//Finding number of columns
				List<WebElement> columnnumber=driver.findElements(By.xpath("/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/table/thead/tr/th"));
				int ColumnCount = columnnumber.size();
				System.out.println("No of columns in this table : " + ColumnCount);
		//Finding cell value at 4th row and 3rd column
				WebElement cellAddress = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/table/tbody/tr[4]/td[3]"));
						String value = cellAddress.getText();
						System.out.println("The Cell Value is :" +value); 
	}
}
