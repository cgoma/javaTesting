package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mannu_cgoma\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    System.out.println(driver.getTitle());
    String pagetitle = driver.getTitle();
    if (pagetitle.equals("Facebook - log in or sign up"))
    {
    	System.out.println("test passed");
    }
    else {
    	System.out.println("test fail");
    }
	}

}
