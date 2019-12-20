package testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import commonfunctions.CommonFunction;
import pageobjectmodel.LoginPageObject;
import pageobjectmodel.UserManagement;

public class UserManagementTestCase extends CommonFunction {
	Logger logger=Logger.getLogger(UserManagementTestCase.class);
	public void loginpage() {
		logger.info("Entering user name");
		LoginPageObject.username.sendKeys(properties.getProperty("username"));
		testcase.pass("Entered User Name Successfully");
		logger.info("Entering password");
		testcase.pass("Entered Password Successfully");
		LoginPageObject.password.sendKeys(properties.getProperty("password"));
		logger.info("Login button going to click");
		LoginPageObject.clickonlogin.click();
		testcase.pass("Login Button Clicked Successfully");
	}
	public void click_on_usermanagement() throws InterruptedException {
		Thread.sleep(5000);
		logger.info("User Management going to click");
		UserManagement.clickonusermanagement.click();
		testcase.pass("User Management Clicked Successfully");
	}
	public void user_history() throws InterruptedException, IOException {
		Thread.sleep(5000);
		logger.info("Click on the history button");
		UserManagement.clickonhistory.click();
		testcase.pass("History Button Clicked Successfully");
		Thread.sleep(5000);
		logger.info("Click on the search button and enter the value to search");
		UserManagement.clickonsearchandenter.sendKeys("bd");
		testcase.pass("Clicked search button and entered the value searched");
		logger.info("Click on the user pdf button");
		UserManagement.clickonpdf.click();
		testcase.pass("User PDF Button Clicked Successfully");
		logger.info("Click on the user CSV Button");
		UserManagement.clickoncsv.click();
		testcase.pass("User CSV Button Clicked Successfully");
		takescreenshot();
		testcase.pass("Test Case Passed and taked Screenshot",MediaEntityBuilder.createScreenCaptureFromPath("./test-output/screenshot/payqng1.jpg").build());
		logger.info("Click on the Exist button");
		UserManagement.clickonexist.click();
		testcase.pass("Clicked Exist Button Successfully");
	}
	public void user_management_home() throws InterruptedException, IOException {
		Thread.sleep(5000);
		logger.info("Click on the next button");
		UserManagement.clickonnext.click();
		testcase.pass("Clicked Next Button Successfully");
		logger.info("Clicked the home search button and enter the value");
		UserManagement.clickonhomesearch.sendKeys("Badly");
		testcase.pass("Clicked Home Search button and value entered search done");
		logger.info("Clicked the home pdf button");
		UserManagement.clickonHomepdf.click();
		testcase.pass("Home PDF Button Clicked Successfully");
		logger.info("Clicked the Home CSV button");
		UserManagement.clickonHomecsv.click();
		testcase.pass("Clicked Home CSV Button Successfully");
	}
	@Test
	public void user_management_function_verify() throws InterruptedException, IOException {
		PageFactory.initElements(driver, LoginPageObject.class);
		PageFactory.initElements(driver, UserManagement.class);
		testcase=extentreport.createTest("User Management Test Case");	
		loginpage();
		click_on_usermanagement();
		user_history();
		user_management_home();
	}
}