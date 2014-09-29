package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import Utils.CommonUtils;
import Constants.SplashPage;

public class GeneralFooterItemsTests {
	WebDriver driver = null;
	private String baseUrl;
	CommonUtils cUtil = new CommonUtils();
	
	@Before
	public void setUp(){
		driver = cUtil.initializeDriver();
		driver.manage().window().maximize();
	    baseUrl = ("http://origin-www.manutd.com");
	    driver.get(baseUrl);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(SplashPage.logoMUlink).click();
	    driver.get(baseUrl);
	}
	
	@Test
	public void testGeneralFooterItems() throws InterruptedException {
		
		 driver.get(baseUrl + "/en/Club/Sponsors/Associated-Tab.aspx");
		 Thread.sleep(5000);
		 driver.get(baseUrl + "/en/General-Footer-Section/Terms-And-Conditions.aspx");
		 Thread.sleep(5000);
         driver.get(baseUrl + "/en/General-Footer-Section/Cookie-Policy.aspx");
         Thread.sleep(5000);
	     driver.get(baseUrl + "/en/General-Footer-Section/Terms-And-Conditions-Of-Sale.aspx");
	     Thread.sleep(5000);
   	     driver.get(baseUrl + "/en/General-Footer-Section/Privacy-Policy.aspx");
   	     Thread.sleep(5000);
	     driver.get(baseUrl + "/en/Club/FAQs.aspx");
	     Thread.sleep(5000);
		 driver.get(baseUrl + "/en/Club/Sponsors.aspx");
		 Thread.sleep(5000);

	}

	@After
	public void closeBrowser(){
		driver.quit();
	}
	
}
