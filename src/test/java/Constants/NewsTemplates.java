package Constants;

import org.openqa.selenium.By;

public class NewsTemplates {
	// Big Image Template
	public static final By dateAuthor = By.xpath("//div[contains(text(), '09/09/2014 08:00, Report by Mark Froggatt')]");
	public static final By title = By.xpath("//div[@class='newsstory']/h1[contains(text(), 'Van Persie enthused by club')]");
	public static final By paragraph1 = By.xpath("//div[@class='newsstory']/p[1]/strong/a[1][contains(text(), 'Robin van Persie')]");
	public static final By paragraph1a = By.xpath("//div[@class='newsstory']/p[1]/strong/a[2][contains(text(), 'Louis van Gaal')]");
	public static final By paragraph2 = By.xpath("//div[@class='newsstory']/p[2][contains(text(), 'A number of high')]");
	public static final By paragraph3 = By.xpath("//div[@class='newsstory']/p[3][contains(text(), 'All three could make')]");
	public static final By paragraph4 = By.xpath("//div[@class='newsstory']/p[4][contains(text(), 'Despite United registering')]");
	public static final By paragraph5 = By.xpath("//div[@class='newsstory']/p[5][contains(text(), 'wait to go and train and play')]");
	public static final By paragraph6 = By.xpath("//div[@class='newsstory']/p[6][contains(text(), 'That feeling, that')]");
	public static final By socialBar = By.id("newsratecontainer");
	public static final By bottomPagination = By.xpath("//div[@id='bottompager']/div[1][contains(text(), '1 of 2')]");
	public static final By headerPagination = By.xpath("//div[@class='newsstory']/div[2][contains(text(), '1 of 2')]");
	public static final By sidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By sidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By sidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By nextBtn = By.xpath("//div[@class='newsstory']/div[2]/a");
	public static final By previousBtn = By.xpath("//div[@class='newsstory']/div[2]/a");
	
	// Gallery template
	public static final By gtDateAuthor = By.xpath("//div[contains(text(), '20/08/2014 19:13, Report by Sean Mullan')]");
	public static final By gtTitle = By.xpath("//div[@class='newsstory']/h1[contains(text(), 'Gallery: Rojo')]");
	public static final By gtDescription = By.xpath("//div[@class='newsstory']/p[1]/strong[contains(text(), 'New Manchester United signing Marcos Rojo')]");
	public static final By gtParagraph1 = By.xpath("//div[@class='newsstory']/p[2][contains(text(), 'Aside from the quarter')]");
	public static final By gtParagraph2 = By.xpath("//div[@class='newsstory']/p[3][contains(text(), 'He has now made 28 appearances')]");
	public static final By gtParagraph3 = By.xpath("//div[@class='newsstory']/p[4][contains(text(), 'Rojo won the hearts')]");
	public static final By gtParagraph4 = By.xpath("//div[@class='newsstory']/p[5][contains(text(), 'taking a look back at')]");
	public static final By gtParagraph5 = By.xpath("//div[@class='newsstory']/p[6]/strong[1][contains(text(), 'More:')]");
	public static final By gtParagraph5Link1 = By.xpath("//div[@class='newsstory']/p[6]/strong[2]/a[1]");
	public static final By gtParagraph5Link2 = By.xpath("//div[@class='newsstory']/p[6]/strong[2]/a[2]");
	public static final By gtSocial = By.id("newsratecontainer");
	public static final By gtsidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By gtsidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By gtsidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By gtsidebarItem4 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[4]/div/a");
	public static final By gtOpenGallery = By.xpath("//div[@class='lightbox ']/a");
	public static final By gtGalleryImageText1 = By.xpath("//td[@id='GB_caption'][contains(text(), 'Rojo and Ezequiel Garay celebrate')]");
	public static final By gtGalleryNextBtn = By.xpath("//img[@class='right']");
	public static final By gtGalleryBackBtn = By.xpath("//img[@class='left']");
	public static final By gtGalleryCloseBtn = By.xpath("//td[@class='close']/img");
	public static final By gtPaginator = By.xpath("//span[@class='GB_navStatus'][contains(text(), '1 of 10')]");
	
	// Feature Template
	public static final By ftDate = By.xpath("//div[@id='timestamp'][contains(text(), '12/08/2014 23:20')]");
	public static final By ftHeaderPaginator = By.xpath("//div[@class='newsstory']/div[2][contains(text(), '1 of 3')]");
	public static final By ftTitle = By.xpath("//h1[contains(text(), 'Career profile: Wayne Rooney')]");
	public static final By ftIntro = By.xpath("//div[@class='newsstory']/p[1]/em[1]/em[contains(text(), 'Manchester United captain')]");
	public static final By ftDescription = By.xpath("//div[@class='newsstory']/p[2]/strong[contains(text(), 'Wayne Rooney is one of only')]");
	public static final By ftParagraph1 = By.xpath("//div[@class='newsstory']/p[3][contains(text(), 'He burst onto the Old Trafford')]");
	public static final By ftParagraph2 = By.xpath("//div[@class='newsstory']/p[4][contains(text(), 'Perhaps his performance')]");
	public static final By ftParagraph3 = By.xpath("//div[@class='newsstory']/p[5][contains(text(), 'In an Under-9s match between')]");
	public static final By ftParagraph4 = By.xpath("//div[@class='newsstory']/p[6][contains(text(), 'By the end of the')]");
	public static final By ftParagraph5 = By.xpath("//div[@class='newsstory']/p[7][contains(text(), 'Despite a difficult World Cup')]");
	public static final By ftParagraph6 = By.xpath("//div[@class='newsstory']/p[8][contains(text(), 'A tireless worker')]");
	public static final By ftBottomPaginator = By.xpath("//div[@class='newsstory']/div[3][contains(text(), '1 of 3')]");
	public static final By ftNewsRate = By.xpath("//div[@class='newsrate']");
	public static final By ftSocial = By.xpath("//div[@class='facebookbuttons']");
	public static final By ftHeaderNextBtn = By.xpath("//div[@class='newsstory']/div[2]/a");
	public static final By ftBottomNextBtn = By.xpath("//div[@class='newsstory']/div[3]/a[2]");
	public static final By ftHeaderPreviousBtn = By.xpath("//div[@class='newsstory']/div[2]/a[1]");
	public static final By ftBottomPreviousBtn = By.xpath("//div[@class='newsstory']/div[3]/a[1]");
	
