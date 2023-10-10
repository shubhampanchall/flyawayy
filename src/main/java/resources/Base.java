package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver= new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://localhost:8082/FlyAway/");
		
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		
	}
}
