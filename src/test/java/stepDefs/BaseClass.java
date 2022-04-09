package stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class BaseClass {
	
	public static WebDriver driver;
		
	@Before
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}
	
	public void TearDown() {
		
		driver.close();
	}

}
