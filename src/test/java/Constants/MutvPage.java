package Constants;

import org.openqa.selenium.By;

public class MutvPage {
	
	public static final By mutvVideo = By.xpath("//div[@class='vjs-big-play-button']");
	public static final By video = By.id("example_video_1_html5_api");
	public static final By whatsOn = By.xpath("//ul[@id='mutvnav']/li[3]/a");
	public static final By programmes = By.xpath("//div[@class='wohours']/ul/li[2]");
	public static final By presentersPundits = By.xpath("//ul[@id='mutvnav']/li[4]/a");
	public static final By presenterImage = By.xpath("//div[@id='ifCarousel_images']");
	public static final By yourViews = By.xpath("//ul[@id='mutvnav']/li[5]/a");
	public static final By firstName = By.xpath("//input[@id='firstname']");
	public static final By surname = By.xpath("//input[@id='surname']");
	public static final By email = By.xpath("//input[@id='email']");
	public static final By wheredoyouLive = By.xpath("//input[@id='wheredoyoulive']");
	public static final By comments = By.xpath("//textarea[@id='comments']");
	public static final By submitBtn = By.id("submitYourViews");
	}
