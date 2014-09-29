package Constants;

import org.openqa.selenium.By;

public class HomePage {
	public static final By currentItem1 = By.xpath("//a[1][@class='currentitem']");
	public static final By currentItem2 = By.xpath("//a[2][@class='currentitem']");
	public static final By currentItem3 = By.xpath("//a[3][@class='currentitem']");
	public static final By currentItem4 = By.xpath("//a[4][@class='currentitem']");
	public static final By story1 = By.xpath("//div[1][@class='story']/p/a");
	public static final By story2 = By.xpath("//div[2][@class='story']/p/a");
	public static final By story3 = By.xpath("//div[3][@class='story']/p/a");
	public static final By fournews1 = By.xpath("//div[1][@class='news4story hpbs']/div[1]/p/a");
	public static final By fournews2 = By.xpath("//div[1][@class='news4story hpbs']/div[2]/p/a");
	public static final By fournews3 = By.xpath("//div[1][@class='news4story hpbs']/div[3]/p/a");
	public static final By fournews4 = By.xpath("//div[1][@class='news4story hpbs']/div[4]/p/a");
	public static final By fournews5 = By.xpath("//div[2][@class='news4story hpbs']/div[1]/p/a");
	public static final By fournews6 = By.xpath("//div[2][@class='news4story hpbs']/div[2]/p/a");
	public static final By fournews7 = By.xpath("//div[2][@class='news4story hpbs']/div[3]/p/a");
	public static final By fournews8 = By.xpath("//div[2][@class='news4story hpbs']/div[4]/p/a");
	public static final By siteHeader = By.id("siteheader");
	public static final By sponsors = By.xpath("//div[@id='sponsors']");
	public static final By adColumn = By.xpath("//div[@id='adcolumn']");
	public static final By device = By.xpath("//div[@class='device']");
	public static final By baseDevice = By.id("deviceHomeEvent");
}
