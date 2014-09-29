package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import Utils.CommonUtils;
import Constants.GlobalConstants;
import Constants.MainMenu;
import Constants.SplashPage;

public class MainMenuTests {

	WebDriver driver = null;
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
	public void testNewsFeatures() throws InterruptedException {

		driver.findElement(MainMenu.newsFeatures).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.footballNews).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.unitedToday).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(MainMenu.clubNews).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.exclusiveInterviews).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.features).click();
		Thread.sleep(5000);
	}

	public void testFixturesResults() throws InterruptedException {

		String handle = driver.getWindowHandle();
		driver.findElement(MainMenu.fixturesResults).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.united).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.matchArticles).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.leagueTable).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.otherFR).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.clubStatistics).click();
		Thread.sleep(5000);
		driver.switchTo().window(handle);
	}

	public void testPlayersStaff() throws InterruptedException {
		driver.findElement(MainMenu.playersStaff).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.firstTeam).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.under).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.theAcademy).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.theManager).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.coachingStaff).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.legends).click();
		Thread.sleep(5000);
	}

	public void testOfficialMembership() throws InterruptedException {

		driver.findElement(MainMenu.officialMembership).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.joinOnline).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(MainMenu.benefits).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.prices).click();
		Thread.sleep(5000);
	}

	public void testMuseumStadiumTour() throws InterruptedException {

		driver.findElement(MainMenu.museumStadiumTour).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.welcome).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.stadiumTour).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.uniqueTours).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.redCafe).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.education).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.megastore).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.mapsDirections).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.virtualTour).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.giftIdeas).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(MainMenu.greenTourismAward).click();
		Thread.sleep(5000);
	}

	public void testClubInformation() throws InterruptedException {
		String handle = driver.getWindowHandle();
		driver.findElement(MainMenu.clubInformation).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.historyDecade).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.munichRemembered).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.trophyRoom).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.clubContacts).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.corporateSocial).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.fansForum).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.brandProtection).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.jobs).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.soccerSchools).click();
		Thread.sleep(5000);
		driver.switchTo().window(handle);
		driver.findElement(MainMenu.sponsors).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.faqs).click();
		Thread.sleep(5000);
	}

	public void testFanzone() throws InterruptedException {
		String handle = driver.getWindowHandle();
		driver.findElement(MainMenu.fanzone).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.fanNews).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.messageboards).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(MainMenu.iAmUnited).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(MainMenu.competitionsPolls).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.localSupporters).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.magazineProgramme).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(MainMenu.manUtdPics).click();
		Thread.sleep(5000);
		driver.switchTo().window(handle);
	}

	public void testMutv() throws InterruptedException {

		driver.findElement(MainMenu.mutv).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.subscribe).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.whatsOn).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.presentersPundits).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.yourViews).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.faqsMutv).click();
		Thread.sleep(5000);
	}

	public void testManUtdFinance() throws InterruptedException {

		driver.findElement(MainMenu.muFinance).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.partnersMap).click();
		Thread.sleep(5000);
		driver.findElement(MainMenu.redRewards).click();
		Thread.sleep(5000);
	}

	@After
	public void closeBrowser() {
		driver.quit();
	}
}
