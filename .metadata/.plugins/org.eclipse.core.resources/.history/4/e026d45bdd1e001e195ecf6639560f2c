package com.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class test {
public static void main(String[]args) throws IOException {
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
	//ExtentSparkReporter spark = new ExtentSparkReporter("C:\tools\eclipseworkspace\PracticeExtentMaven\\report.html");
	//ExtentSparkReporter spark = new ExtentSparkReporter(".\reports\report.html");
	extent.attachReporter(spark);
	ExtentTest test1=extent.createTest("Test1");
	test1.pass("this is passs");

	ExtentTest test2=extent.createTest("Test1");
	test2.log(Status.FAIL, "This is fail");
	
	extent.createTest("Test1").skip("this is skipped");
	
	
	
	
	extent.flush();
    Desktop.getDesktop().browse(new File("report.html").toURI());
	

}
}
