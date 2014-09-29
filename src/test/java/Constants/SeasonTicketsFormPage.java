package Constants;

import org.openqa.selenium.By;

public class SeasonTicketsFormPage {
	
	public static final By firstName = By.id("firstname");
	public static final By surname = By.id("surname");
	public static final By email = By.id("emailaddress");
	public static final By mobile = By.id("phonenumber");
	public static final By day = By.id("day");
	public static final By month = By.id("month");
	public static final By year = By.id("year");
	public static final By postCode = By.id("postcode");
	public static final By findBtn = By.id("findButton");
	public static final By pickList = By.xpath("//select[@id='pickList']/option[5]");
	public static final By noSeats = By.xpath("//select[@id='noseats']");
	public static final By prefferedLocations = By.xpath("//select[@id='prefferedloactions']");
	public static final By specialSeats = By.xpath("//select[@id='specialseats']");
	public static final By submitDetails = By.xpath("//input[@class='submitdetails2']");

}
