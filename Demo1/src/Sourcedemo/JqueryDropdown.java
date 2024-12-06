package Sourcedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectChoiceValues(driver,"choice");
	}
	//selectChoiceValues(driver,choice)
	public static void selectChoiceValues(WebDriver driver,String...value) {
		List<WebElement>choiceLists=driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choiceLists)
			{
				String text = item.getText();
				for(String val:value) {
					if(text.equals(val))
					{
						break;
					}
				}
			}
		}
		
		else
		{
			for(WebElement item: choiceLists)
			{
				item.click();
			}
		}
	}

}
