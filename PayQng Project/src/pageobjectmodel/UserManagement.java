package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagement {

@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/a/div/p")	
public static WebElement clickonusermanagement;
@FindBy(xpath="//*[@id=\"doctoruser\"]/tbody/tr[3]/td[6]/button")
public static WebElement clickonhistory;
@FindBy(xpath="//*[@id=\"historing_filter\"]/label/input")
public static WebElement clickonsearchandenter;
@FindBy(xpath="//*[@id=\"historing_wrapper\"]/div[1]/a[1]/span")
public static WebElement clickonpdf;
@FindBy(xpath="//*[@id=\"historing_wrapper\"]/div[1]/a[2]")
public static WebElement clickoncsv;
@FindBy(xpath="//*[@id='modelone']/div/div/div[1]/button")
public static WebElement clickonexist;
@FindBy(xpath="//*[@id=\"doctoruser_next\"]/a")
public static WebElement clickonnext;
@FindBy(xpath="//*[@id='doctoruser_filter']/label/input")
public static WebElement clickonhomesearch;
@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[1]/span")
public static WebElement clickonHomepdf;
@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[2]/span")
public static WebElement clickonHomecsv;
	}

