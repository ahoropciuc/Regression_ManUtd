package Tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utils.CommonUtils;
import Utils.GenericMethods;
import Constants.GlobalConstants;
import Constants.PlayersStaffPage;
import Constants.SplashPage;

public class PlayersStaffPageTests {
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
		driver.get(GlobalConstants.baseUrl + "/en/Players-And-Staff.aspx");
	}

	@Test
	public void testPlayersStaff() throws ClientProtocolException, IOException,
			InterruptedException {

		gm.testSrc(driver);
		Thread.sleep(3000);
		driver.findElement(PlayersStaffPage.firstTeam).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.under21).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.under18).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.manager).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.coach).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.legends).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.firstTeamBox).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.under21Box).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.legendsBox).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.under21Profile).click();
		driver.navigate().back();
		driver.findElement(PlayersStaffPage.under18Profile).click();
		driver.navigate().back();
	}

	@Test
	public void testFirstTeam() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/Players-And-Staff/First-Team.aspx");
		gm.testSrc(driver);
		Thread.sleep(3000);

		WebElement firstTeam = driver
				.findElement(PlayersStaffPage.firstTeamLanding);
		List<WebElement> firstTeamNo = firstTeam
				.findElements(PlayersStaffPage.firstTeamLandingRow);
		assertEquals(firstTeamNo.size(), 20);

	}

	@Test
	public void testRooney() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/Players-And-Staff/First-Team/Wayne-Rooney.aspx");
		gm.testSrc(driver);
		Thread.sleep(3000);
		
		driver.findElement(PlayersStaffPage.secondTab).click();
		Thread.sleep(3000);
		driver.findElement(PlayersStaffPage.thirdTab).click();
		Thread.sleep(3000);
		driver.findElement(PlayersStaffPage.firstTab).click();
		Thread.sleep(3000);

	}
	
	@After
	public void closeBrowser() {
		driver.quit();

	}
}
