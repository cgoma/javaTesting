package com.reports;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
	public String takeScreenshot(WebDriver driver, String testname) {
		File srcFIle=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileHandler.copy(srcFile,new File("src/../captureScreenShots/"+testname+System.currentTimeMillis()+".png"));
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		return srcFile.getAbsolutePath();
//	}
	}

}
