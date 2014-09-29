package Tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Constants.DCO;
import Constants.GlobalConstants;
import Constants.LoginPage;
import Constants.SplashPage;
import Utils.CommonUtils;
import Utils.GenericMethods;

public class DCOTests {
	WebDriver driver = null;
	GenericMethods gm = new GenericMethods();
	CommonUtils cUtil = new CommonUtils();

	@Before
	public void setUp() {
		driver = cUtil.initializeDriver();
		driver.manage().window().maximize();
		driver.get(GlobalConstants.baseUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(SplashPage.logoMUlink).click();
		driver.get(GlobalConstants.baseUrl);
	}

	@Test
	public void testDCO() throws ClientProtocolException, IOException,
			InterruptedException {
		gm.testSrc(driver);
		Thread.sleep(2000);
		driver.get(GlobalConstants.baseUrl + "/en/NewSignings201415/NewSignings201415News/2014/Aug/Gallery-of-Marcos-Rojo-at-the-2014-World-Cup.aspx");
		
		// Main Overlay
		gm.verifyElementPresent(driver, DCO.headerOverlay);
		gm.verifyElementPresent(driver, DCO.videoPlayer);
		gm.verifyElementPresent(driver, DCO.firstIntro);
		gm.verifyElementPresent(driver, DCO.secondIntro);
		gm.verifyElementPresent(driver, DCO.secondIntroA);
		gm.verifyElementPresent(driver, DCO.forenameLabel);
		driver.findElement(DCO.forenameInput).sendKeys("Test");
		gm.verifyElementPresent(driver, DCO.surnameLabel);
		driver.findElement(DCO.surnameInput).sendKeys("Test");
		gm.verifyElementPresent(driver, DCO.emailLabel);
		driver.findElement(DCO.emailInput).sendKeys("test@test.com");
		gm.verifyElementPresent(driver, DCO.dobLabel);
		new Select(driver.findElement(DCO.dobDayInput))
				.selectByVisibleText("11");
		new Select(driver.findElement(DCO.dobMonthInput))
				.selectByVisibleText("11");
		new Select(driver.findElement(DCO.dobYearInput))
				.selectByVisibleText("1990");
		gm.verifyElementPresent(driver, DCO.mobileLabel);
		gm.verifyElementPresent(driver, DCO.mobileText);
		driver.findElement(DCO.mobileInput).sendKeys("0770789456");
		gm.verifyElementPresent(driver, DCO.countryLabel);
		new Select(driver.findElement(DCO.countryInput))
				.selectByVisibleText("Romania");
		gm.verifyElementPresent(driver, DCO.mandatoryField);
		gm.verifyElementPresent(driver, DCO.bottomPrivacy);
		gm.verifyElementPresent(driver, DCO.privacyConsent);
		gm.verifyElementPresent(driver, DCO.privacyConsentText);
		gm.verifyElementPresent(driver, DCO.sendDetails);
		gm.verifyElementPresent(driver, DCO.muCommercialInput);
		gm.verifyElementPresent(driver, DCO.muCommercialLabel);
		gm.verifyElementPresent(driver, DCO.muGroupInput);
		gm.verifyElementPresent(driver, DCO.muGroupLabel);
		gm.verifyElementPresent(driver, DCO.muPrivacyText);
		gm.verifyElementPresent(driver, DCO.muPrivacyText2);
		gm.verifyElementPresent(driver, DCO.muPrivacyText);
		driver.findElement(DCO.submitBtn).click();

		// Thank You overlay
		gm.verifyElementPresent(driver, DCO.headerOverlay);
		gm.verifyElementPresent(driver, DCO.videoPlayer);
		gm.verifyElementPresent(driver, DCO.thankstext);
		driver.findElement(DCO.thanksCloseBtn).click();

	}

	@Test
	public void testLoginFromOverlay() throws InterruptedException {
		driver.get(GlobalConstants.baseUrl + "/en/NewSignings201415/NewSignings201415News/2014/Aug/Gallery-of-Marcos-Rojo-at-the-2014-World-Cup.aspx");
		Thread.sleep(5000);
		driver.findElement(DCO.secondIntroLogin).click();
		driver.findElement(LoginPage.emailLogin).sendKeys(
				"andresad@mailinator.com");
		driver.findElement(LoginPage.passwordLogin).sendKeys("andrei");
		driver.findElement(LoginPage.loginBtn).click();
		boolean dcoNotVisible = driver.findElement(DCO.dcoVisibility)
				.isDisplayed();
		assertFalse(dcoNotVisible);
	}

	public int generateRandom() {
		Random rand = new Random();
		int number = rand.nextInt(1000);
		System.out.println(number);
		return number;
	}

	@Test
	public void testSignUpFromOverlay() throws InterruptedException {
		driver.get(GlobalConstants.baseUrl + "/en/NewSignings201415/NewSignings201415News/2014/Aug/Gallery-of-Marcos-Rojo-at-the-2014-World-Cup.aspx");
		Thread.sleep(5000);
		driver.findElement(DCO.secondIntroLogin).click();
		driver.findElement(LoginPage.signUp).click();
		int number = generateRandom();
		driver.findElement(LoginPage.firstName).clear();
		driver.findElement(LoginPage.firstName).sendKeys("Andrei");
		driver.findElement(LoginPage.surname).clear();
		driver.findElement(LoginPage.surname).sendKeys("Horopciuc");
		String email = "test098" + number + "@mailinator.com";
		driver.findElement(LoginPage.emailAddress).clear();
		driver.findElement(LoginPage.emailAddress).sendKeys(email);
		driver.findElement(LoginPage.passwordSignUp).clear();
		driver.findElement(LoginPage.passwordSignUp).sendKeys("andrei");
		driver.findElement(LoginPage.confirmPassword).clear();
		driver.findElement(LoginPage.confirmPassword).sendKeys("andrei");
		new Select(driver.findElement(LoginPage.day)).selectByVisibleText("11");
		new Select(driver.findElement(LoginPage.month))
				.selectByVisibleText("11");
		new Select(driver.findElement(LoginPage.year))
				.selectByVisibleText("1990");
		new Select(driver.findElement(LoginPage.country))
				.selectByVisibleText("Romania");
		driver.findElement(LoginPage.submitBtn).click();
		driver.findElement(LoginPage.continueBtn).click();
		Thread.sleep(5000);
		boolean dcoNotVisible = driver.findElement(DCO.dcoVisibility)
				.isDisplayed();
		assertFalse(dcoNotVisible);
	}

	@Test
	public void testValidation() throws InterruptedException {
		driver.get(GlobalConstants.baseUrl + "/en/NewSignings201415/NewSignings201415News/2014/Aug/Gallery-of-Marcos-Rojo-at-the-2014-World-Cup.aspx");
		Thread.sleep(5000);
		driver.findElement(DCO.submitBtn).click();
		Thread.sleep(3000);
		String color = driver.findElement(DCO.forenameInput).getCssValue(
				"background-color");
		assertEquals(color, "rgba(255, 155, 155, 1)");
		driver.findElement(DCO.forenameInput).sendKeys("Test");
		driver.findElement(DCO.submitBtn).click();
		String color2 = driver.findElement(DCO.forenameInput).getAttribute(
				"style");
		assertEquals(color2, "");
	}
	
	@Test
	public void testPrivacyLinks() throws InterruptedException{
		String handle = driver.getWindowHandle();
		driver.get(GlobalConstants.baseUrl + "/en/NewSignings201415/NewSignings201415News/2014/Aug/Gallery-of-Marcos-Rojo-at-the-2014-World-Cup.aspx");
		Thread.sleep(5000);
		driver.findElement(DCO.muPrivacyClick).click();
		Thread.sleep(5000);
		driver.switchTo().window(handle);
		driver.findElement(DCO.muPrivacyClick2).click();
		Thread.sleep(5000);
		driver.switchTo().window(handle);
		driver.findElement(DCO.muPrivacyClick3).click();
		Thread.sleep(5000);
		driver.switchTo().window(handle);
	}
	
	@Test
	public void testLoginAppearance() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(LoginPage.loginBarBtn).click();
		driver.findElement(LoginPage.emailLogin).clear();
		driver.findElement(LoginPage.emailLogin).sendKeys("andresad@mailinator.com");
		driver.findElement(LoginPage.passwordLogin).clear();
		driver.findElement(LoginPage.passwordLogin).sendKeys("andrei");
		driver.findElement(LoginPage.loginBtn).click();
		Thread.sleep(3000);
		driver.get(GlobalConstants.baseUrl + "/en/NewSignings201415/NewSignings201415News/2014/Aug/Gallery-of-Marcos-Rojo-at-the-2014-World-Cup.aspx");
		boolean dcoNotVisible = driver.findElement(DCO.dcoVisibility)
				.isDisplayed();
		assertFalse(dcoNotVisible);
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
}