	// Template 1
	public static final By t1DateAuthor = By.xpath("//div[@id='timestamp'][contains(text(), '09/09/2014 13:00, Report by Mark Froggatt')]");
	public static final By t1Title = By.xpath("//h1[contains(text(), 'Sir Bobby Charlton has faith in Louis van Gaal')]");
	public static final By t1Description = By.xpath("//div[@class='newsstory']/p[1]/strong[contains(text(), ' believes Manchester United are')]");
	public static final By t1Paragraph1 = By.xpath("//div[@class='newsstory']/p[2][contains(text(), 'The Reds are without')]");
	public static final By t1Paragraph2 = By.xpath("//div[@class='newsstory']/p[3][contains(text(), 'Club director Charlton is confident')]");
	public static final By t1Paragraph3 = By.xpath("//div[@class='newsstory']/p[4][contains(text(), 'Sir Bobby explained at')]");
	public static final By t1Paragraph4 = By.xpath("//div[@class='newsstory']/p[5][contains(text(), 'We have started with some new players')]");
	public static final By t1Paragraph5 = By.xpath("//div[@class='newsstory']/p[6][contains(text(), 'Van Gaal has sanctioned')]");
	public static final By t1Paragraph6 = By.xpath("//div[@class='newsstory']/p[7][contains(text(), 'He has given me and most of us')]");
	public static final By t1Paragraph6Link1 = By.xpath("//div[@class='newsstory']/p[7]/a[1]");
	public static final By t1Paragraph6Link2 = By.xpath("//div[@class='newsstory']/p[7]/a[2]");
	public static final By t1Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t1SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t1SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t1SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	
	// Template 2
	public static final By t2Date = By.xpath("//div[@id='timestamp'][contains(text(), '20/08/2014 00:00')]");
	public static final By t2HeaderPagination = By.xpath("//div[@class='newsstory clearfix']/div[2][contains(text(), '1 of 2')]");
	public static final By t2Entry = By.xpath("//div[@class='news2col']/p[1]/strong[contains(text(), 'Entry')]");
	public static final By t2EntryParagraph1 = By.xpath("//div[@class='news2col']/li[1][contains(text(), 'Manchester United Limited')]");
	public static final By t2EntryParagraph2 = By.xpath("//div[@class='news2col']/li[2][contains(text(), 'Employees of MU or any')]");
	public static final By t2EntryParagraph3 = By.xpath("//div[@class='news2col']/li[3][contains(text(), 'Entry into the Prize Draw')]");
	public static final By t2EntryParagraph4 = By.xpath("//div[@class='news2col']/li[4][contains(text(), 'In order to enter the Prize Draw')]");
	public static final By t2EntryParagraph5 = By.xpath("//div[@class='news2col']/li[5][contains(text(), 'The Prize Draw will close at')]");
	public static final By t2EntryParagraph6 = By.xpath("//div[@class='news2col']/li[6][contains(text(), 'By entering the Prize Draw')]");
	public static final By t2Prize = By.xpath("//div[@class='news2col']/p[4]/strong[contains(text(), 'Prize')]");
	public static final By t2PrizeParagraph1 = By.xpath("//div[@class='news2col col2']/li[1][contains(text(), 'Subject to paragraph 8')]");
	public static final By t2PrizeParagraph2 = By.xpath("//div[@class='news2col col2']/li[2][contains(text(), 'MU reserves the right')]");
	public static final By t2PrizeParagraph3 = By.xpath("//div[@class='news2col col2']/li[3][contains(text(), 'The Prize is')]");
	public static final By t2Winner = By.xpath("//div[@class='news2col col2']/p[5]/strong[contains(text(), 'Winner')]");
	public static final By t2WinnerParagraph1 = By.xpath("//div[@class='news2col col2']/p[6][contains(text(), 'The winner will be')]");
	public static final By t2WinnerParagraph2 = By.xpath("//div[@class='news2col col2']/p[7][contains(text(), 'Only the Winner of')]");
	public static final By t2WinnerParagraph3 = By.xpath("//div[@class='news2col col2']/p[8]/a[contains(text(), 'will be required to give their')]");
	public static final By t2Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t2BottomPagination = By.xpath("//div[@class='pager clearfix'][contains(text(), '1 of 2')]");
	public static final By t2BottomNextPagitationClick = By.xpath("//div[@class='pager clearfix']/a");
	public static final By t2BottomPreviousPagitationClick = By.xpath("//div[@class='pager clearfix']/a");
	public static final By t2SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t2SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t2SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	
	// Template 3
	public static final By t3DateAuthor = By.xpath("//div[@id='timestamp'][contains(text(), '21/07/2014 15:44, Report by Adam Marshall')]");
	public static final By t3Title = By.xpath("//h1[contains(text(), 'Ever-ready Evra')]");
	public static final By t3Description = By.xpath("//div[@class='narrowstory']/div[1]/p[1]/strong[contains(text(), 'Since cementing a regular place')]");
	public static final By t3Paragraph1 = By.xpath("//div[@class='narrowstory']/div[1]/p[2][contains(text(), 'The Frenchman saw off the challenge')]");
	public static final By t3Paragraph2 = By.xpath("//div[@class='narrowstory']/div[1]/p[3][contains(text(), 'Of his 329 outings, 320 were starts')]");
	public static final By t3Paragraph3 = By.xpath("//div[@class='narrowstory']/div[1]/p[4][contains(text(), 'highest tally came in')]");
	public static final By t3Paragraph4 = By.xpath("//div[@class='narrowstory']/div[1]/p[5][contains(text(), 'Evra has proved to be an')]");
	public static final By t3Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t3FreeTextTitle = By.xpath("//div[@class='freetext']/div/h1[contains(text(), 'Pat posts impressive record')]");
	public static final By t3FreeTextYear = By.xpath("//div[@class='freetext']/div/p[1][contains(text(), 'Starts since 2007/08:')]");
	public static final By t3FreeTextAppearance = By.xpath("//div[@class='freetext']/div/p[3][contains(text(), 'Appearances since 2007/08:')]");
	public static final By t3SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t3SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	
	// Template 4
	public static final By t4DateAuthor = By.xpath("//div[@id='timestamp'][contains(text(), '02/02/2009 13:11, Report by Nick Coppack, Adam Bostock')]");
	public static final By t4HeaderPagination = By.xpath("//div[@class='newsstory clearfix']/div[2][contains(text(), '1 of 2')]");
	public static final By t4Title = By.xpath("//h1[contains(text(), 'Reserves match postponed')]");
	public static final By t4Description = By.xpath("//div[@class='newsstory clearfix']/p/strong[contains(text(), 'match against Manchester City')]");
	public static final By t4BottomPagination = By.xpath("//div[@class='newsstory clearfix']/div[3][contains(text(), '1 of 2')]");
	public static final By t4Reserve = By.xpath("//div[@class='regbanner rgbottom']/div/h1[contains(text(), 'reserves fixtures')]");
	public static final By t4UnitedReserves = By.xpath("//div[@class='regbanner rgbottom']/div");
	public static final By t4Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t4SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t4SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t4SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By t4SidebarItem4 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[4]/div/a");
	public static final By t4SidebarItem5 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[5]/div/a");
	public static final By t4HeaderNextBtn = By.xpath("//div[@class='newsstory clearfix']/div[2]/a");
	public static final By t4BottomPrevBtn = By.xpath("//div[@class='newsstory clearfix']/div[3]/a");
	
