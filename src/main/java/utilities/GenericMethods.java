package utilities;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethods {
	
	public static WebDriver driver;
	
	/*
	 * Description : Method to Open Browser with specified URL Parameter : key - URL
	 * key Return Type : void Exception : IOException
	 */
	public void openUrl() throws IOException {
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(capability);
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
	}

}
