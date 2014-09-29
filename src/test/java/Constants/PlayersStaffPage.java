package Constants;

import org.openqa.selenium.By;

public class PlayersStaffPage {
	
	public static final By firstTeam = By.xpath("//div[@id='playerlinks']/div[1]/a");
	public static final By under21 = By.xpath("//div[@id='playerlinks']/div[2]/a");
	public static final By under18 = By.xpath("//div[@id='playerlinks']/div[3]/a");
	public static final By manager = By.xpath("//div[@id='playerlinks']/div[4]/a");
	public static final By coach = By.xpath("//div[@id='playerlinks']/div[5]/a");
	public static final By legends = By.xpath("//div[@id='playerlinks']/div[6]/a");
	public static final By firstTeamBox = By.xpath("//div[@id='profileboxes']/a[1]");
	public static final By under21Box = By.xpath("//div[@id='profileboxes']/a[2]");
	public static final By legendsBox = By.xpath("//div[@id='profileboxes']/a[3]");
	public static final By under21Profile = By.xpath("//div[@id='profilelinks']/a[1]");
	public static final By under18Profile = By.xpath("//div[@id='profilelinks']/a[2]");
	
	public static final By firstTeamLanding = By.xpath("//ul[@class='firstteam clearfix']");
	public static final By firstTeamLandingRow = By.xpath("//ul[@class='firstteam clearfix']/li");
	
	public static final By secondTab = By.xpath("//h3[@class='titletaboff tab3-2']/a");
	public static final By thirdTab = By.xpath("//h3[@class='titletaboff tab3-3']/a");
	public static final By firstTab = By.xpath("//h3[@class='titletaboff tab3-1']/a");
	
}
