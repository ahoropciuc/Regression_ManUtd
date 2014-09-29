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
import Constants.HomePage;
import Constants.SplashPage;
import Constants.LoginPage;

public class HomePageTests {

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
	public void testHomePage() throws ClientProtocolException, IOException,
			InterruptedException {
		gm.testSrc(driver);
		Thread.sleep(5000);

		// Header
		gm.verifyElementDisplayed(driver, HomePage.siteHeader);

		// Footer
		gm.verifyElementDisplayed(driver, HomePage.sponsors);
		driver.get("http://origin-www.manutd.com/en/Club/Sponsors.aspx?sponsorid={4FD83A0D-E370-411C-B54A-2E6BAF60275B}");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.get("http://origin-www.manutd.com/en/Club/Sponsors.aspx?sponsorid={B796C032-0FE8-4930-9E1C-33C4EB6C6C8F}");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.get("http://origin-www.manutd.com/en/Club/Sponsors.aspx?sponsorid={F745DA14-CB5E-4A81-816A-8DB410E47A75}");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.get("http://origin-www.manutd.com/en/Club/Sponsors.aspx");
		Thread.sleep(3000);
		driver.navigate().back();

		// Ad Column
		gm.verifyElementDisplayed(driver, HomePage.adColumn);

		// Device
		gm.verifyElementDisplayed(driver, HomePage.device);

		// Nav Base Device
		gm.verifyElementDisplayed(driver, HomePage.baseDevice);

		// 4 Rotating Stories
		driver.findElement(HomePage.currentItem1).click();
		driver.navigate().back();
		driver.findElement(HomePage.currentItem2).click();
		driver.navigate().back();
		driver.findElement(HomePage.currentItem3).click();
		driver.navigate().back();
		driver.findElement(HomePage.currentItem4).click();
		driver.navigate().back();

		// News 3 Story
		driver.findElement(HomePage.story1).click();
		driver.navigate().back();
		driver.findElement(HomePage.story2).click();
		driver.navigate().back();
		driver.findElement(HomePage.story3).click();
		driver.navigate().back();

		// News 4 Story first section
		driver.findElement(HomePage.fournews1).click();
		driver.navigate().back();
		driver.findElement(HomePage.fournews2).click();
		driver.navigate().back();
		driver.findElement(HomePage.fournews3).click();
		driver.navigate().back();
		driver.findElement(HomePage.fournews4).click();
		driver.navigate().back();

		// News 4 Story second section
		driver.findElement(HomePage.fournews5).click();
		driver.navigate().back();
		driver.findElement(HomePage.fournews6).click();
		driver.navigate().back();
		driver.findElement(HomePage.fournews7).click();
		driver.navigate().back();
		driver.findElement(HomePage.fournews8).click();
		driver.navigate().back();

	}
	
	@Test
	public void testLoginDetails() throws InterruptedException{
		
		driver.findElement(LoginPage.loginBarBtn).click();
		driver.findElement(LoginPage.emailLogin).clear();
		driver.findElement(LoginPage.emailLogin).sendKeys("andresad@mailinator.com");
		driver.findElement(LoginPage.passwordLogin).clear();
		driver.findElement(LoginPage.passwordLogin).sendKeys("andrei");
		driver.findElement(LoginPage.loginBtn).click();
		Thread.sleep(3000);
		gm.verifyElementPresent(driver, LoginPage.loginDetails);
	}

	@After
	public void closeBrowser() {
		driver.quit();

	}
}
