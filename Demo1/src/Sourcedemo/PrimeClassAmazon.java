package Sourcedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimeClassAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		//Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("//a/span[text()='Prime']"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='student-nav-content-img']/a")).click();
		
		

	}

}
