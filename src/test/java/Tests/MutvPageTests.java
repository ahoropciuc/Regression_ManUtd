package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import Utils.CommonUtils;
import Utils.GenericMethods;
import Constants.GlobalConstants;
import Constants.MutvPage;
import Constants.SplashPage;

public class MutvPageTests {
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
		driver.get(GlobalConstants.baseUrl + "/en/MUTV-New.aspx");
	}

	@Test
	public void testMutvPage() throws InterruptedException,
			ClientProtocolException, IOException {
		gm.testSrc(driver);
		Thread.sleep(3000);
		driver.findElement(MutvPage.mutvVideo).click();
		Thread.sleep(5000);
		driver.findElement(MutvPage.video).click();
	}

	@Test
	public void testWhatsOn() throws ClientProtocolException, IOException,
			InterruptedException {
		gm.testSrc(driver);
		Thread.sleep(3000);
		driver.findElement(MutvPage.whatsOn).click();
		driver.findElement(MutvPage.programmes).isDisplayed();
	}

	@Test
	public void testPresenterPundits() throws ClientProtocolException,
			IOException, InterruptedException {
		gm.testSrc(driver);
		Thread.sleep(3000);
		driver.findElement(MutvPage.presentersPundits).click();
		gm.verifyElementPresent(driver, MutvPage.presenterImage);
	}

	@Test
	public void testYourViews() {
		driver.findElement(MutvPage.yourViews).click();
		driver.findElement(MutvPage.firstName).sendKeys("Test");
		driver.findElement(MutvPage.surname).sendKeys("Test");
		driver.findElement(MutvPage.email).sendKeys("test@test.com");
		driver.findElement(MutvPage.wheredoyouLive).sendKeys("Test");
		driver.findElement(MutvPage.comments).sendKeys("Test");
		driver.findElement(MutvPage.submitBtn).click();

	}

	@After
	public void closeBrowser() {
		driver.quit();

	}
}