	// Template 5
	public static final By t5ImageText1 = By.xpath("//div[@class='regbanner']/div/p[1][contains(text(), 'U18 International Friendly')]");
	public static final By t5ImageText2 = By.xpath("//div[@class='regbanner']/div/p[2][contains(text(), 'Tickets are available')]");
	public static final By t5DateAuthor = By.xpath("//div[@id='timestamp'][contains(text(), '03/09/2014 14:03, Report by Adam Marshall')]");
	public static final By t5HeaderPagination = By.xpath("//div[@class='newsstory clearfix']/div[2][contains(text(), '1 of 2')]");
	public static final By t5Title = By.xpath("//div[@class='newsstory clearfix']/h1[contains(text(), 'local affair')]");
	public static final By t5Description = By.xpath("//div[@class='newsstory clearfix']/p[1]/strong[contains(text(), 'Manchester United youngster')]");
	public static final By t5Paragraph1 = By.xpath("//div[@class='newsstory clearfix']/p[2][contains(text(), 'The promising forward')]");
	public static final By t5Paragraph2 = By.xpath("//div[@class='newsstory clearfix']/p[3][contains(text(), 'The friendly against')]");
	public static final By t5Paragraph3 = By.xpath("//div[@class='newsstory clearfix']/p[4][contains(text(), 'the teenager told')]");
	public static final By t5Paragraph4 = By.xpath("//div[@class='newsstory clearfix']/p[5][contains(text(), 'Everyone is into football')]");
	public static final By t5Paragraph5 = By.xpath("//div[@class='newsstory clearfix']/p[6][contains(text(), 'The people up here are mad')]");
	public static final By t5Paragraph6 = By.xpath("//div[@class='newsstory clearfix']/p[7][contains(text(), 'Mitchell is determined')]");
	public static final By t5Paragraph7 = By.xpath("//div[@class='newsstory clearfix']/p[8][contains(text(), 'good to be back with')]");
	public static final By t5Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t5BottomPagination = By.xpath("//div[@id='bottompager']/div[1][contains(text(), '1 of 2')]");
	public static final By t5SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t5SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t5SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By t5HeaderNextBtn = By.xpath("//div[@class='newsstory clearfix']/div[2]/a");
	public static final By t5BottomprevBtn = By.xpath("//div[@id='bottompager']/div[1]/a");
	
