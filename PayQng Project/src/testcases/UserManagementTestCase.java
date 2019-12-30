package testcases;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import commonfunctions.CommonFunction;
import pageobjectmodel.LoginPageObject;
import pageobjectmodel.UserManagement;

public class UserManagementTestCase extends CommonFunction {
@Test(priority = 0)
	public void verfiylogin() throws InterruptedException {
		testcase=extentreport.createTest("Login Page Verify test case");
		PageFactory.initElements(driver,LoginPageObject.class);
		LoginPageObject.username.sendKeys(properties.getProperty("username"));
		LoginPageObject.password.sendKeys(properties.getProperty("password"));
		LoginPageObject.clickonlogin.click();
		Thread.sleep(5000);
		String expectedurl="https://payqngapp.com/Dashboard/Admin/home.php";
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
		testcase.info("Login Test case passed expected and Actual Result match");
			}
   @Test(priority = 1)
    public void verifyclickonusermanagement() throws InterruptedException {
    	testcase=extentreport.createTest("Verify Click on User Management function test case");
    	PageFactory.initElements(driver, LoginPageObject.class);
    	LoginPageObject.username.sendKeys(properties.getProperty("username"));
		LoginPageObject.password.sendKeys(properties.getProperty("password"));
		LoginPageObject.clickonlogin.click();
		PageFactory.initElements(driver, UserManagement.class);
		Thread.sleep(2000);
		UserManagement.clickonusermanagement.click();
		Thread.sleep(2000);
	    String actualurl=driver.getCurrentUrl();
	    String expectedurl="https://payqngapp.com/Dashboard/Admin/user.php";
	    Assert.assertEquals(actualurl, expectedurl);
	    testcase.info("Test Case Passed Actual and Expected Result Matched");
    }

}