package abstraction;

public abstract class WebDriver {
	
	public abstract void click();
	
	
	public abstract void type();
	  
	public abstract void takeScreenshot();
	
	public void openBrowser() {  
		System.out.println("Browser is opened");
		
	}

}
