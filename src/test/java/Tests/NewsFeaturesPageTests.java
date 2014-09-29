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
import Constants.NewsFeatures;
import Constants.SplashPage;

public class NewsFeaturesPageTests {
	WebDriver driver = null;
	GenericMethods gm = new GenericMethods();
	CommonUtils cUtil = new CommonUtils();
	
	@Before
	public void setUp(){
		driver = cUtil.initializeDriver();
		driver.manage().window().maximize();
	    driver.get(GlobalConstants.baseUrl);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(SplashPage.logoMUlink).click();
	    driver.get(GlobalConstants.baseUrl + "/en/News-And-Features.aspx");
	}
	
	@Test
	public void testNewsFeatures() throws ClientProtocolException, IOException, InterruptedException {
		
		gm.testSrc(driver);
		Thread.sleep(5000);
		
		// Football News Story
		driver.findElement(NewsFeatures.fotballNews).click();
		driver.navigate().back();
		
		// Match Reports Section
		driver.findElement(NewsFeatures.matchReports1).click();
		driver.navigate().back();
		driver.findElement(NewsFeatures.matchReports2).click();
		driver.navigate().back();
		driver.findElement(NewsFeatures.matchReports3).click();
		driver.navigate().back();
		driver.findElement(NewsFeatures.matchReports4).click();
		driver.navigate().back();
		driver.findElement(NewsFeatures.matchReports5).click();
		driver.navigate().back();
		
		// Features Story
		driver.findElement(NewsFeatures.featuresNews).click();
		driver.navigate().back();
		
		// Club News Section
		driver.findElement(NewsFeatures.fourNews1).click();
		driver.navigate().back();
		driver.findElement(NewsFeatures.fourNews2).click();
		driver.navigate().back();
		driver.findElement(NewsFeatures.fourNews3).click();
		driver.navigate().back();
		driver.findElement(NewsFeatures.fourNews4).click();
		driver.navigate().back();
		
		// Comment and Opinion
		driver.findElement(NewsFeatures.opinion1).click();
		driver.navigate().back();
		driver.findElement(NewsFeatures.opinion2).click();
		driver.navigate().back();
		
	}

	@After
	 public void closeBrowser(){
		 driver.quit();
		 
	 }
}
