package commonfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ConfigureTimeout;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Common {

	public static WebDriver driver = null;
	public static Properties properties = null;
	public ExtentReports extent;
	ExtentHtmlReporter htmlreport;
	ExtentTest testcase;
	
	Logger logger = Logger.getLogger(Common.class);
	
	public Properties loadproperty() throws IOException {
		
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		 properties = new Properties();
		properties.load(fileinputstream);
		return properties;		
	}
	
@BeforeSuite
public void launchbrowser() throws IOException {
	PropertyConfigurator.configure("log4j.properties");
	htmlreport = new ExtentHtmlReporter("ExtentreportPR.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlreport);
	
	logger.info("launching the website");
	logger.info("loading property");
	
	

	loadproperty();
	String browser = properties.getProperty("browser");
	String url = properties.getProperty("url");
	String driverlocation = properties.getProperty("driverlocation");
	
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", driverlocation);
		logger.info("chrome started");
		driver = new ChromeDriver();	
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", driverlocation);
		logger.info("Firefox started");
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
	
@AfterSuite
public void closingbrowser() {
	logger.info("closing the browser and exit");
	extent.flush();
	//driver.quit();
	
}
	
	
}
