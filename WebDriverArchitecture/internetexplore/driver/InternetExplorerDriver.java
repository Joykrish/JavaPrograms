package internetexplore.driver;

import driver.webdriver.Webdriver;

public class InternetExplorerDriver implements Webdriver {
	
	public void launchBrowser() {
		System.out.println("Browser launching InternetExplorer");
	}

	public void click() {
		System.out.println("Click on InternetExplorer");
	}

	public void type() {
		System.out.println("Entering value InternetExplorer");
	}
	
	

}
