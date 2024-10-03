package Sourcedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicControlDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		//For textbox send keys
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("subhadra");
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Sahu");
		//Click operations for radio button ,for check_box,button
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("chinesechbx")).click();
		driver.findElement(By.id("spanishchbx")).click();
		driver.findElement(By.id("latinchbx")).click();
		driver.findElement(By.name("email")).sendKeys("subhadra@gmail.com");
		driver.findElement(By.name("psw")).sendKeys("abc");
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("clearbtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navigateHome")).click();
		//driver.findElement(By.xpath("//span[@class=\"ns-qh6f2-e-16\"]")).click();
		
		
		//driver.close();

	}

}
