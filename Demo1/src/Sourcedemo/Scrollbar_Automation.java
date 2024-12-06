package Sourcedemo;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listener.TestListener;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Listeners({TestListener.class})
public class Scrollbar_Automation {
	public static WebDriver driver;
 
@Test
public static void Pageload() throws InterruptedException {
	System.out.println(Thread.currentThread());
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	//WebDriverWait wait = new WebDriverWait(driver,3);
	driver.get("https://dsportalapp.herokuapp.com/home");
	driver.manage().window().maximize();
}

@DataProvider(name="loginData")
public static Object[][] LoginSetData(){
	Object[][] logdata = {{"techteam","Time4team$"},{"JohnSmith123","Welcome123#"}};
	return logdata;
}
@Test(dataProvider="loginData")//(threadPoolSize=3,invocationCount=3,timeOut=1000) //invocation count is used for 
//looping/multiple times if it will execute.
public static void login(String username,String pwd) throws InterruptedException {
	Thread.sleep(1000);
	System.out.println(Thread.currentThread());
	driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
}
@Test(priority=1)
public static void StackPage() throws InterruptedException {
	System.out.println(Thread.currentThread());
	Thread.sleep(1000);
	//To scroll up and down
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
	//Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[4]/div/div/a")));
	driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/a")).click();
	try {
		js.executeScript("window.scrollBy(0,400)");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String Actualtitle= driver.getTitle();
	String expectedTitle="Stack";
	Assert.assertEquals(Actualtitle, expectedTitle);
}
@Test()
public static void OperationsInStackPage() {
	System.out.println(Thread.currentThread());
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Operations in Stack\"]")));
	driver.findElement(By.xpath("//a[text()=\"Operations in Stack\"]")).click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
}

}



