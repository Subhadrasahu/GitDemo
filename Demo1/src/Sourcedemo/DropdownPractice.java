package Sourcedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		//SingleSelection dropdown
		 WebElement courseNameElement=driver.findElement(By.id("course"));
		 Thread.sleep(5000);
         Select sss=new Select(courseNameElement);
        List<WebElement>options = sss.getOptions();
        for(WebElement opt:options) {
        	if(opt.getText().equals("Python")) {
        		opt.click();
        		break;
        	}
        	
        }
      /* sss.selectByIndex(2);
         Thread.sleep(5000);
        sss.selectByValue("python");
         Thread.sleep(6000);
         sss.selectByVisibleText("Javascript");
         
         //Multiple Selection:
         WebElement ideName=driver.findElement(By.id("ide"));
        Select mld=new Select(ideName);
        mld.selectByIndex(0);
        /* Thread.sleep(5000);
         mld.selectByValue("ij");
         Thread.sleep(6000);
         mld.selectByVisibleText("NetBeans");
         
         //For Deselecting elements:
         mld.deselectByIndex(0);
         Thread.sleep(5000);
         mld.deselectByValue("ij");
         Thread.sleep(6000);
         mld.deselectByVisibleText("NetBeans");
         mld.deselectAll();
         */
	}

}
