package Sourcedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptAlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		driver.switchTo().alert().dismiss();
		*/
		
		/*driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		
		driver.switchTo().alert().sendKeys("Hello world");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
  */
	}

}