	// Template 6
	public static final By t6BannerTitle = By.xpath("//div[@class='tallbanner']/div/h1[contains(text(), 'Inside United')]");
	public static final By t6BannerParagraph1 = By.xpath("//div[@class='tallbanner']/div/p[1]/strong[contains(text(), 'In the January issue...')]");
	public static final By t6BannerParagraph2 = By.xpath("//div[@class='tallbanner']/div/p[2]/strong[contains(text(), 'Cantona exclusive')]");
	public static final By t6BannerParagraph3 = By.xpath("//div[@class='tallbanner']/div/p[3]/strong[contains(text(), 'Rafael exclusive')]");
	public static final By t6BannerParagraph4 = By.xpath("//div[@class='tallbanner']/div/p[4]/strong[contains(text(), 'Carrick and Robbo')]");
	public static final By t6BannerParagraph5 = By.xpath("//div[@class='tallbanner']/div/p[5]/strong[contains(text(), 'Sir Alex')]");
	public static final By t6BannerParagraph6 = By.xpath("//div[@class='tallbanner']/div/p[6]/strong[contains(text(), 'Manchester derby preview')]");
	public static final By t6BannerParagraph7 = By.xpath("//div[@class='tallbanner']/div/p[7][contains(text(), 'Diary and Sir')]");
	public static final By t6Title = By.xpath("//div[@class='newsmaincontent']/div[2]/h1[contains(text(), 'United are still strong')]");
	public static final By t6Description = By.xpath("//div[@class='newsmaincontent']/div[2]/p[1]/strong[contains(text(), 'Eric Cantona says')]");
	public static final By t6Paragraph1 = By.xpath("//div[@class='newsmaincontent']/div[2]/p[2][contains(text(), 'Cantona was back at Old Trafford')]");
	public static final By t6Paragraph2 = By.xpath("//div[@class='newsmaincontent']/div[2]/p[3][contains(text(), 'enjoyed catching up with')]");
	public static final By t6Paragraph3 = By.xpath("//div[@class='newsmaincontent']/div[2]/p[4][contains(text(), 'Last season United lost the league')]");
	public static final By t6Paragraph4 = By.xpath("//div[@class='newsmaincontent']/div[2]/p[5][contains(text(), 'They are as strong as years')]");
	public static final By t6Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t6HeaderPagination = By.xpath("//div[@class='newsmaincontent']/div[2]/div[2][contains(text(), '1 of 2')]");
	public static final By t6BottomPagination = By.xpath("//div[@id='bottompager']/div[1][contains(text(), '1 of 2')]");
	public static final By t6SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t6SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t6SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By t6BottomNextBtn = By.xpath("//div[@id='bottompager']/div[1]/a");
	public static final By t6HeaderPrevBtn = By.xpath("//div[@class='newsmaincontent']/div[2]/div[2]/a");

	// Template 7
	public static final By t7TableHead = By.xpath("//table[@class='newspage']/thead/tr");
	public static final By t7TableBody = By.xpath("//table[@class='newspage']/tbody");
	public static final By t7TableBodyRow = By.xpath("//table[@class='newspage']/tbody/tr");
	public static final By t7BannerTitle = By.xpath("//div[@class='tallbanner tabletop']/div/h1[contains(text(), 'Next up... Norwich')]");
	public static final By t7BannerText = By.xpath("//div[@class='tallbanner tabletop']/div/p[contains(text(), 'United will play Norwich City')]");
	public static final By t7DateAuthor = By.xpath("//div[contains(text(), '24/02/2013 16:50, Report by Adam Bostock')]");
	public static final By t7HeaderPagination = By.xpath("//div[@class='newsstory']/div[2][contains(text(), '1 of 3')]");
	public static final By t7Title = By.xpath("//h1[contains(text(), 'Reds to March on?')]");
	public static final By t7Description = By.xpath("//strong[contains(text(), 'position at the top of')]");
	public static final By t7Paragraph1 = By.xpath("//p[contains(text(), 'men will go into')]");
	public static final By t7Paragraph2 = By.xpath("//strong[contains(text(), 'United v Norwich City')]");
	public static final By t7Paragraph3 = By.xpath("//strong[contains(text(), 'Aston Villa v Manchester City')]");
	public static final By t7Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t7BottomPagination = By.xpath("//div[@id='bottompager']/div[1][contains(text(), '1 of 3')]");
	public static final By t7SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t7SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t7SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By t7HeaderNextBtn = By.xpath("//div[@class='newsmaincontent']/div[2]/div[2]/a");
	public static final By t7BottomPrevBtn = By.xpath("//div[@id='bottompager']/div[1]/a");
	
	// Template 8
	public static final By t8DateAuthor = By.xpath("//div[contains(text(), '10/02/2010 21:50, Report by Gemma Thompson')]");
	public static final By t8HeaderPagination = By.xpath("//div[@class='newsstory']/div[2][contains(text(), '1 of 2')]");
	public static final By t8Title = By.xpath("//h1[contains(text(), 'lead cut')]");
	public static final By t8Description = By.xpath("//strong[contains(text(), 'Former Red Louis Saha')]");
	public static final By t8Paragraph2 = By.xpath("//div[@class='newsstory']/p[2][contains(text(), 'Elsewhere,')]");
	public static final By t8BottomPagination = By.xpath("//div[@class='newsstory']/div[3][contains(text(), '1 of 2')]");
	public static final By t8Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t8TableHead = By.xpath("//table[@class='newspage']/thead/tr");
	public static final By t8TableBody = By.xpath("//table[@class='newspage']/tbody");
	public static final By t8TableBodyRow = By.xpath("//table[@class='newspage']/tbody/tr");
	public static final By t8BannerTitle = By.xpath("//div[@class='tallbanner rgbottom']/div/h1[contains(text(), 'Results')]");
	public static final By t8SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t8SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t8SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By t8HeaderNextBtn = By.xpath("//div[@class='newsmaincontent']/div[1]/div[2]/a");
	public static final By t8BottomPrevBtn = By.xpath("//div[@class='newsmaincontent']/div[1]/div[3]/a");
	
