package chrome.driver;

import driver.webdriver.Webdriver;

public class ChromeDriver implements Webdriver{

	public void launchBrowser() {
		System.out.println("Browser launching Chrome");
	}

	public void click() {
		System.out.println("Click on Chrome");
	}

	public void type() {
		System.out.println("Entering value Chrome");
	}

}
