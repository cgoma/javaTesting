
package Test;
import java.util.Date;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public void loginwithvalidcredentials() {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://tutorialsninja.com/demo/");
	 driver.findElement(By.xpath("//span[text()='My Account']"));
	 driver.findElement(By.linkText("Login"));
	 driver.findElement(By.name("email")).sendKeys("asdfg@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("12345");
	 driver.findElement(By.xpath("//input[@value='Login']")).click();
	 Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("//div[contains(@class,'alert-dismissible')])"));
		}
	public String GenerateTimeStamp() {
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":","_");
	}

}
