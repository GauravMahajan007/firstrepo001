package com.ADS.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ADS.BaseClass.Base;

public class ADS_Listners extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("failed Test");
		Failed_Scrnsht(result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}
	
	
}
