package commonfunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

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
	@BeforeMethod
	public void launchbrowser() throws IOException {
		loadproperties();
		PropertyConfigurator.configure("log4j.properties");
		String browser = properties.getProperty("browser");
		String driverlocation = properties.getProperty("Driverlocation");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password=properties.getProperty("password");
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
	@BeforeTest
	public void Extentreport() {
		extentreport=new ExtentReports();
		extentreport.setSystemInfo("Environment","Atomation");
		extentreport.setSystemInfo("Host Name", "Local Host");
		extentreport.setSystemInfo("OS", "Window 10");
		extentreport.setSystemInfo("Browser Name", "Chrome");
		extentreport.setSystemInfo("Tester Name", "Nasar F");
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport.html");
		htmlreporter.loadXMLConfig("extent-config.xml");
		extentreport.attachReporter(htmlreporter);
		ExtentTest testcase;
	}
	@AfterTest
	public void afterextentreport() {
		extentreport.flush();
	}
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
	if (result.getStatus()==ITestResult.SUCCESS) {
		testcase.log(Status.PASS,"Test case Passes "+result.getName());
	}
	else if(result.getStatus()==ITestResult.FAILURE) {
		testcase.log(Status.FAIL,"Test Case Failed "+result.getName());
		testcase.log(Status.FAIL,"Test Case Error Log "+result.getThrowable());
		String screenshotdestination=CommonFunction.takescreenshot(driver, result.getName());
		testcase.addScreenCaptureFromPath(screenshotdestination);
	}
	else if(result.getStatus()==ITestResult.SKIP) {
		testcase.log(Status.SKIP,"Test Case Skipped "+result.getName());
	}
		driver.quit();;
	}

	public static String takescreenshot(WebDriver driver,String screenshotname) throws IOException {
		String dateformat=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"/test-output/"+"/screenshot/" + screenshotname + dateformat + ".png";
		File destinationfile=new File(destination);
		FileUtils.copyFile(Sourcefile, destinationfile);
		return destination;
	}
}
