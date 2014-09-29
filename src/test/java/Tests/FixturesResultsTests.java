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

import Constants.FixturesResults;
import Constants.GlobalConstants;
import Constants.SplashPage;
import Utils.CommonUtils;
import Utils.GenericMethods;

public class FixturesResultsTests {
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
		driver.get(GlobalConstants.baseUrl + "/en/Fixtures-And-Results.aspx");
	}

	@Test
	public void testFixtureResults() throws ClientProtocolException,
			IOException, InterruptedException {
		String handle = driver.getWindowHandle();
		gm.testSrc(driver);
		Thread.sleep(5000);

		// Fixtures & Results Table
		gm.verifyElementDisplayed(driver,
				FixturesResults.fixturesResultsTableHead);
		WebElement fixturesTable = driver
				.findElement(FixturesResults.fixturesResultsTable);
		List<WebElement> fixturesTableRow = fixturesTable
				.findElements(FixturesResults.fixturesResultsTableRow);
		assertEquals(fixturesTableRow.size(), 4);

		// Barclays Premier League Table
		gm.verifyElementDisplayed(driver, FixturesResults.barclaysTableHead);
		WebElement barclaysTable = driver
				.findElement(FixturesResults.barclaysTableBody);
		List<WebElement> barclaysTableRow = barclaysTable
				.findElements(FixturesResults.barclaysTableRow);
		assertEquals(barclaysTableRow.size(), 10);
		driver.findElement(FixturesResults.leagueLink).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Related Links
		driver.findElement(FixturesResults.relLinks1).click();
		driver.navigate().back();
		driver.findElement(FixturesResults.relLinks2).click();
		driver.switchTo().window(handle);
		driver.findElement(FixturesResults.relLinks3).click();
		driver.navigate().back();
		driver.findElement(FixturesResults.relLinks4).click();
		driver.switchTo().window(handle);

		// Devices
		gm.verifyElementDisplayed(driver, FixturesResults.betting);
		gm.verifyElementPresent(driver, FixturesResults.muLink);

	}

	@After
	public void closeBrowser() {
		driver.quit();

	}

}
