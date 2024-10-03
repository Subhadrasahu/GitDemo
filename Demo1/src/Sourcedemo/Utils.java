package Sourcedemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static void CaptureScreenShot(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot sc = (TakesScreenshot)driver;
		File fs =sc.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(fs,new File("./Screenshot/"+filename+""));
	}
}
