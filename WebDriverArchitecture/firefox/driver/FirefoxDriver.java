package firefox.driver;

import driver.webdriver.Webdriver;

public class FirefoxDriver implements Webdriver {

	public void launchBrowser() {
		System.out.println("Browser launching FireFox");
	}

	public void click() {
		System.out.println("Click on FireFox");
	}

	public void type() {
		System.out.println("Entering value FireFox");
	}

}
