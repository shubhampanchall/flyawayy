package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class Tests extends Base{

WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void setup()
	{
		
		driver.get("http://localhost:8082/FlyAway/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Execution() {
		
		
		Exercise obj=new Exercise(driver);
		
		obj.Signup();
		
		obj.Sign();
		
		obj.Emailid();
		
		obj.Passworddd();
		
		obj.cpassowrd();
		
		obj.name();
		
		obj.Addresss();
		
		obj.City();
		
		obj.LastSignup();
		
		obj.Tocheckingfilghts();
		
		obj.Email();
		
		obj.Pass();
		
		obj.Loginn();
		
		obj.Clickhome();
		
		obj.ClickSource();
		
		obj.ClickDestination();
		
		obj.ClickSubmitt();
		
		obj.ClickBookFlight();
		
		obj.ClickToSee();
		
		obj.ClickToSeeBooking();
		
		
		//obj.LoginAll();
		
	
		
		
		
	
		
		//obj.loginn();
		
		obj.Tocheckingfilghts();
	}

}
