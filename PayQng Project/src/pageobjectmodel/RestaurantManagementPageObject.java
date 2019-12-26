package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantManagementPageObject {
	@FindBy(xpath="//*[@id=\"sidebar_menu\"]/nav/div/div[1]/div/div/div/div/ul/li[2]/a/span")
	public static WebElement clickonrestaurant;
	@FindBy(id="search")
	public static WebElement clickonsearchandenter;
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/button")
	public static WebElement clickonaddbutton;
	@FindBy(xpath="//*[@id=\"country_chosen\"]/a/span")
	public static WebElement clickonselectcountry;
	@FindBy(xpath="//*[@id=\"region_chosen\"]/div/div/input")
	public static WebElement clickonselectregion;
	@FindBy(xpath="//*[@id=\"city_chosen\"]/div/div/input")
	public static WebElement clickoncity;
	@FindBy(id="rest_name")
	public static WebElement enterrestaurantname;
	@FindBy(id="rest_add")
	public static WebElement enteraddress;
	@FindBy(id="rest_mobile")
	public static WebElement entercontactnumber;
	@FindBy(id="rest_email")
	public static WebElement entermailid;
	@FindBy(id="rest_gst")
	public static WebElement entergst;
	@FindBy(id="rest_share")
	public static WebElement enterpayqngshare;
	@FindBy(id="rest_service")
	public static WebElement enterservicecharge;
	@FindBy(xpath="//*[@id=\'modelone\']/div/div/div[2]/div[9]/label")
	public static WebElement clickshowvat;
	@FindBy(id="uploadedimage")
	public static WebElement clickonuploadimage;
	@FindBy(xpath="//*[@id=\"modelone\"]/div/div/div[3]/button[1]")
	public static WebElement clickonclose;
	@FindBy(xpath="//*[@id=\"modelone\"]/div/div/div[1]/button")
	public static WebElement clickonexistadd;
	@FindBy(xpath="//*[@id=\"create\"]")
	public static WebElement clickonsaveadd;
	@FindBy(id="listviewo")
	public static WebElement clickonlistview;
	@FindBy(xpath="//*[@id=\"doctoruser_filter\"]/label/input")
	public static WebElement clickonlistsearchandenter;
	@FindBy(xpath="//*[@id=\'doctoruser\']/tbody/tr/td[12]/i")
	public static WebElement clickoneditsymbol;
	@FindBy(xpath="//*[@id=\"doctoruser\"]/tbody/tr/td[13]/a/i")
	public static WebElement clickondownloadqrcode;
	@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[1]/span")
	public static WebElement clickonPdf;
	@FindBy(xpath="//*[@id=\"doctoruser_wrapper\"]/div[1]/a[2]/span")
	public static WebElement clickoncsv;
	@FindBy(xpath="//*[@id=\"doctoruser\"]/thead/tr/th[1]")
	public static WebElement clickonsortingicon;
	@FindBy(xpath="//*[@id=\"country_id_chosen\"]/div/div/input")
	public static WebElement selectonselectthecountrylist;
	@FindBy(xpath="//*[@id=\"regionid_chosen\"]/div/div/input")
	public static WebElement selectregioninlist;
	@FindBy(xpath="//*[@id=\"list_show\"]/div[3]/button")
	public static WebElement clickongeneratebutton;
}


