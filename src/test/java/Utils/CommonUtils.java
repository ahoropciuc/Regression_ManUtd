package Utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonUtils {
	public WebDriver driver = null;
	public CommonUtils() {
		super();
	}
	
	public WebDriver initializeDriver() {
		Properties prop = new Properties();		 
    	try {
               //load a properties file
    		prop.load(new FileInputStream("config.properties"));
    		String driverName = prop.getProperty("driver");
    		switch(driverName)
    		{
    		case "chrome": {
    			System.setProperty("webdriver.chrome.driver", "D:\\Automation_ManUtd\\chromedriver.exe");
    		    driver = new ChromeDriver();
    			break;
    		}
    		case "firefox": {
    			driver = new FirefoxDriver();
    			break;
    		}
    		case "iexplore":{
    			System.setProperty("webdriver.ie.driver", "D:\\Automation_ManUtd\\IEDriverServer.exe");
    			driver = new InternetExplorerDriver();
    			break;
    		}
  
    		}
    		
 			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		}
    
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return driver;
	}

}