	// Template 9
	public static final By t9TableHead = By.xpath("//div[@class='relbanner']/table/thead/tr");
	public static final By t9TableBody = By.xpath("//div[@class='relbanner']/table/tbody");
	public static final By t9TableBodyRow = By.xpath("//div[@class='relbanner']/table/tbody/tr");
	public static final By t9DateAuthor = By.xpath("//div[contains(text(), '21/03/2010 17:54, Report by Nick Coppack')]");
	public static final By t9Title = By.xpath("//h1[contains(text(), 'Reds in pole position')]");
	public static final By t9Description = By.xpath("//strong[contains(text(), 'Chelsea slipped')]");
	public static final By t9Paragraph1 = By.xpath("//strong[contains(text(), 'Chelsea slipped to third')]");
	public static final By t9Paragraph2 = By.xpath("//p[contains(text(), 'Didier Drogba gave Chelsea')]");
	public static final By t9Paragraph3 = By.xpath("//p[contains(text(), 'Chelsea kicked off')]");
	public static final By t9NewsRate = By.xpath("//div[@class='newsrate']");
	public static final By t9Facebook = By.xpath("//div[@class='facebookbuttons']");
	public static final By t9SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t9SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t9SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	
	// Template 10
	public static final By t10BannerTitle = By.xpath("//h1[contains(text(), 'Barclays Premier League')]");
	public static final By t10BannerDescription = By.xpath("//p[contains(text(), '10. Rooney')]");
	public static final By t10DateAuthor = By.xpath("//div[contains(text(), '16/08/2013 13:00, Report by Adam Marshall')]");
	public static final By t10Title = By.xpath("//h1[contains(text(), 'New shirt numbers revealed')]");
	public static final By t10Description = By.xpath("//strong[contains(text(), 'Manchester United')]");
	public static final By t10Paragraph1 = By.xpath("//p[contains(text(), 'As reported last weekend')]");
	public static final By t10Paragraph2 = By.xpath("//p[contains(text(), 'New signings Wilfried Zaha')]");
	public static final By t10More = By.xpath("//strong[contains(text(), 'More:')]");
	public static final By t10Link1Text = By.xpath("//a[contains(text(), 'wait for first')]");
	public static final By t10Link2Text = By.xpath("//a[contains(text(), 'Follow United')]");
	public static final By t10Link1 = By.xpath("//div[@class='newsstory']/p[4]/a[1]");
	public static final By t10Link2 = By.xpath("//div[@class='newsstory']/p[4]/a[2]");
	public static final By t10Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t10SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t10SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t10SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	
	// Template 11
	public static final By t11DateAuthor = By.xpath("//div[contains(text(), '30/01/2010 23:00, Report by Adam Bostock')]");
	public static final By t11Title = By.xpath("//h1[contains(text(), 'Wear RED')]");
	public static final By t11Description = By.xpath("//strong[contains(text(), 'started with the')]");
	public static final By t11Paragraph1 = By.xpath("//p[contains(text(), 'Nike-sponsored players')]");
	public static final By t11Paragraph2 = By.xpath("//p[contains(text(), 'The Nike and')]");
	public static final By t11Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t11Competition = By.xpath("//div[@id='phcontent_0_phnewscontent_0_ctl01_newslinksContainer']/div[1]/div/p");
	public static final By t11NikeStore = By.xpath("//div[@id='phcontent_0_phnewscontent_0_ctl01_newslinksContainer']/div[2]/div/p");
	public static final By t11SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t11SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t11Paragraph3 = By.xpath("//p[contains(text(), 'are available')]");
	public static final By t11Paragraph4 = By.xpath("//p[contains(text(), 'or your friends')]");
	public static final By t11Exclusive = By.xpath("//strong[contains(text(), 'Exclusive Competition')]");
	
	// Template 12
	public static final By t12BannerTitle = By.xpath("//h1[contains(text(), 'United Betting League')]");
	public static final By t12BannerText = By.xpath("//p[contains(text(), 'Betfred gives')]");
	public static final By t12Device1 = By.xpath("//div[@class='yellowads']/div[1]/a");
	public static final By t12Device2 = By.xpath("//div[@class='yellowads']/div[2]/a");
	public static final By t12DateAuthor = By.xpath("//div[contains(text(), '13/03/2009 10:20, Report by Nick Coppack')]");
	public static final By t12HeaderPagination = By.xpath("//div[contains(text(), '1 of 2')]");
	public static final By t12Title = By.xpath("//h1[contains(text(), 'Betting: Liverpool')]");
	public static final By t12Description = By.xpath("//p[contains(text(), 'Our pundits')]");
	public static final By t12BottomPagination = By.xpath("//div[contains(text(), '1 of 2')]");
	public static final By t12Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t12SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t12SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t12SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By t12SidebarItem4 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[4]/div/a");
	
