package pageFactory.pageRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageFactory.objectRepository.objects;
import pageFactory.utils.credentials;

import static pageFactory.utils.extent.test;

public class search {
	private static final Logger log = LogManager.getLogger(search.class);
	WebDriver driver;

	public search(WebDriver driver) {
		this.driver = driver;
	}

	public void searching() {
		try {
			objects.searchBox(driver).sendKeys(credentials.searchWord());
			objects.searchBox(driver).sendKeys(Keys.RETURN);
			test.pass("SUCCESSFULLY SEARCHED");
			log.info("SUCCESSFULLY SEARCHED");
		} catch (Exception e) {
			test.fail(e);
			log.error(e);
		}
	}
}