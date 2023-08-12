package Resources;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public Properties prop;

	public WebDriver initialiseDriver () throws IOException {
	     prop = new Properties();
	     String properties = System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties";
	     FileInputStream file = new FileInputStream(properties);
	     prop.load(file);
	     
		
		String browsername = prop.getProperty("browser");
		//String browsername = "chrome";
		if (browsername.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("mE")) {
			WebDriverManager.edgedriver().setup();
		    driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
		
	}

}
