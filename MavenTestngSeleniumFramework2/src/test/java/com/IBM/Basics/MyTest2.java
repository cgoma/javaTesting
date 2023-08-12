package com.IBM.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest2 {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("emai")).sendKeys("monika@facebook.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		
	}
	@AfterTest
	public void teardown() {
//		driver.close();
		System.out.println("Test2 successful");
	}

}
