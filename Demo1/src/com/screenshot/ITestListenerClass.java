package com.screenshot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {

			try {
				CaptureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	
}
