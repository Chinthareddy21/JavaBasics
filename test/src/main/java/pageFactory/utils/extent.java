package pageFactory.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent {
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	public void extentSearchSetup() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("spark/search.html");
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.DARK);
		test = extent.createTest("Homepage_tests");
	}

	public void extentTearDown() {
		extent.flush();
	}
}