	// Template 13
	public static final By t13PapersTitle = By.xpath("//h4[contains(text(), 'WHAT THE')]");
	public static final By t13PapersText = By.xpath("//p[contains(text(), 'The extracts')]");
	public static final By t13Date = By.xpath("//div[contains(text(), '22/03/2013 08:54')]");
	public static final By t13Title = By.xpath("//h1[contains(text(), 'Papers: De Gea denial')]");
	public static final By t13ImageDescription = By.xpath("//strong[contains(text(), 'Anthony Kastrinakis')]");
	public static final By t13Description = By.xpath("//strong[contains(text(), 'Gea change')]");
	public static final By t13Paragraph1 = By.xpath("//p[contains(text(), 'David De Gea')]");
	public static final By t13Paragraph2 = By.xpath("//p[contains(text(), 'In the same')]");
	public static final By t13Paragraph3 = By.xpath("//p[contains(text(), 'In more transfer')]");
	public static final By t13Paragraph4 = By.xpath("//p[contains(text(), 'papers also')]");
	public static final By t13More = By.xpath("//strong[contains(text(), 'More:')]");
	public static final By t13Link1Text = By.xpath("//a[contains(text(), 'Young wants')]");
	public static final By t13Link2Text = By.xpath("//a[contains(text(), 'De Gea')]");
	public static final By t13Link3Text = By.xpath("//a[contains(text(), 'Giggs: The')]");
	public static final By t13Link1 = By.xpath("//div[@class='newsstory']/p[6]/a[1]");
	public static final By t13Link2 = By.xpath("//div[@class='newsstory']/p[6]/a[2]");
	public static final By t13Link3 = By.xpath("//div[@class='newsstory']/p[6]/a[3]");
	public static final By t13Author = By.xpath("//div[contains(text(), 'Round Up By Mark Froggatt')]");
	public static final By t13Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t13SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t13SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t13SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	
	// Template 14
	public static final By t14Date = By.xpath("//div[contains(text(), '05/12/2006 18:43')]");
	public static final By t14Title = By.xpath("//h1[contains(text(), 'David Gill')]");
	public static final By t14Description = By.xpath("//strong[contains(text(), 'David Gill visited')]");
	public static final By t14Paragraph1 = By.xpath("//p[contains(text()[2], 'His trip was')]");
	public static final By t14Paragraph2 = By.xpath("//p[contains(text()[3], 'Zambia is one')]");
	public static final By t14Paragraph3 = By.xpath("//p[contains(text()[4], 'The United chief')]");
	public static final By t14Paragraph4 = By.xpath("//p[contains(text()[5], 'HIV and AIDS')]");
	public static final By t14Paragraph5 = By.xpath("//p[contains(text()[6], 'MUTV will be')]");
	public static final By t14PhotoCredit = By.xpath("//em[contains(text(), 'Photo credit: UNICEF UK/2006')]");
	public static final By t14NewsRate = By.xpath("//div[@class='newsrate']");
	public static final By t14Facebook = By.xpath("//div[@class='facebookbuttons']");
	
	// Template 15
	public static final By t15BannerText1 = By.xpath("//p[contains(text(), 'Ruud van Nistelrooy')]");
	public static final By t15BannerText2 = By.xpath("//p[contains(text(), 'Joined United: 01/07/2001')]");
	public static final By t15BannerText3 = By.xpath("//p[contains(text(), '12/08/2001')]");
	public static final By t15BannerText4 = By.xpath("//p[contains(text(), 'Appearances: 219')]");
	public static final By t15BannerText5 = By.xpath("//p[contains(text(), 'Goals: 150')]");
	public static final By t15BannerText6 = By.xpath("//p[contains(text(), 'Honours: Premier League')]");
	public static final By t15BannerText7 = By.xpath("//p[contains(text(), 'Left United: 28/07/2006')]");
	public static final By t15BannerText8 = By.xpath("//p[contains(text(), 'Other clubs: Den Bosch')]");
	public static final By t15DateAuthor = By.xpath("//div[contains(text(), '19/05/2012 08:07, Report by J Tuck, S Bibby')]");
	public static final By t15Title = By.xpath("//h1[contains(text(), 'Video: Best of Ruud')]");
	public static final By t15Description = By.xpath("//strong[contains(text(), 'guess how many')]");
	public static final By t15Paragraph1 = By.xpath("//p[contains(text(), 'The Dutchman was')]");
	public static final By t15Paragraph2 = By.xpath("//p[contains(text(), 'He was still only')]");
	public static final By t15Paragraph3 = By.xpath("//p[contains(text(), 'Spanish fans soon')]");
	public static final By t15Paragraph4 = By.xpath("//p[contains(text(), 'Van Nistelrooy scored')]");
	public static final By t15Paragraph5 = By.xpath("//p[contains(text(), 'Despite a difficult')]");
	public static final By t15Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t15SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t15SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	
	// Template 17
	public static final By t17BannerTitle = By.xpath("//h1[contains(text(), 'Young one of the elders')]");
	public static final By t17BannerParagraph1 = By.xpath("//strong[contains(text(), 'Young on being senior')]");
	public static final By t17BannerParagraph2 = By.xpath("//strong[contains(text(), 'On a turnaround in form')]");
	public static final By t17DateAuthor = By.xpath("//div[contains(text(), '09/09/2014 09:00, Report by Gemma Thompson')]");
	public static final By t17Title = By.xpath("//h1[contains(text(), 'Young enjoys')]");
	public static final By t17Description = By.xpath("//strong[contains(text(), 'Ashley Young says')]");
	public static final By t17Paragraph1 = By.xpath("//p[contains(text(), 'At 29, the')]");
	public static final By t17Paragraph2 = By.xpath("//p[contains(text(), 'At the start')]");
	public static final By t17Paragraph3 = By.xpath("//p[contains(text(), 'It puts more')]");
	public static final By t17Paragraph4 = By.xpath("//p[contains(text(), 'During his')]");
	public static final By t17Paragraph5 = By.xpath("//p[contains(text(), 'I definitely think')]");
	public static final By t17Paragraph6 = By.xpath("//em[contains(text(), 'Read the full')]");
	public static final By t17More = By.xpath("//strong[contains(text(), 'More:')]");
	public static final By t17MoreText1 = By.xpath("//a[contains(text(), 'Falcao focused on debut')]");
	public static final By t17MoreText2 = By.xpath("//a[contains(text(), 'Mata hails Falcao')]");
	public static final By t17MoreLink1 = By.xpath("//div[@class='newsstory']/p[8]/strong/a[1]");
	public static final By t17MoreLink2 = By.xpath("//div[@class='newsstory']/p[8]/strong/a[2]");
	public static final By t17Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t17Device1 = By.xpath("//div[@id='phcontent_0_phnewscontent_0_ctl01_newslinksContainer']/div[1]/div/p/a");
	public static final By t17Device2 = By.xpath("//div[@id='phcontent_0_phnewscontent_0_ctl01_newslinksContainer']/div[2]/div/p/a");
	
