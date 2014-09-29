package Constants;

import org.openqa.selenium.By;

public class DCO {
	public static final By headerOverlay = By.xpath("//div[@class='field_wrapper']/div[1]/img");
	public static final By videoPlayer = By.xpath("//div[@class='field_wrapper']/div[2]/img");
	public static final By firstIntro = By.xpath("//div[@class='field_wrapper']/div[3]/div[contains(text(), 'Sign up for exclusive news, interviews, photos and videos PLUS your chance to win a shirt signed by the new arrivals')]");
	public static final By secondIntro = By.xpath("//div[@class='field_wrapper']/div[3]/div[2][contains(text(), 'Please enter your details below')]");
	public static final By secondIntroA = By.xpath("//div[@class='field_wrapper']/div[3]/div[2]/p[2][contains(text(), 'Already registered?')]");
	public static final By secondIntroLogin = By.xpath("//div[@class='field_wrapper']/div[3]/div[2]/p[2]/a");
	public static final By forenameLabel = By.xpath("//div[@class='selectOverlay']/div/p[1]/label[contains (text(), 'Forename')]");
	public static final By forenameInput = By.xpath("//div[@class='selectOverlay']/div/p[1]/input");
	public static final By surnameLabel = By.xpath("//div[@class='selectOverlay']/div/p[2]/label[contains (text(), 'Surname')]");
	public static final By surnameInput = By.xpath("//div[@class='selectOverlay']/div/p[2]/input");
	public static final By emailLabel = By.xpath("//div[@class='selectOverlay']/div/p[3]/label[contains (text(), 'Email')]");
	public static final By emailInput = By.xpath("//div[@class='selectOverlay']/div/p[3]/input");
	public static final By dobLabel = By.xpath("//div[@class='selectOverlay']/div/p[4]/label[contains (text(), 'DOB')]");
	public static final By dobDayInput = By.xpath("//div[@class='selectOverlay']/div/p[4]/select[1]");
	public static final By dobMonthInput = By.xpath("//div[@class='selectOverlay']/div/p[4]/select[2]");
	public static final By dobYearInput = By.xpath("//div[@class='selectOverlay']/div/p[4]/select[3]");
	public static final By mobileLabel = By.xpath("//div[@class='selectOverlay']/div/p[5]/label[contains (text(), 'Mobile')]");
	public static final By mobileInput = By.xpath("//div[@class='selectOverlay']/div/p[5]/input");
	public static final By mobileText = By.xpath("//div[@class='selectOverlay']/div/p[5]/span[contains (text(), 'Please include country code')]");
	public static final By countryLabel = By.xpath("//div[@class='selectOverlay']/div/p[6]/label[contains (text(), 'Country')]");
	public static final By countryInput = By.xpath("//div[@class='selectOverlay']/div/p[6]/select");
	public static final By mandatoryField = By.xpath("//div[@class='selectOverlay']/small[contains(text(), 'Mandatory Field')]");
	public static final By privacyConsent = By.xpath("//div[@class='privacy']/h4[contains(text(), 'Privacy Consent')]");
	public static final By privacyConsentText = By.xpath("//div[@class='privacy']/p[1][contains(text(), 'By submitting this form')]");
	public static final By sendDetails = By.xpath("//div[@class='privacy']/p[2][contains(text(), 'Don’t send me details')]");
	public static final By muGroupLabel = By.xpath("//div[@class='privacy']/p[3]/label[1][contains(text(), 'MU Group')]");
	public static final By muGroupInput = By.xpath("//div[@class='privacy']/p[3]/input[1]");
	public static final By muCommercialLabel = By.xpath("//div[@class='privacy']/p[3]/label[2][contains(text(), 'MU Commercial Partners')]");
	public static final By muCommercialInput = By.xpath("//div[@class='privacy']/p[3]/input[2]");
	public static final By bottomPrivacy = By.xpath("//div[@class='privacy']/p[3][contains(text(), 'Please click here to read the')]");
	public static final By muPrivacyText = By.xpath("//div[@class='privacy']/p[3]/a[1][contains(text(), 'MU Privacy Policy')]");
	public static final By muPrivacyClick = By.xpath("//div[@class='privacy']/p[3]/a[1]");
	public static final By muPrivacyText2 = By.xpath("//div[@class='privacy']/p[3]/a[2][contains(text(), 'MU Group companies')]");
	public static final By muPrivacyClick2 = By.xpath("//div[@class='privacy']/p[3]/a[2]");
	public static final By muPrivacyText3 = By.xpath("//div[@class='privacy']/p[3]/a[3][contains(text(), 'MU Commercial Partners')]");
	public static final By muPrivacyClick3 = By.xpath("//div[@class='privacy']/p[3]/a[3]");
	public static final By submitBtn = By.xpath("//div[@class='privacy']/p[4]/input");
	public static final By dcoVisibility = By.xpath("//div[@class='form']");
	
	public static final By thankstext = By.xpath("//div[@class='ty_intro1'][contains(text(), 'Thanks - your details are in the prize draw. Good luck!')]");
	public static final By thanksCloseBtn = By.xpath("//input[@id='closeoverlay']");

}
