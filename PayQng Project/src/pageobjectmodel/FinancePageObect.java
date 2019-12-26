package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinancePageObect {
@FindBy(xpath="//*[@id=\"sidebar_menu\"]/nav/div/div/div/div/ul/li[4]/a/span")	
public static WebElement clickonfinance;
@FindBy(id="date2")
public static WebElement clickonfromdate;
@FindBy(id="date3")
public static WebElement clickontodate;
@FindBy(xpath="//*[@id=\"restaurantid_chosen\"]/div/div/input")
public static WebElement selecttheresturant;
@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[4]/button")
public static WebElement clickongenerate;
@FindBy(xpath="//*[@id=\"doctoruser_filter\"]/label/input")
public static WebElement clickonsearch;
@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[1]/span")
public static WebElement clickonpdf;
@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[2]")
public static WebElement clickoncsv;
}
