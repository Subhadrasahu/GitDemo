package Sourcedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Deals")).click();
		Thread.sleep(1000);
		List<WebElement>links =driver.findElements(By.tagName("a"));
		System.out.println("Size of the links are:" +links.size());
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		Thread.sleep(1000);
		/*driver.findElement(By.xpath("//div[normalize-space()='Fire TV']")).click();
		Thread.sleep(1000);
		String text1 =driver.findElement(By.xpath("//a[normalize-space()='Learn about Fire TV']")).getText();
		String text2 =driver.findElement(By.xpath("//a[normalize-space()='Fire TV Support']")).getText();
		System.out.println(text1);
		
		System.out.println(text2);
		*/
		
		//what is broken links and how to check broken links?
		//The links are available but not redirecting to any page
	}

}
