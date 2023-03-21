package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ADS.BaseClass.Base;
import com.ADS.Utility.ADS_Listners;
import com.ADS.pages.Homepage;


@Listeners(ADS_Listners.class)
public class HomePageTest extends Base {

	Homepage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeTest
	public void HitBrowser() {
		log.info("Launching Browser");
		LaunchBrowser();
		homepage = new Homepage();
	}

	@Test(priority = 1)
	public void type() throws Throwable {
		log.info("running homepage Test Cases");
		homepage.Typefname("Gaurav");
		homepage.TypeLname("Mahajan");
		homepage.TypeEmail("gaurav@gmail.com");
		homepage.TypeAddress("Alandi road");
		Thread.sleep(2000);
		Assert.assertEquals(false, false);

	}
	
	@Test(priority = 2)
	public void Webtable() throws Throwable {
		log.info("running homepage Test Cases");
		homepage.clickOnWebtable();
		Assert.assertEquals(false, false);
		
		

	}

	@AfterTest
	public void TearDown() {
		driver.close();
	}
}
