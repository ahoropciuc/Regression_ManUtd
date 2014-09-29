package Tests;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utils.CommonUtils;
import Utils.GenericMethods;
import Constants.GlobalConstants;
import Constants.LoginPage;
import Constants.MainMenu;
import Constants.SplashPage;

public class TestURL {
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
	// TestLink TC ID :
	@Test
	public void testLoginPage() throws InterruptedException {

		driver.findElement(LoginPage.loginBarBtn).click();
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("secure"));
		driver.findElement(LoginPage.emailLogin).clear();
		driver.findElement(LoginPage.emailLogin).sendKeys(
				"andresad@mailinator.com");
		driver.findElement(LoginPage.passwordLogin).clear();
		driver.findElement(LoginPage.passwordLogin).sendKeys("andrei");
		driver.findElement(LoginPage.loginBtn).click();
		gm.verifyElementPresent(driver, LoginPage.loginDetails);
		driver.findElement(LoginPage.logoutBtn).click();
		Thread.sleep(1000);
		driver.findElement(MainMenu.newsFeatures).click();
		driver.findElement(LoginPage.loginBarBtn).click();
		driver.findElement(LoginPage.emailLogin).clear();
		driver.findElement(LoginPage.emailLogin).sendKeys(
				"andresad@mailinator.com");
		driver.findElement(LoginPage.passwordLogin).clear();
		driver.findElement(LoginPage.passwordLogin).sendKeys("andrei");
		driver.findElement(LoginPage.loginBtn).click();
		gm.verifyElementPresent(driver, LoginPage.loginDetails);
		driver.findElement(LoginPage.logoutBtn).click();
		driver.findElement(LoginPage.loginBarBtn).click();
		driver.findElement(LoginPage.emailLogin).clear();
		driver.findElement(LoginPage.emailLogin).sendKeys(
				"andresad@mailinator.com");
		driver.findElement(LoginPage.passwordLogin).clear();
		driver.findElement(LoginPage.passwordLogin).sendKeys("andrei");
		driver.findElement(LoginPage.loginBtn).click();
		gm.verifyElementPresent(driver, LoginPage.loginDetails);
		driver.findElement(MainMenu.newsFeatures).click();
		Thread.sleep(1000);
		gm.verifyElementPresent(driver, LoginPage.loginDetails);
		driver.findElement(MainMenu.fixturesResults).click();
		Thread.sleep(1000);
		gm.verifyElementPresent(driver, LoginPage.loginDetails);
		driver.findElement(MainMenu.playersStaff).click();
		Thread.sleep(1000);
		gm.verifyElementPresent(driver, LoginPage.loginDetails);
		driver.findElement(LoginPage.logoutBtn).click();

	}

	@Test
	public void testEditDetailsPage() {

		driver.findElement(LoginPage.loginBarBtn).click();
		driver.findElement(LoginPage.emailLogin).clear();
		driver.findElement(LoginPage.emailLogin).sendKeys(
				"andresad@mailinator.com");
		driver.findElement(LoginPage.passwordLogin).clear();
		driver.findElement(LoginPage.passwordLogin).sendKeys("andrei");
		driver.findElement(LoginPage.loginBtn).click();
		driver.findElement(LoginPage.detailsBtn).click();
		new Select(driver.findElement(LoginPage.yearEditDetails))
				.selectByVisibleText("1980");
		driver.findElement(LoginPage.submitBtn).click();
		driver.findElement(LoginPage.continueBtn).click();
		driver.findElement(LoginPage.detailsBtn).click();
		new Select(driver.findElement(LoginPage.yearEditDetails))
				.selectByVisibleText("1970");
		driver.findElement(LoginPage.submitBtn).click();
		driver.findElement(LoginPage.continueBtn).click();
		driver.findElement(LoginPage.logoutBtn).click();
	}

	public int generateRandom() {
		Random rand = new Random();
		int number = rand.nextInt(1000);
		System.out.println(number);
		return number;
	}

	@Test
	public void testSignUpPage() throws InterruptedException {
		int number = generateRandom();
		driver.findElement(LoginPage.signUpBtn).click();
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
		driver.findElement(LoginPage.logoutBtn).click();
		Thread.sleep(5000);

		// Validation
		driver.get(GlobalConstants.baseUrl);
		driver.findElement(LoginPage.signUpBtn).click();
		driver.findElement(LoginPage.emailAddress).clear();
		driver.findElement(LoginPage.submitBtn).click();
		gm.verifyElementPresent(driver, LoginPage.validation);

	}

	@After
	public void closeBrowser() {
		driver.quit();
	}
}
