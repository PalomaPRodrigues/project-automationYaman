package drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public static WebDriver createChorme() {
		if(driver == null) {
			String pathDriverChorme = System.getProperty("user.dir") + "\\src\\main\\java\\chromedriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", pathDriverChorme);
			driver = new ChromeDriver();
			wait = new WebDriverWait(DriverFactory.createChorme(),22);
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public void navega(String url) {
		DriverFactory.createChorme().get(url);
	}
	
	public static void encerraDriver() {
		if(driver != null) {
			   driver.quit();
			   driver = null;
		}
	}
	

}
