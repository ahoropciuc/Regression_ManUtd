package Tests;

import static org.junit.Assert.assertTrue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Constants.GlobalConstants;
import Constants.LongLoginSignUpEditDetailsPage;
import Constants.SplashPage;
import Utils.CommonUtils;
import Utils.GenericMethods;

public class LongLoginSignUpEditDetailsPageTests {
	private boolean isChecked;
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
	}

	public int generateRandom() {
		Random rand = new Random();
		int number = rand.nextInt(100000);
		System.out.println(number);
		return number;
	}

	@Test
	public void testLongSignUp() throws InterruptedException {
		int number = generateRandom();
		driver.get("https://www.eticketing.co.uk/muticketsandmembership/default.aspx");
		driver.findElement(LongLoginSignUpEditDetailsPage.loginSignUpBtn)
				.click();
		driver.findElement(LongLoginSignUpEditDetailsPage.signUpBtn).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.firstNameSU)
				.sendKeys("Test");
		driver.findElement(LongLoginSignUpEditDetailsPage.surnameSU).sendKeys(
				"Test");
		String email = "test098" + number + "@mailinator.com";
		driver.findElement(LongLoginSignUpEditDetailsPage.emailSU).sendKeys(
				email);
		driver.findElement(LongLoginSignUpEditDetailsPage.passwordSU).sendKeys(
				"andrei");
		driver.findElement(LongLoginSignUpEditDetailsPage.confirmPasswordSU)
				.sendKeys("andrei");
		new Select(driver.findElement(LongLoginSignUpEditDetailsPage.daySU))
				.selectByVisibleText("11");
		new Select(driver.findElement(LongLoginSignUpEditDetailsPage.monthSU))
				.selectByVisibleText("11");
		new Select(driver.findElement(LongLoginSignUpEditDetailsPage.yearSU))
				.selectByVisibleText("1990");
		driver.findElement(LongLoginSignUpEditDetailsPage.nextStepSU).click();
		Thread.sleep(2000);
		driver.findElement(LongLoginSignUpEditDetailsPage.MUGroup).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.MUCommercial).click();
		new Select(driver.findElement(LongLoginSignUpEditDetailsPage.countrySU))
				.selectByVisibleText("Romania");
		driver.findElement(LongLoginSignUpEditDetailsPage.address1SU).sendKeys(
				"Cluj");
		driver.findElement(LongLoginSignUpEditDetailsPage.postcodeSU).sendKeys(
				"600400");
		isChecked = driver.findElement(LongLoginSignUpEditDetailsPage.MUGroup).isSelected();
		assertTrue(isChecked);
		isChecked = driver.findElement(LongLoginSignUpEditDetailsPage.MUCommercial).isSelected();
		assertTrue(isChecked);
		driver.findElement(LongLoginSignUpEditDetailsPage.submitSU2).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.continueSU).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.enterSurnameSU)
				.sendKeys("Test");
		driver.findElement(LongLoginSignUpEditDetailsPage.confirmDetailsSU)
				.click();
		driver.findElement(LongLoginSignUpEditDetailsPage.logoutSU).click();

	}

	@Test
	public void testLongLogin() {
		driver.get("https://www.eticketing.co.uk/muticketsandmembership/default.aspx");
		driver.findElement(LongLoginSignUpEditDetailsPage.loginSignUpBtn)
				.click();
		driver.findElement(LongLoginSignUpEditDetailsPage.emailLogin).sendKeys(
				"andad32@mailinator.com");
		driver.findElement(LongLoginSignUpEditDetailsPage.passwordLogin)
				.sendKeys("andrei");
		driver.findElement(LongLoginSignUpEditDetailsPage.loginBtn).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.enterSurnameSU)
				.sendKeys("andrei");
		driver.findElement(LongLoginSignUpEditDetailsPage.confirmDetailsSU)
				.click();
		driver.findElement(LongLoginSignUpEditDetailsPage.logoutSU).click();

	}

	@Test
	public void testLongEditDetails() throws InterruptedException {

		driver.get(GlobalConstants.baseUrl);
		driver.findElement(LongLoginSignUpEditDetailsPage.loginBarBtn).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.emailLogin).sendKeys(
				"andad32@mailinator.com");
		driver.findElement(LongLoginSignUpEditDetailsPage.passwordLogin)
				.sendKeys("andrei");
		driver.findElement(LongLoginSignUpEditDetailsPage.loginBtn).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.editDetailsBtn)
				.click();
		new Select(driver.findElement(LongLoginSignUpEditDetailsPage.yearSU))
				.selectByVisibleText("1980");
		driver.findElement(LongLoginSignUpEditDetailsPage.nextStepSU).click();
		Thread.sleep(2000);
		driver.findElement(LongLoginSignUpEditDetailsPage.submitSU2).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.continueSU).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.editDetailsBtn)
				.click();
		new Select(driver.findElement(LongLoginSignUpEditDetailsPage.yearSU))
				.selectByVisibleText("1990");
		driver.findElement(LongLoginSignUpEditDetailsPage.nextStepSU).click();
		Thread.sleep(2000);
		driver.findElement(LongLoginSignUpEditDetailsPage.submitSU2).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.continueSU).click();
		driver.findElement(LongLoginSignUpEditDetailsPage.logoutBtn).click();

	}

	@After
	public void closeBrowser() {
		driver.quit();

	}

}
