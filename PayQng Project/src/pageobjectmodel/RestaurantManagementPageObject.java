package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantManagementPageObject {
    @FindBy(xpath="//*[@id=\"sidebar_menu\"]/nav/div/div[1]/div/div/div/div/ul/li[2]/a/span")
	public static WebElement clickonrestaurant;
    
}
