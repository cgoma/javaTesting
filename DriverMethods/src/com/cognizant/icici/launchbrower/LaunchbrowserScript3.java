package com.cognizant.icici.launchbrower;

import java.io.File;
import java.time.Duration;

import javax.print.attribute.standard.Fidelity;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchbrowserScript3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    driver.findElement(By.id("email")).click();
//	    driver.findElement(By.id("email")).sendKeys("monika");
//	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sonika");
//	    driver.findElement(By.linkText("Forgotten password?")).click();
//	    int links = driver.findElements(By.tagName("a")).size();
//	    System.out.println(links);
//	    driver.findElement(By.cssSelector("#email")).sendKeys("mdb");
		
		// take screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\homepage.png");
		//FileUtils.copyFile(src, trg);
		
		
	    
	    
	    
	    
	    

		
    
    
	}

}
