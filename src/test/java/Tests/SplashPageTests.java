package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonUtils;
import Utils.GenericMethods;
import Constants.GlobalConstants;
import Constants.HomePage;
import Constants.SplashPage;

public class SplashPageTests {
	WebDriver driver = null;
	GenericMethods gm = new GenericMethods();
	CommonUtils cUtil = new CommonUtils();

	@Before
	public void setUp() {
		driver = cUtil.initializeDriver();
		driver.manage().window().maximize();
		driver.get(GlobalConstants.baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void testSplashPage() throws InterruptedException,
			ClientProtocolException, IOException {

		gm.testSrc(driver);
		Thread.sleep(5000);

		// Center

		gm.verifyElementDisplayed(driver, SplashPage.iframe);

		// Logo

		gm.verifyElementDisplayed(driver, SplashPage.logoMU);
		waitForElementPresent(driver, SplashPage.logoMUlink, 10);
		driver.findElement(SplashPage.logoMUlink).click();
		waitForElementPresent(driver, HomePage.currentItem1, 20);
		Thread.sleep(5000);

	}

	public void waitForElementPresent(WebDriver driver, By by, int seconds)
			throws ClientProtocolException, IOException {
		WebElement element = driver.findElement(by);
		new WebDriverWait(driver, seconds).until(ExpectedConditions
				.visibilityOf(element));

	}

	@After
	public void closeBrowser() {
		driver.quit();
	}

}
