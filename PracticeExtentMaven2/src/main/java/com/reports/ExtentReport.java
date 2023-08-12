package com.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
public static void main(String[]args) throws IOException {
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
	//ExtentSparkReporter spark = new ExtentSparkReporter("C:\tools\eclipseworkspace\PracticeExtentMaven\\report.html");
	//ExtentSparkReporter spark = new ExtentSparkReporter(".\reports\report.html");
	extent.attachReporter(spark);
//system information to report
	extent.setSystemInfo("Machine", "PC1");
	extent.setSystemInfo("OS", "Windows10");
	extent.setSystemInfo("Browser", "chrome");
	extent.setSystemInfo("User", "Monika");
	
	//Configure look & feel to report
	spark.config().setTheme(Theme.STANDARD);
	spark.config().setDocumentTitle("MyprojectReport");
	
	
	
	
	
	extent.flush();
    Desktop.getDesktop().browse(new File("report.html").toURI());
	

}
}
