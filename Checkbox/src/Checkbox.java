import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	SoftAssert softAssert1 = new SoftAssert();
	SoftAssert softAssert2 = new SoftAssert();
//	@Test
//	void demotest() {
////		softAssert1.assertTrue(true);
//		softAssert1.assertEquals("welcome", "wel");
////		softAssert2.assertEquals("Monika", "Monika");
//		System.out.println("demotest successed");
//	}
	@Test
	 void titlecheck() {
		System.out.println("Launching the browser");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Assert.assertEquals("Google", "Doogle", "URL not matched");
	}
	
	@Test
	 void login() {
		System.out.println("login successful");
	}
	
	@BeforeTest
	void befortest() {
	System.out.println("before test executed");
	}
	
	@AfterTest
	void aftertest() {
	System.out.println("after test executed");
		
//			softAssert1.assertTrue(true);
//			softAssert1.assertEquals("welcome", "wel");
//			softAssert2.assertEquals("Monika", "Monika");
//			System.out.println("demotest1 successed");
		
//		Assert.assertTrue(true);
//		Assert.assertEquals("welcome", "welcome");
//		Assert.assertEquals("Monika", "Monika");
//		System.out.println("test successed");
		
		
		
	

	}

}
