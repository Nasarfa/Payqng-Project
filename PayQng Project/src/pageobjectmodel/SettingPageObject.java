package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingPageObject {
@FindBy(xpath="//*[@id=\"sidebar_menu\"]/nav/div/div/div/div/div/div/ul/li[5]/a/span")	
public static WebElement clickonsetting;
@FindBy(xpath="//*[@id=\"doctoruser_filter\"]/label/input")
public static WebElement clickonsearch;
@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[1]/span")
public static WebElement clickonpdf;
@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[2]/span")
public static WebElement clickoncsv;
@FindBy(xpath="//*[@id=\"doctoruser\"]/thead/tr/th[2]")
public static WebElement clickonsort;
@FindBy(xpath="//*[@id=\"doctoruser\"]/tbody/tr[1]/td[7]/button/i")
public static WebElement clickonaction;
@FindBy(xpath="//*[@id=\"doctoruser\"]/tbody/tr[1]/td[8]/button/i")
public static WebElement clickondelete;
@FindBy(xpath="/html/body/div[5]/div[7]/div/button")
public static WebElement clickon_yes_action;
@FindBy(xpath="/html/body/div[5]/div[7]/button")
public static WebElement clickon_nocancel_action;
@FindBy(xpath="/html/body/div[5]/div[7]/div/button")
public static WebElement clickon_ok_action;
@FindBy(xpath="/html/body/div[5]/div[7]/div/button")
public static WebElement clickon_yes_delete;
@FindBy(xpath="/html/body/div[5]/div[7]/button")
public static WebElement clickon_nocancel_delete;
@FindBy(xpath="/html/body/div[5]/div[7]/div/button")
public static WebElement clickon_ok_delete;
@FindBy(xpath="//*[@id=\"dd-user-menu\"]/img")
public static WebElement Clickonlogoutimage;
@FindBy(xpath="//*[@id=\"header_menu\"]/header/div/div/div/div[1]/div/div/a")
public static WebElement Clickonlogout;
}
