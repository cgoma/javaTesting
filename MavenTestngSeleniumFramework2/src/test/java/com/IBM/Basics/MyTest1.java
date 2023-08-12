package com.IBM.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest1 {
     WebDriver driver;
	@BeforeTest
	public void setuptest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch() {
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
//		driver.findElement(By.name("btnk")).submit();
	}
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test1 successful");
	}
	
}
