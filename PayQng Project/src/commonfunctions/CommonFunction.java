package commonfunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CommonFunction {
	public static Properties properties;
	public static WebDriver driver;
	public static ExtentReports extentreport;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest testcase;
	Logger logger=Logger.getLogger(CommonFunction.class);
	public Properties loadproperties() throws IOException {
		properties =new Properties();
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties.load(fileInputStream);
		return properties;
	}
	public void takescreenshot() throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		File Destinationfile=new File("./test-output/screenshot/payqng1.jpg");
		FileHandler.copy(sourcefile, Destinationfile);
	}
	@BeforeSuite
	public void launchbrowser() throws IOException {
		loadproperties();
		PropertyConfigurator.configure("log4j.properties");
		String browser = properties.getProperty("browser");
		String driverlocation = properties.getProperty("Driverlocation");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password=properties.getProperty("password");
		extentreport=new ExtentReports();
		htmlreporter=new ExtentHtmlReporter("ExtentReport.html");
		extentreport.attachReporter(htmlreporter);
		if (browser.equals("chrome")) {
			logger.info("Browser Launching");
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver=new ChromeDriver();

		}else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver=new FirefoxDriver();		
		}
		logger.info("Browser maximise");
		driver.manage().window().maximize();
		logger.info("Browser Navigated to the Payqng Admin Dashboard");
		driver.get(url);
	}
	@AfterSuite
	public void teardown() {
		logger.info("Browser closed Successfully");
		extentreport.flush();
		driver.quit();

	}


}
