package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void login() throws IOException {
		
		WebDriver driver=initialiseDriver ();
		//driver.get("https://tutorialsninja.com/demo/index.php?route=account/login/");
		driver.get(prop.getProperty("url"));
		//driver.get("https://www.google.com/");
		
		LandingPage lp = new LandingPage(driver);
		lp.Myaccountdropdown().click();
		lp.Loginoption().click();
		LoginPage login = new LoginPage(driver);
		login.username().sendKeys("monikabobade@gmail.com");
		login.password().sendKeys("123123");
		login.login().click();
		
	}

}
