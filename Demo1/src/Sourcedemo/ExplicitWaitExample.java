package Sourcedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys("selenium");
		Thread.sleep(1000);
		//Actions act =new Actions(driver);
		driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//h3[text()=\"Selenium\"]")).click();
		//h3[text()="Selenium"]
	}

}