	// Template 19
	public static final By t19DateAuthor = By.xpath("//div[contains(text(), '16/03/2013 08:34')]");
	public static final By t19HeaderPagination = By.xpath("//div[contains(text(), '1 of 16')]");
	public static final By t19Title = By.xpath("//h1[contains(text(), 'Today at Old Trafford')]");
	public static final By t19Description = By.xpath("//em[contains(text(), 'The editorial team for')]");
	public static final By t19Saturday = By.xpath("//strong[contains(text(), 'Saturday 16 March')]");
	public static final By t19Paragraph1 = By.xpath("//p[contains(text(), 'It was by no means')]");
	public static final By t19Paragraph2 = By.xpath("//p[contains(text(), 'An important win')]");
	public static final By t19Paragraph3 = By.xpath("//em[contains(text(), 'Today at OT')]");
	public static final By t19Paragraph4 = By.xpath("//p[contains(text(), 'Reading line up')]");
	public static final By t19Paragraph5 = By.xpath("//p[contains(text(), 'the United team')]");
	public static final By t19Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t19BottomPagination = By.xpath("//div[contains(text(), '1 of 16')]");
	public static final By t19RelatedText1 = By.xpath("//span[contains(text(), 'Football News')]");
	public static final By t19RelatedText2 = By.xpath("//span[contains(text(), 'What The Papers Say')]");
	public static final By t19RelatedText3 = By.xpath("//span[contains(text(), 'The Gossip')]");
	public static final By t19RelatedLink1 = By.xpath("//div[@class='liveblog2']/div[2]/a");
	public static final By t19RelatedLink2 = By.xpath("//div[@class='liveblog2']/div[3]/a");
	public static final By t19RelatedLink3 = By.xpath("//div[@class='liveblog2']/div[4]/a");
	public static final By t19HeaderNextBtn = By.xpath("//div[@class='newsstory']/div[2]/a");
	public static final By t19BottomPrevtBtn = By.xpath("//div[@id='bottompager']/div[1]/a");
	
	// Template 20
	public static final By t20DateAuthor = By.xpath("//div[contains(text(), '11/11/2010 00:33, Report by Nick Coppack')]");
	public static final By t20HeaderPagination = By.xpath("//div[contains(text(), '1 of 3')]");
	public static final By t20Title = By.xpath("//h1[contains(text(), 'century')]");
	public static final By t20Description = By.xpath("//strong[contains(text(), 'Little more than')]");
	public static final By t20Paragraph1 = By.xpath("//p[contains(text(), 'He reached')]");
	public static final By t20Paragraph2 = By.xpath("//p[contains(text(), 'The Bulgarian')]");
	public static final By t20Paragraph3 = By.xpath("//p[contains(text(), 'A bewitching talent')]");
	public static final By t20Paragraph4 = By.xpath("//p[contains(text(), 'And while he')]");
	public static final By t20BottomPagination = By.xpath("//div[contains(text(), '1 of 3')]");
	public static final By t20Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t20SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t20SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t20BannerTitle = By.xpath("//h1[contains(text(), 'The stats that count')]");
	public static final By t20BannerText1 = By.xpath("//strong[contains(text(), 'results with Berbatov')]");
	public static final By t20BannerText2 = By.xpath("//strong[contains(text(), 'results without Berbatov')]");
	public static final By t20BannerText3 = By.xpath("//strong[contains(text(), 'Goals by venue')]");
	public static final By t20BannerText4 = By.xpath("//strong[contains(text(), 'When Berbatov scores')]");
	public static final By t20BannerText5 = By.xpath("//strong[contains(text(), 'Where Berbatov scores')]");
	public static final By t20BannerText6 = By.xpath("//strong[contains(text(), 'How Berbatov scores')]");
	public static final By t20HeaderNextBtn = By.xpath("//div[@class='newsstory']/div[2]/a");
	public static final By t20BottomPrevtBtn = By.xpath("//div[@id='bottompagernarrow']/div/a");
	
