package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import resources.Base;

public class Exercise {

WebDriver driver;
	
	// Constructor
	public Exercise(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	
	}
	
	
	@FindBy (xpath="//a[normalize-space()='Login/Signup']")
	WebElement FirstSignup;
	
	@FindBy(xpath="//a[normalize-space()='Not a member? Signup']")
    WebElement signup ;
	
	@FindBy(xpath="//input[@name='email_id']")        
	WebElement Email ;
	
	@FindBy(xpath="//input[@name='pwd']")        
	WebElement password ;
	
	
	@FindBy(xpath="//input[@name='pwd2']")        
	WebElement ccpassword ;
	


	@FindBy(xpath="//input[@name='name']")        
	WebElement Name ;

	
	
	@FindBy(xpath="//input[@name='address']")        
	WebElement address ;
	
	
	@FindBy(xpath="//input[@name='city']")        
	WebElement city ;
	
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement Ssignupp;
	
	//@FindBy(xpath="//a[normalize-space()='Already a member? Login']")        
	//WebElement LoginAllready ;
	
	
	//@FindBy(xpath="//a[normalize-space()='Login/Signup']")
	//WebElement Login;
	
	
	
	@FindBy (xpath="//a[normalize-space()='Login to continue checking flights']")
	WebElement Flight;
		
	@FindBy (xpath="//input[@name='email_id']")
	WebElement Emaill;
	
	@FindBy (xpath="//input[@name='pwd']")
	WebElement PASS;
	
	
	@FindBy (xpath="//button[normalize-space()='Login']")
	WebElement loginn;
	
	
	@FindBy (xpath="//a[normalize-space()='Home']")
	WebElement Homee;
	
	
	@FindBy (xpath="//select[@name='source']")
	WebElement Source;
	
	@FindBy (xpath="//select[@name='destination']")
	WebElement Destination;
	
	@FindBy (xpath="//button[normalize-space()='Submit']")
	WebElement Submitt;
	
	@FindBy (xpath="//body[1]/table[1]/tbody[1]/tr[3]/td[6]/a[1]")
	WebElement BookFly;
	
	@FindBy (xpath="//a[normalize-space()='Click to complete booking']")
	WebElement ClickTo;
	

	@FindBy (xpath="//a[normalize-space()='See Your Bookings']")
	WebElement Clicksee;

	public void Signup() {
		
		FirstSignup.click();
	}
	
	
	public void Sign() {
		
		signup.click();
		
	}
	
	public void Emailid () {
		
		Email.sendKeys("shubhampanchal@gmail.com");
	}
	
	public void Passworddd() {
		
		password.sendKeys("123456787");
		
	}
	
	
	
	public void cpassowrd() {
		
		ccpassword.sendKeys("123456787");
	}
	
	
	public void name () {
		
		Name.sendKeys("shubham");
		
		
	}
	
	public void Addresss() {
		
		address.sendKeys("Mitra Nagar,Latur");
	}
	
	
	
	
	public void City() {
		
		city.sendKeys("Pune");
	}
	
	
	public void LastSignup() {
		
		Ssignupp.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void Tocheckingfilghts() {
		
		Flight.click();
		
	}
		
		
		
	
	
	public void Email() {
		
		Emaill.sendKeys("shubhampanchal@gmail.com");
		
		
	}
	
public void Pass() {
		
		PASS.sendKeys("123456787");
		
		
	}
	
   public void Loginn() {

	   loginn.click();
	   
	   try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
   
   public void Clickhome() {

	   Homee.click();
	}
	
   public void ClickSource() {

	   Source.click();
	}
   
   
   public void ClickDestination() {
	   
	   Destination.click();
   }
   
   
   public void ClickSubmitt() {
	   
	   Submitt.click();
	   
	   
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   driver. navigate(). back();
   }
   
  
   
  public void ClickBookFlight() {
	   
	   BookFly.click();
   }
   
   
   
  
  public void ClickToSee() {
	   
	  ClickTo.click();
   }
   
  public void ClickToSeeBooking() {
	   
	  Clicksee.click();
   }
   
   

	//public void LoginAll() {
		
		//LoginAllready.click();
	//}
	
	

	

	
	
	
	//public void loginn(){
		
	//	loginn.click();
	//}
}


