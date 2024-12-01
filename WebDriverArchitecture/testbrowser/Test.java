package testbrowser;

import chrome.driver.ChromeDriver;
import driver.webdriver.Webdriver;
import firefox.driver.FirefoxDriver;
import internetexplore.driver.InternetExplorerDriver;

public class Test {

	public static String browserName = "chrome";
	public static Webdriver driver;

	public static void main(String[] args) {

		if (browserName.equals("chrome")) {

			driver = new ChromeDriver();
			driver.launchBrowser();

		} else if (browserName.equals("firefox")) {

			driver = new FirefoxDriver();
			driver.launchBrowser();

		}

		else if (browserName.equals("firefox")) {

			driver = new InternetExplorerDriver();
			driver.launchBrowser();

		}

		driver.click();
		driver.type();
	}

}
