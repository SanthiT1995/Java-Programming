package WebActions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException
	{
	    
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UX504164\\eclipse-workspace\\temp\\src\\test\\resources\\driver\\chromedriver.exe");
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		return driver;
	}
}
