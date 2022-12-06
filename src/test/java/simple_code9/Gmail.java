package simple_code9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
	
	public static WebDriver driver;
	public static void main (String[] args) throws Exception {
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://Gmail.com");
		driver1.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.quit();
		driver1.quit();
	}

}