	// Template 21
	public static final By t21BannerTitle = By.xpath("//h1[contains(text(), 'Player of the Year Awards')]");
	public static final By t21BannerDescription = By.xpath("//strong[contains(text(), 'The annual polls')]");
	public static final By t21BannerLinkText1 = By.xpath("//a[contains(text(), 'Sir Matt Busby')]");
	public static final By t21BannerLinkText2 = By.xpath("//a[contains(text(), 'Denzil Haroun')]");
	public static final By t21BannerLink1 = By.xpath("//div[@class='newsstory template21report']/strong[2]/a");
	public static final By t21BannerLink2 = By.xpath("//div[@class='newsstory template21report']/strong[3]/a");
	public static final By t21BannerText1 = By.xpath("//div[contains(text()[5], 'The personal accolade')]");
	public static final By t21BannerText2 = By.xpath("//div[contains(text()[6], 'Take your pick')]");
	public static final By t21BannerText3 = By.xpath("//strong[contains(text(), 'Goal of the Season')]");
	public static final By t21BannerText4 = By.xpath("//div[contains(text()[8], 'The winners of')]");
	public static final By t21DateAuthor = By.xpath("//div[contains(text(), '06/04/2011 10:02, Report by Adam Bostock')]");
	public static final By t21Title = By.xpath("//h1[contains(text(), 'Vote: Player of the Year 2011')]");
	public static final By t21Description = By.xpath("//strong[contains(text(), 'annual awards')]");
	public static final By t21Paragraph1Link = By.xpath("//div[@class='newsstory']/p[1]/strong[1]/a");
	public static final By t21Paragraph1Text = By.xpath("//a[contains(text(), 'Sir Matt Busby')]");
	public static final By t21Paragraph2Link = By.xpath("//div[@class='newsstory']/p[1]/strong[2]/a");
	public static final By t21Paragraph2Text = By.xpath("//a[contains(text(), 'Denzil Haroun')]");
	public static final By t21Paragraph1 = By.xpath("//p[contains(text()[1], 'There are 20')]");
	public static final By t21Paragraph2 = By.xpath("//p[contains(text()[2], 'three nominees')]");
	public static final By t21Paragraph3 = By.xpath("//p[contains(text(), 'Look out for')]");
	public static final By t21Paragraph4 = By.xpath("//p[contains(text(), 'Polls close at')]");
	public static final By t21Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t21SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t21SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t21SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By t21SidebarItem4 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[4]/div/a");
	
	// Template 22
	public static final By t22PlayBtn = By.xpath("//div[@class='vjs-big-play-button']");
	public static final By t22StopBtn = By.xpath("//div[@class='vjs-play-control vjs-control  vjs-playing']");
	public static final By t22DateAuthor = By.xpath("//div[contains(text(), '03/09/2014 14:52, Report by Adam Marshall')]");
	public static final By t22Title = By.xpath("//h1[contains(text(), 'Academy debutants')]");
	public static final By t22Description = By.xpath("//strong[contains(text(), 'Louis van Gaal')]");
	public static final By t22Paragraph1 = By.xpath("//p[contains(text()[1], 'Tyler Blackett')]");
	public static final By t22Paragraph2 = By.xpath("//p[contains(text(), 'Saidy Janko')]");
	public static final By t22Paragraph3 = By.xpath("//p[contains(text(), 'Check out our')]");
	public static final By t22Paragraph4 = By.xpath("//p[contains(text(), 'This article')]");
	public static final By t22More = By.xpath("//strong[contains(text(), 'More:')]");
	public static final By t22MoreText1 = By.xpath("//a[contains(text(), 'Mitchell set for local affair')]");
	public static final By t22MoreText2 = By.xpath("//a[contains(text(), 'Reds agree defender deal')]");
	public static final By t22MoreLink1 = By.xpath("//div[@class='newsstory']/p[6]/strong/a[1]");
	public static final By t22MoreLink2 = By.xpath("//div[@class='newsstory']/p[6]/strong/a[2]");
	public static final By t22SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t22SidebarItem2 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[2]/div/a");
	public static final By t22SidebarItem3 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[3]/div/a");
	public static final By t22Social = By.xpath("//div[@id='newsratecontainer']");
	
	// Template 23
	public static final By t23PlayBtn = By.xpath("//div[@class='vjs-big-play-button']");
	public static final By t23StopBtn = By.xpath("//div[@class='vjs-play-control vjs-control  vjs-playing']");
	public static final By t23NextBtnVideo = By.xpath("//ul[@class='jPag-pages']/li[2]/a");
	public static final By t23VideoSide = By.xpath("//div[@class='videopage _current']/div[2]/div/div");
	public static final By t23PrevBtnVideo = By.xpath("//ul[@class='jPag-pages']/li[1]/a");
	public static final By t23DateAuthor = By.xpath("//div[contains(text(), '06/03/2014 22:22, Report by Editorial team')]");
	public static final By t23HeaderPagination = By.xpath("//div[contains(text(), '1 of 16')]");
	public static final By t23Title = By.xpath("//h1[contains(text(), 'United Today: Live Blog')]");
	public static final By t23Follow = By.xpath("//strong[contains(text(), 'Follow')]");
	public static final By t23Description = By.xpath("//em[contains(text(), 'official live blog')]");
	public static final By t23Friday = By.xpath("//strong[contains(text(), 'Friday 7 March')]");
	public static final By t23Paragraph1 = By.xpath("//p[contains(text()[1], 'United youngster ')]");
	public static final By t23Paragraph2 = By.xpath("//p[contains(text(), 'it from us for')]");
	public static final By t23Paragraph3 = By.xpath("//p[contains(text(), 'just spoken to')]");
	public static final By t23SidebarItem1 = By.xpath("//div[@class='newssidebar newssidebarRender']/div[1]/div/a");
	public static final By t23Social = By.xpath("//div[@id='newsratecontainer']");
	public static final By t23BottomPagination = By.xpath("//div[contains(text(), '1 of 16')]");
	public static final By t23HeaderNextBtn = By.xpath("//div[@class='newsstory']/div[2]/a");
	public static final By t23BottomPrevBtn = By.xpath("//div[@id='bottompager']/div[1]/a[1]");
}
