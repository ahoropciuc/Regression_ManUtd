package Constants;

import org.openqa.selenium.By;

public class LongLoginSignUpEditDetailsPage {
	
	public static final By loginSignUpBtn = By.xpath("//div[@class='salut']/a");
	
	public static final By signUpBtn = By.xpath("//div[@class='submitbutton clearfix']/a");
	public static final By firstNameSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_firstname");
	public static final By surnameSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_surname");
	public static final By emailSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_emailaddress");
	public static final By passwordSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_newpassword");
	public static final By confirmPasswordSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_confirmpassword");
	public static final By daySU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_day");
	public static final By monthSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_month");
	public static final By yearSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_year");
	public static final By nextStepSU = By.xpath("//div[@class='submitbutton clearfix LoginStyles']/input");
	public static final By countrySU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_ctl00_country");
	public static final By submitSU = By.xpath("submitbutton clearfix LoginStyles");
	public static final By address1SU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_ctl01_address1");
	public static final By postcodeSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_ctl01_postcode");
	public static final By submitSU2 = By.xpath("//div[@class='submitbutton clearfix LoginStyles']/input");
	public static final By continueSU = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_continueLink");
	public static final By enterSurnameSU = By.id("ctl00_body_txtSurname");
	public static final By confirmDetailsSU = By.id("ctl00_body_cmdConfirm");
	public static final By logoutSU = By.id("ctl00_body_menu1_linkSignOut");
	public static final By MUGroup = By.xpath("//input[@id='phcontent_0_ph1unitedcontent_0_phcolumn1_1_dataprot1']");
	public static final By MUCommercial = By.xpath("//input[@id='phcontent_0_ph1unitedcontent_0_phcolumn1_1_dataprot2']");
	public static final By MUGroupChecked = By.tagName("input");
	public static final By MUCommercialChecked = By.tagName("input");
	
	public static final By emailLogin = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_email");
	public static final By passwordLogin = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_password");
	public static final By loginBtn = By.id("submitlogin");
	
	public static final By loginBarBtn = By.id("btnLogin");
	public static final By editDetailsBtn = By.xpath("//a[@class='btnBlank']");
	public static final By logoutBtn = By.id("btnLogout");

}
