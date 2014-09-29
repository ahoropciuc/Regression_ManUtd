package Constants;

import org.openqa.selenium.By;

public class LoginPage {

	public static final By emailLogin = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_email");
	public static final By passwordLogin = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_password");
	public static final By loginBtn = By.id("submitlogin");
	public static final By logoutBtn = By.id("btnLogout");
	public static final By loginBarBtn = By.id("btnLogin");
	
	public static final By detailsBtn = By.xpath("//a[@class='btnBlank']");
	public static final By yearEditDetails = By.id("phcontent_1_year");
	
	public static final By firstName = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_firstname");
	public static final By surname = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_surname");
	public static final By emailAddress = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_emailaddress");
	public static final By passwordSignUp = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_newpassword");
	public static final By confirmPassword = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_confirmpassword");
	public static final By day = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_day");
	public static final By month = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_month");
	public static final By year = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_year");
	public static final By country = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_country");
	public static final By submitBtn = By.id("submitreg3");
	public static final By continueBtn = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_continueLink");
	public static final By validation = By.id("phcontent_0_ph1unitedcontent_0_phcolumn1_1_validationPh");
	public static final By signUpBtn = By.id("btnSignup");
	public static final By loginDetails = By.xpath("//div[@id='loginwelcome']/div");
	public static final By signUp = By.xpath("//a[@class='ousubmitStaticLogin']");
}
