package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utils.CommonUtils;
import Constants.GlobalConstants;
import Constants.SeasonTicketsFormPage;
import Constants.SplashPage;

public class SeasonTicketsFormPageTests {
	WebDriver driver = null;
	CommonUtils cUtil = new CommonUtils();
	
	@Before
	public void setUp(){
		driver = cUtil.initializeDriver();
		driver.manage().window().maximize();
	    driver.get(GlobalConstants.baseUrl);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(SplashPage.logoMUlink).click();
	    driver.get(GlobalConstants.baseUrl + "/en/User-Forms/Season-Tickets.aspx");
	}

	@Test
	public void testSeasonTicketsFormPage() throws InterruptedException {
		Actions action = new Actions(driver);
		driver.findElement(SeasonTicketsFormPage.firstName).sendKeys("Test");
		driver.findElement(SeasonTicketsFormPage.surname).sendKeys("Test");
		driver.findElement(SeasonTicketsFormPage.email).sendKeys("test@test.com");
		driver.findElement(SeasonTicketsFormPage.mobile).sendKeys("1234567890");
		driver.findElement(SeasonTicketsFormPage.day).sendKeys("24");
		driver.findElement(SeasonTicketsFormPage.month).sendKeys("05");
		driver.findElement(SeasonTicketsFormPage.year).sendKeys("1988");
		driver.findElement(SeasonTicketsFormPage.postCode).sendKeys("2we");
		driver.findElement(SeasonTicketsFormPage.findBtn).click();
		driver.findElement(SeasonTicketsFormPage.pickList).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(SeasonTicketsFormPage.pickList);
		action.doubleClick(element).perform();
		Thread.sleep(4000);
		new Select(driver.findElement(SeasonTicketsFormPage.noSeats)).selectByVisibleText("4");
		new Select(driver.findElement(SeasonTicketsFormPage.prefferedLocations)).selectByVisibleText("East Stand");
		new Select(driver.findElement(SeasonTicketsFormPage.specialSeats)).selectByVisibleText("No");
		driver.findElement(SeasonTicketsFormPage.submitDetails).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(SeasonTicketsFormPage.submitDetails).click();
		Thread.sleep(2500);
		
	}
	
	@After
	public void closeBrowser(){
        driver.quit();
    }
}
