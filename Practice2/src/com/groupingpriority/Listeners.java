package com.groupingpriority;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult itr) {
		System.out.println("my test started");
	}
	public void onTestSuccess(ITestResult itr) {
		System.out.println("Test Passed:" + itr.getName());
	}
	public void onTestFailure(ITestResult itr) {
		System.out.println("Test Failed:" + itr.getName());
	}
	public void onTestSkipped(ITestResult itr) {
		System.out.println("Test Skipped:" + itr.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult itr) {
		System.out.println("Test Failed Within Success Percentage:" + itr.getName());
	}
	
}
