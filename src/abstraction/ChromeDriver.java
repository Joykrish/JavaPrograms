 package abstraction;

public class ChromeDriver extends WebDriver {

	@Override
	public void click() {
		
		System.out.println("click for ChromeDriver");
	}

	@Override
	public void type() {
		System.out.println("Type for ChromeDriver");
		
	}

	@Override
	public void takeScreenshot() {
		System.out.println("Screenshot for chromeDriver");
		
		
	}

}
