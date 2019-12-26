package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPageObect {
@FindBy(xpath="//*[@id=\"sidebar_menu\"]/nav/div/div/div/div/ul/li[3]/a/span")
public static WebElement clickonorder;
@FindBy(id="date1")
public static WebElement fromdate;
@FindBy(id="date2")
public static WebElement todate;
@FindBy(xpath="//*[@id=\"restaurant_id_chosen\"]/div/div/input")
public static WebElement  selectresturant;
@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/button")
public static WebElement clickongenerate;
@FindBy(xpath="//*[@id=\"doctoruser_filter\"]/label/input")
public static WebElement clickonsearch;
@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[1]")
public static WebElement clickonpdf;
@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[2]")
public static WebElement clickoncsv;
}
