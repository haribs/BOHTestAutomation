package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used for initializing the browser driver based on the browser
	 * name supplied
	 * 
	 * @param browserName
	 * @return driver
	 */
	public WebDriver initilize_Driver(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\BOHTestAutomation\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\BOHTestAutomation\\WebDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println(browserName + " browser is not found");
		}

		driver.manage().window().maximize();
		return driver;

	}

	
	/**
	 * This method is used for launching a url using driver.get selenium method
	 * 
	 * @param url
	 */
	public void launchURL(String url) {
		driver.get(url);
	}

	
	/**
	 * This method is used for launching a url using driver.navigate selenium method
	 * 
	 * @param url
	 */
	public void navigateToURL(String url) {
		driver.navigate().to(url);
	}

	
	/**
	 * This method returns the title of the web page
	 * 
	 * @return Title
	 */
	public String doGetTitle() {
		return driver.getTitle();
	}

	
	/**
	 * This method moves the web page forward
	 */
	public void doNavigateForward() {
		driver.navigate().forward();
	}

	
	/**
	 * This method moves the web page back
	 */
	public void doNavigateBack() {
		driver.navigate().back();
	}

	
	/**
	 * This method refreshes the browser window
	 */
	public void doRefreshWindow() {
		driver.navigate().refresh();
	}

	/**
	 * This will scroll the web page till end.
	 */
	public void doScrollPageToEnd() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	/**
	 * This method is used for closing the browser
	 */
	public void doQuitBrowser() {
		driver.quit();
	}

	
	
	
	
}
