package week6day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {

	public ChromeDriver driver;
	@BeforeMethod
	
	public void runCreateDriver () {
		
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	@AfterMethod
	public void closeDriver() {
		driver.close();
	}


}

