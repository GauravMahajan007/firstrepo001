package com.ADS.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.ADS.Utility.TestUtility;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = Logger.getLogger("Base"); 
	
	public Base(){
		
		prop = new Properties();
		FileInputStream fis;
		try {
			 fis = new FileInputStream("E:\\Wrokspace_personal\\AutomationTesting\\src\\main\\resources\\Config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void Failed_Scrnsht(String testmethodname) 
	{
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("E:\\Wrokspace_personal\\AutomationTesting"
					+ "\\Screenshots\\"+testmethodname+".png"));
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
	
	public void LaunchBrowser() {
		log.info("Initializing Browser");
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver0.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); //or use //pageLoadTimeout(TestUtility.Page_Load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //or use //implicitlyWait(TestUtility.Implicitly_Wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));;
	}
	
	
	
}
