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

import Constants.GlobalConstants;
import Constants.LoginPage;
import Constants.NewsTemplates;
import Constants.SplashPage;
import Utils.CommonUtils;
import Utils.GenericMethods;

public class NewsTemplatesTests {
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
	public void testBigImageTemplate() throws ClientProtocolException,
			IOException, InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2014/Sep/Robin van Persie excited by United transfer activity");
		gm.testSrc(driver);
		Thread.sleep(5000);
		gm.verifyElementPresent(driver, NewsTemplates.dateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.title);
		gm.verifyElementPresent(driver, NewsTemplates.paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.paragraph1a);
		gm.verifyElementPresent(driver, NewsTemplates.paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.paragraph5);
		gm.verifyElementPresent(driver, NewsTemplates.paragraph6);
		gm.verifyElementPresent(driver, NewsTemplates.socialBar);
		gm.verifyElementPresent(driver, NewsTemplates.headerPagination);
		gm.verifyElementPresent(driver, NewsTemplates.bottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.socialBar);
		gm.verifyElementPresent(driver, NewsTemplates.sidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.sidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.sidebarItem3);
		driver.findElement(NewsTemplates.nextBtn).click();
		driver.findElement(NewsTemplates.previousBtn).click();
	}

	@Test
	public void testGalleryTemplate() throws ClientProtocolException,
			IOException, InterruptedException {
		driver.findElement(LoginPage.loginBarBtn).click();
		driver.findElement(LoginPage.emailLogin).clear();
		driver.findElement(LoginPage.emailLogin).sendKeys(
				"andresad@mailinator.com");
		driver.findElement(LoginPage.passwordLogin).clear();
		driver.findElement(LoginPage.passwordLogin).sendKeys("andrei");
		driver.findElement(LoginPage.loginBtn).click();
		Thread.sleep(3000);
		driver.get(GlobalConstants.baseUrl
				+ "/en/NewSignings201415/NewSignings201415News/2014/Aug/Gallery-of-Marcos-Rojo-at-the-2014-World-Cup.aspx");
		gm.testSrc(driver);
		Thread.sleep(5000);
		gm.verifyElementPresent(driver, NewsTemplates.gtDateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.gtTitle);
		gm.verifyElementPresent(driver, NewsTemplates.gtDescription);
		gm.verifyElementPresent(driver, NewsTemplates.gtParagraph1);
		gm.verifyElementPresent(driver, NewsTemplates.gtParagraph2);
		gm.verifyElementPresent(driver, NewsTemplates.gtParagraph3);
		gm.verifyElementPresent(driver, NewsTemplates.gtParagraph4);
		gm.verifyElementPresent(driver, NewsTemplates.gtParagraph5);
		gm.verifyElementPresent(driver, NewsTemplates.gtSocial);
		gm.verifyElementPresent(driver, NewsTemplates.gtsidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.gtsidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.gtsidebarItem3);
		gm.verifyElementPresent(driver, NewsTemplates.gtsidebarItem4);
		driver.findElement(NewsTemplates.gtParagraph5Link1).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.gtParagraph5Link2).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.gtOpenGallery).click();
		Thread.sleep(3000);
		gm.verifyElementPresent(driver, NewsTemplates.gtGalleryImageText1);
		gm.verifyElementPresent(driver, NewsTemplates.gtPaginator);
		driver.findElement(NewsTemplates.gtGalleryNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.gtGalleryNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.gtGalleryNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.gtGalleryNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.gtGalleryBackBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.gtGalleryBackBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.gtGalleryBackBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.gtGalleryBackBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.gtGalleryCloseBtn).click();
	}

	@Test
	public void testFeatureTemplate() throws ClientProtocolException,
			IOException, InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Features/2014/Aug/wayne rooney profile after his appointment as manchester united captain");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.ftDate);
		gm.verifyElementPresent(driver, NewsTemplates.ftHeaderPaginator);
		gm.verifyElementPresent(driver, NewsTemplates.ftTitle);
		gm.verifyElementPresent(driver, NewsTemplates.ftIntro);
		gm.verifyElementPresent(driver, NewsTemplates.ftDescription);
		gm.verifyElementPresent(driver, NewsTemplates.ftParagraph1);
		gm.verifyElementPresent(driver, NewsTemplates.ftParagraph2);
		gm.verifyElementPresent(driver, NewsTemplates.ftParagraph3);
		gm.verifyElementPresent(driver, NewsTemplates.ftParagraph4);
		gm.verifyElementPresent(driver, NewsTemplates.ftParagraph5);
		gm.verifyElementPresent(driver, NewsTemplates.ftParagraph6);
		gm.verifyElementPresent(driver, NewsTemplates.ftBottomPaginator);
		gm.verifyElementPresent(driver, NewsTemplates.ftNewsRate);
		gm.verifyElementPresent(driver, NewsTemplates.ftSocial);
		driver.findElement(NewsTemplates.ftHeaderNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.ftBottomNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.ftBottomPreviousBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.ftBottomPreviousBtn).click();
		Thread.sleep(3000);
	}

	@Test
	public void testTemplate1() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2014/Sep/Sir Bobby Charlton has faith in Louis van Gaal");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t1DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t1Title);
		gm.verifyElementPresent(driver, NewsTemplates.t1Description);
		gm.verifyElementPresent(driver, NewsTemplates.t1Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t1Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t1Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t1Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t1Paragraph5);
		gm.verifyElementPresent(driver, NewsTemplates.t1Paragraph6);
		driver.findElement(NewsTemplates.t1Paragraph6Link1).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t1Paragraph6Link2).click();
		Thread.sleep(3000);
		driver.navigate().back();
		gm.verifyElementPresent(driver, NewsTemplates.t1Social);
		gm.verifyElementPresent(driver, NewsTemplates.t1SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t1SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t1SidebarItem3);
	}

	@Test
	public void testTemplate2() {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Various Articles/2014/Aug/Rojo Competition Terms and Conditions");
		gm.verifyElementPresent(driver, NewsTemplates.t2Date);
		gm.verifyElementPresent(driver, NewsTemplates.t2HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t2Entry);
		gm.verifyElementPresent(driver, NewsTemplates.t2EntryParagraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t2EntryParagraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t2EntryParagraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t2EntryParagraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t2EntryParagraph5);
		gm.verifyElementPresent(driver, NewsTemplates.t2EntryParagraph6);
		gm.verifyElementPresent(driver, NewsTemplates.t2Prize);
		gm.verifyElementPresent(driver, NewsTemplates.t2PrizeParagraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t2PrizeParagraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t2PrizeParagraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t2Winner);
		gm.verifyElementPresent(driver, NewsTemplates.t2WinnerParagraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t2WinnerParagraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t2WinnerParagraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t2Social);
		gm.verifyElementPresent(driver, NewsTemplates.t2BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t2SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t2SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t2SidebarItem3);
		driver.findElement(NewsTemplates.t2BottomNextPagitationClick).click();
		driver.findElement(NewsTemplates.t2BottomPreviousPagitationClick)
				.click();
	}

	@Test
	public void testTemplate3() throws ClientProtocolException, IOException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Features/2014/Jul/patrice evra appearance record");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t3DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t3Title);
		gm.verifyElementPresent(driver, NewsTemplates.t3Description);
		gm.verifyElementPresent(driver, NewsTemplates.t3Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t3Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t3Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t3Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t3Social);
		gm.verifyElementPresent(driver, NewsTemplates.t3FreeTextTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t3FreeTextYear);
		gm.verifyElementPresent(driver, NewsTemplates.t3FreeTextAppearance);
		gm.verifyElementPresent(driver, NewsTemplates.t3SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t3SidebarItem1);
	}

	@Test
	public void testTemplate4() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/Players-And-Staff/Reserves/Reserves-News/2009/Feb/Reserves-match-postponed.aspx");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t4BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t4Reserve);
		gm.verifyElementPresent(driver, NewsTemplates.t4DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t4Description);
		gm.verifyElementPresent(driver, NewsTemplates.t4HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t4SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t4SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t4SidebarItem3);
		gm.verifyElementPresent(driver, NewsTemplates.t4SidebarItem4);
		gm.verifyElementPresent(driver, NewsTemplates.t4SidebarItem5);
		gm.verifyElementPresent(driver, NewsTemplates.t4Social);
		gm.verifyElementPresent(driver, NewsTemplates.t4Title);
		gm.verifyElementPresent(driver, NewsTemplates.t4UnitedReserves);
		driver.findElement(NewsTemplates.t4HeaderNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.t4BottomPrevBtn).click();
	}

	@Test
	public void testTemplate5() throws InterruptedException,
			ClientProtocolException, IOException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News-And-Features/Football-News/2014/Sep/demetri-mitchell-relishing-england-under-18-outing.aspx");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t5BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t5DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t5Description);
		gm.verifyElementPresent(driver, NewsTemplates.t5HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t5ImageText1);
		gm.verifyElementPresent(driver, NewsTemplates.t5ImageText2);
		gm.verifyElementPresent(driver, NewsTemplates.t5Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t5Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t5Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t5Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t5Paragraph5);
		gm.verifyElementPresent(driver, NewsTemplates.t5Paragraph6);
		gm.verifyElementPresent(driver, NewsTemplates.t5Paragraph7);
		gm.verifyElementPresent(driver, NewsTemplates.t5SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t5SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t5SidebarItem3);
		gm.verifyElementPresent(driver, NewsTemplates.t5Social);
		gm.verifyElementPresent(driver, NewsTemplates.t5Title);
		driver.findElement(NewsTemplates.t5HeaderNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.t5BottomprevBtn).click();
	}

	@Test
	public void testTemplate6() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News-And-Features/Football-News/2012/Dec/eric-cantona-says-manchester-united-are-as-strong-as-past-years.aspx");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t6BannerParagraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t6BannerParagraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t6BannerParagraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t6BannerParagraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t6BannerParagraph5);
		gm.verifyElementPresent(driver, NewsTemplates.t6BannerParagraph6);
		gm.verifyElementPresent(driver, NewsTemplates.t6BannerParagraph7);
		gm.verifyElementPresent(driver, NewsTemplates.t6BannerTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t6BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t6Description);
		gm.verifyElementPresent(driver, NewsTemplates.t6HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t6Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t6Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t6Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t6Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t6SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t6SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t6SidebarItem3);
		gm.verifyElementPresent(driver, NewsTemplates.t6Social);
		gm.verifyElementPresent(driver, NewsTemplates.t6Title);
		driver.findElement(NewsTemplates.t6BottomNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.t6HeaderPrevBtn).click();
	}

	@Test
	public void testTemplate7() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2013/Feb/guide to march title race fixtures for manchester united and manchester city");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t7TableHead);
		WebElement barclaysTable = driver
				.findElement(NewsTemplates.t7TableBody);
		List<WebElement> barclaysTableRow = barclaysTable
				.findElements(NewsTemplates.t7TableBodyRow);
		assertEquals(barclaysTableRow.size(), 10);
		gm.verifyElementPresent(driver, NewsTemplates.t7BannerTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t7BannerText);
		gm.verifyElementPresent(driver, NewsTemplates.t7DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t7HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t7Title);
		gm.verifyElementPresent(driver, NewsTemplates.t7Description);
		gm.verifyElementPresent(driver, NewsTemplates.t7Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t7Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t7Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t7Social);
		gm.verifyElementPresent(driver, NewsTemplates.t7BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t7SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t7SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t7SidebarItem3);
		driver.findElement(NewsTemplates.t7HeaderNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.t7HeaderNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.t7BottomPrevBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.t7BottomPrevBtn).click();
		Thread.sleep(3000);
	}

	@Test
	public void testTemplate8() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2010/Feb/Chelseas lead cut");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t8DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t8BannerTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t8BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t8Description);
		gm.verifyElementPresent(driver, NewsTemplates.t8HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t8Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t8Social);
		gm.verifyElementPresent(driver, NewsTemplates.t8SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t8SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t8SidebarItem3);
		gm.verifyElementPresent(driver, NewsTemplates.t8TableHead);
		gm.verifyElementPresent(driver, NewsTemplates.t8Title);
		WebElement barclaysTable = driver
				.findElement(NewsTemplates.t8TableBody);
		List<WebElement> barclaysTableRow = barclaysTable
				.findElements(NewsTemplates.t8TableBodyRow);
		assertEquals(barclaysTableRow.size(), 6);
		driver.findElement(NewsTemplates.t8HeaderNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.t8BottomPrevBtn).click();
	}

	@Test
	public void testTemplate9() {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2010/Mar/Reds in pole position");
		gm.verifyElementPresent(driver, NewsTemplates.t9TableHead);
		WebElement barclaysTable = driver
				.findElement(NewsTemplates.t9TableBody);
		List<WebElement> barclaysTableRow = barclaysTable
				.findElements(NewsTemplates.t9TableBodyRow);
		assertEquals(barclaysTableRow.size(), 8);
		gm.verifyElementPresent(driver, NewsTemplates.t9DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t9Title);
		gm.verifyElementPresent(driver, NewsTemplates.t9Description);
		gm.verifyElementPresent(driver, NewsTemplates.t9Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t9Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t9Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t9NewsRate);
		gm.verifyElementPresent(driver, NewsTemplates.t9Facebook);
		gm.verifyElementPresent(driver, NewsTemplates.t9SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t9SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t9SidebarItem3);
	}

	@Test
	public void testTemplate10() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2013/Aug/manchester united release squad numbers for 2013 2014");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t10BannerTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t10BannerDescription);
		gm.verifyElementPresent(driver, NewsTemplates.t10DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t10Title);
		gm.verifyElementPresent(driver, NewsTemplates.t10Description);
		gm.verifyElementPresent(driver, NewsTemplates.t10Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t10Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t10More);
		gm.verifyElementPresent(driver, NewsTemplates.t10Link1Text);
		gm.verifyElementPresent(driver, NewsTemplates.t10Link2Text);
		gm.verifyElementPresent(driver, NewsTemplates.t10Social);
		gm.verifyElementPresent(driver, NewsTemplates.t10SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t10SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t10SidebarItem3);
		driver.findElement(NewsTemplates.t10Link1).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t10Link2).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test
	public void testTemplate11() throws ClientProtocolException, IOException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Club News/2010/Jan/Wear RED to combat AIDS");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t11DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t11Title);
		gm.verifyElementPresent(driver, NewsTemplates.t11Description);
		gm.verifyElementPresent(driver, NewsTemplates.t11Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t11Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t11Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t11Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t11Exclusive);
		gm.verifyElementPresent(driver, NewsTemplates.t11Social);
		gm.verifyElementPresent(driver, NewsTemplates.t11Competition);
		gm.verifyElementPresent(driver, NewsTemplates.t11NikeStore);
		gm.verifyElementPresent(driver, NewsTemplates.t11SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t11SidebarItem2);
	}

	@Test
	public void testTemplate12() throws ClientProtocolException, IOException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2009/Mar/Betting Liverpool");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t12BannerTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t12BannerText);
		gm.verifyElementPresent(driver, NewsTemplates.t12Device1);
		gm.verifyElementPresent(driver, NewsTemplates.t12Device2);
		gm.verifyElementPresent(driver, NewsTemplates.t12DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t12HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t12Title);
		gm.verifyElementPresent(driver, NewsTemplates.t12Description);
		gm.verifyElementPresent(driver, NewsTemplates.t12BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t12Social);
		gm.verifyElementPresent(driver, NewsTemplates.t12SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t12SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t12SidebarItem3);
		gm.verifyElementPresent(driver, NewsTemplates.t12SidebarItem4);
	}

	@Test
	public void testTemplate13() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/What The Papers Say/2013/Mar/Papers De Gea wants to stay at United");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t13PapersTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t13PapersText);
		gm.verifyElementPresent(driver, NewsTemplates.t13Date);
		gm.verifyElementPresent(driver, NewsTemplates.t13Title);
		gm.verifyElementPresent(driver, NewsTemplates.t13ImageDescription);
		gm.verifyElementPresent(driver, NewsTemplates.t13Description);
		gm.verifyElementPresent(driver, NewsTemplates.t13Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t13Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t13Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t13Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t13More);
		gm.verifyElementPresent(driver, NewsTemplates.t13Link1Text);
		gm.verifyElementPresent(driver, NewsTemplates.t13Link2Text);
		gm.verifyElementPresent(driver, NewsTemplates.t13Link3Text);
		gm.verifyElementPresent(driver, NewsTemplates.t13Social);
		gm.verifyElementPresent(driver, NewsTemplates.t13SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t13SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t13SidebarItem3);
		gm.verifyElementPresent(driver, NewsTemplates.t13Author);
		driver.findElement(NewsTemplates.t13Link1).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t13Link2).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t13Link3).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test
	public void testTemplate14() throws ClientProtocolException, IOException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Club News/2006/Dec/David Gill");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t14Date);
		gm.verifyElementPresent(driver, NewsTemplates.t14Title);
		gm.verifyElementPresent(driver, NewsTemplates.t14Description);
		gm.verifyElementPresent(driver, NewsTemplates.t14Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t14Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t14Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t14Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t14Paragraph5);
		gm.verifyElementPresent(driver, NewsTemplates.t14PhotoCredit);
		gm.verifyElementPresent(driver, NewsTemplates.t14NewsRate);
		gm.verifyElementPresent(driver, NewsTemplates.t14Facebook);
	}

	@Test
	public void testTemplate15() {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Features/2012/May/video best of ruud van nistelrooy");
		gm.verifyElementPresent(driver, NewsTemplates.t15BannerText1);
		gm.verifyElementPresent(driver, NewsTemplates.t15BannerText2);
		gm.verifyElementPresent(driver, NewsTemplates.t15BannerText3);
		gm.verifyElementPresent(driver, NewsTemplates.t15BannerText4);
		gm.verifyElementPresent(driver, NewsTemplates.t15BannerText5);
		gm.verifyElementPresent(driver, NewsTemplates.t15BannerText6);
		gm.verifyElementPresent(driver, NewsTemplates.t15BannerText7);
		gm.verifyElementPresent(driver, NewsTemplates.t15BannerText8);
		gm.verifyElementPresent(driver, NewsTemplates.t15DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t15Title);
		gm.verifyElementPresent(driver, NewsTemplates.t15Description);
		gm.verifyElementPresent(driver, NewsTemplates.t15Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t15Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t15Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t15Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t15Paragraph5);
		gm.verifyElementPresent(driver, NewsTemplates.t15Social);
		gm.verifyElementPresent(driver, NewsTemplates.t15SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t15SidebarItem2);
	}

	@Test
	public void testTemplate17() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2014/Sep/ashley young tells inside united he is enjoying senior role in squad");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t17BannerTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t17BannerParagraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t17BannerParagraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t17DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t17Title);
		gm.verifyElementPresent(driver, NewsTemplates.t17Description);
		gm.verifyElementPresent(driver, NewsTemplates.t17Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t17Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t17Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t17Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t17Paragraph5);
		gm.verifyElementPresent(driver, NewsTemplates.t17Paragraph6);
		gm.verifyElementPresent(driver, NewsTemplates.t17More);
		gm.verifyElementPresent(driver, NewsTemplates.t17MoreText1);
		gm.verifyElementPresent(driver, NewsTemplates.t17MoreText2);
		gm.verifyElementPresent(driver, NewsTemplates.t17Social);
		gm.verifyElementPresent(driver, NewsTemplates.t17Device1);
		gm.verifyElementPresent(driver, NewsTemplates.t17Device2);
		driver.findElement(NewsTemplates.t17MoreLink1).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t17MoreLink2).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test
	public void testTemplate19() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/Fanzone/News And Blogs/2013/Mar/11 to 16 March today at old trafford blog");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t19DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t19HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t19Title);
		gm.verifyElementPresent(driver, NewsTemplates.t19Description);
		gm.verifyElementPresent(driver, NewsTemplates.t19Saturday);
		gm.verifyElementPresent(driver, NewsTemplates.t19Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t19Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t19Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t19Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t19Paragraph5);
		gm.verifyElementPresent(driver, NewsTemplates.t19Social);
		gm.verifyElementPresent(driver, NewsTemplates.t19BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t19RelatedText1);
		gm.verifyElementPresent(driver, NewsTemplates.t19RelatedText2);
		gm.verifyElementPresent(driver, NewsTemplates.t19RelatedText3);
		driver.findElement(NewsTemplates.t19HeaderNextBtn).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t19BottomPrevtBtn).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t19RelatedLink1).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t19RelatedLink2).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t19RelatedLink3).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test
	public void testTemplate20() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Football News/2010/Nov/Berba's century");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t20DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t20HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t20Title);
		gm.verifyElementPresent(driver, NewsTemplates.t20Description);
		gm.verifyElementPresent(driver, NewsTemplates.t20Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t20Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t20Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t20Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t20BottomPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t20Social);
		gm.verifyElementPresent(driver, NewsTemplates.t20SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t20SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t20BannerTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t20BannerText1);
		gm.verifyElementPresent(driver, NewsTemplates.t20BannerText2);
		gm.verifyElementPresent(driver, NewsTemplates.t20BannerText3);
		gm.verifyElementPresent(driver, NewsTemplates.t20BannerText4);
		gm.verifyElementPresent(driver, NewsTemplates.t20BannerText5);
		gm.verifyElementPresent(driver, NewsTemplates.t20BannerText6);
		driver.findElement(NewsTemplates.t20HeaderNextBtn).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t20BottomPrevtBtn).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test
	public void testTemplate21() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Various Articles/2011/Apr/Vote Player of the Year 2011");
		gm.testSrc(driver);
		gm.verifyElementPresent(driver, NewsTemplates.t21BannerTitle);
		gm.verifyElementPresent(driver, NewsTemplates.t21BannerDescription);
		gm.verifyElementPresent(driver, NewsTemplates.t21BannerLinkText1);
		gm.verifyElementPresent(driver, NewsTemplates.t21BannerLinkText2);
		gm.verifyElementPresent(driver, NewsTemplates.t21BannerText1);
		gm.verifyElementPresent(driver, NewsTemplates.t21BannerText2);
		gm.verifyElementPresent(driver, NewsTemplates.t21BannerText3);
		gm.verifyElementPresent(driver, NewsTemplates.t21BannerText4);
		driver.findElement(NewsTemplates.t21BannerLink1).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t21BannerLink2).click();
		Thread.sleep(3000);
		driver.navigate().back();
		gm.verifyElementPresent(driver, NewsTemplates.t21DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t21Title);
		gm.verifyElementPresent(driver, NewsTemplates.t21Description);
		gm.verifyElementPresent(driver, NewsTemplates.t21Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t21Paragraph1Text);
		gm.verifyElementPresent(driver, NewsTemplates.t21Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t21Paragraph2Text);
		gm.verifyElementPresent(driver, NewsTemplates.t21Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t21Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t21SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t21SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t21SidebarItem3);
		gm.verifyElementPresent(driver, NewsTemplates.t21SidebarItem4);
		gm.verifyElementPresent(driver, NewsTemplates.t21Social);
		driver.findElement(NewsTemplates.t21Paragraph1Link).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t21Paragraph2Link).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test
	public void testTemplate22() throws ClientProtocolException, IOException,
			InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/Features/2014/Sep/Video on Louis van Gaal five debutants");
		gm.testSrc(driver);
		driver.findElement(NewsTemplates.t22PlayBtn).click();
		Thread.sleep(5000);
		driver.findElement(NewsTemplates.t22StopBtn).click();
		gm.verifyElementPresent(driver, NewsTemplates.t22DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t22Title);
		gm.verifyElementPresent(driver, NewsTemplates.t22Description);
		gm.verifyElementPresent(driver, NewsTemplates.t22Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t22Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t22Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t22Paragraph4);
		gm.verifyElementPresent(driver, NewsTemplates.t22More);
		gm.verifyElementPresent(driver, NewsTemplates.t22MoreText1);
		gm.verifyElementPresent(driver, NewsTemplates.t22MoreText2);
		gm.verifyElementPresent(driver, NewsTemplates.t22SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t22SidebarItem2);
		gm.verifyElementPresent(driver, NewsTemplates.t22SidebarItem3);
		driver.findElement(NewsTemplates.t22MoreLink1).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(NewsTemplates.t22MoreLink2).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test
	public void testTemplate23() throws ClientProtocolException, IOException, InterruptedException {
		driver.get(GlobalConstants.baseUrl
				+ "/en/News And Features/United Today/United Today/2014/Mar/Official blog manchester united today 3 March to 7 March 2014");
		gm.testSrc(driver);
		driver.findElement(NewsTemplates.t23PlayBtn).click();
		Thread.sleep(5000);
		driver.findElement(NewsTemplates.t23StopBtn).click();
		driver.findElement(NewsTemplates.t23NextBtnVideo).click();
		driver.findElement(NewsTemplates.t23VideoSide).click();
		Thread.sleep(5000);
		driver.findElement(NewsTemplates.t23StopBtn).click();
		driver.findElement(NewsTemplates.t23PrevBtnVideo).click();
		gm.verifyElementPresent(driver, NewsTemplates.t23DateAuthor);
		gm.verifyElementPresent(driver, NewsTemplates.t23HeaderPagination);
		gm.verifyElementPresent(driver, NewsTemplates.t23Title);
		gm.verifyElementPresent(driver, NewsTemplates.t23Follow);
		gm.verifyElementPresent(driver, NewsTemplates.t23Description);
		gm.verifyElementPresent(driver, NewsTemplates.t23Friday);
		gm.verifyElementPresent(driver, NewsTemplates.t23Paragraph1);
		gm.verifyElementPresent(driver, NewsTemplates.t23Paragraph2);
		gm.verifyElementPresent(driver, NewsTemplates.t23Paragraph3);
		gm.verifyElementPresent(driver, NewsTemplates.t23Social);
		gm.verifyElementPresent(driver, NewsTemplates.t23SidebarItem1);
		gm.verifyElementPresent(driver, NewsTemplates.t23BottomPagination);
		driver.findElement(NewsTemplates.t23HeaderNextBtn).click();
		Thread.sleep(3000);
		driver.findElement(NewsTemplates.t23BottomPrevBtn).click();
		Thread.sleep(3000);
	}

	@After
	public void closeBrowser() {
		driver.quit();
	}

}
