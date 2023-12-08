import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageFactory.pageRepository.search;
import pageFactory.utils.extent;

import static pageFactory.utils.urls.base;

public class SearchTest {

	private static final Logger log = LogManager.getLogger(SearchTest.class);
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		extent extent = new extent();
		extent.extentSearchSetup();
		driver = new ChromeDriver();
		log.info("Chrome driver set up completed");
		log.info("Chrome browser started");
	}

	@Test
	public void searchTest() {
		driver.get(base());
		search search = new search(driver);
		search.searching();
	}

	@AfterTest
	public void tearDown() {
		extent extent = new extent();
		extent.extentTearDown();
		driver.close();
		log.info("Closing chrome browser");
		driver.quit();
		log.info("closing all running browsers");
	}
}