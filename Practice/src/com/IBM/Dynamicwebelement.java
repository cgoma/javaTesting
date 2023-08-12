package com.IBM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dynamicwebelement {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		int r = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		System.out.println(r);
		//driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]/td[1]")).getText();
		
		

	}

}
