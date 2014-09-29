/*package vme;

import Screens.MainScreen;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by mvirastau on 7/21/2014.
 */
/*public class RegisterTest {
    static WebDriver driver;

    @BeforeClass
    public static void setup (){
        driver = new FirefoxDriver();
        driver.get("https://together-wallet.jz-viat02.ihost.com/#!login");
        driver.manage().window().maximize();

    }
    public int generateRandom() {
        Random rand = new Random();
        int number = rand.nextInt(100000);
        System.out.println(number);
        return number;

}
    @Test

    public void clickRegister() throws InterruptedException {
        int number = generateRandom();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitForElementPresent(driver,MainScreen.registerButton, 10);
        driver.findElement(MainScreen.registerButton).click();
        waitForElementPresent(driver,MainScreen.createW, 10);
        driver.findElement(MainScreen.mobileNo).sendKeys("9101155555");
        driver.findElement(MainScreen.confirmNo).sendKeys("9101155555");

        String email = "test098" + number + "@mailinator.com";

        driver.findElement(MainScreen.user).sendKeys(email);
        driver.findElement(MainScreen.confirmUser).sendKeys(email);
        driver.findElement(MainScreen.pass).sendKeys("Endava123");
        driver.findElement(MainScreen.confirmPass).sendKeys("Endava123");
        driver.findElement(MainScreen.TC).click();
        driver.findElement(MainScreen.createW).click();

        driver.findElement(MainScreen.cardNo).sendKeys("4111111111111111");
        driver.findElement(MainScreen.cardName).sendKeys("Pop Gheorghe");
        driver.findElement(MainScreen.selectmonth).sendKeys("09");
        driver.findElement(MainScreen.selectyear).sendKeys("2016");
        driver.findElement(MainScreen.cardSecNo).sendKeys("123");
        driver.findElement(MainScreen.address1).sendKeys("lolo str 23");
        driver.findElement(MainScreen.city).sendKeys("London");
        driver.findElement(MainScreen.postcode).sendKeys("ss12v");
        driver.findElement(MainScreen.savedetails).click();

        //String originalWindow = driver.getWindowHandle();
        driver.switchTo().frame("threeDSIframe");
        driver.findElement(MainScreen.submitdetails).click();
        driver.switchTo().defaultContent();
        driver.findElement(MainScreen.contbutton).click();
        String user = email.substring(0,email.indexOf("@"));
        String url ="http://mailinator.com/inbox.jsp?to="+ user;
        String handle = driver.getWindowHandle();
        WebDriver maildriver = new FirefoxDriver();
        maildriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        maildriver.get(url);
        waitForElementPresent(maildriver,MainScreen.topemail,120);
        maildriver.findElement(MainScreen.subject).click();
        maildriver.switchTo().frame(maildriver.findElement(MainScreen.frameul));
        String code = maildriver.findElement(MainScreen.codul).getText();
        System.out.println(code);
        maildriver.close();
        driver.switchTo().window(handle);
        driver.findElement(MainScreen.actcode).sendKeys(code);
        driver.findElement(MainScreen.actcodesubmit).click();
        String mesaj = driver.findElement(MainScreen.mesaj).getText();
        assertEquals("Welcome to your Together Bank wallet", mesaj);







    }
    public void waitForElementPresent(WebDriver driver,By by, int seconds){
       WebElement element= driver.findElement(by);
       new WebDriverWait(driver,seconds).until(ExpectedConditions.visibilityOf(element));
    }
    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}*/

