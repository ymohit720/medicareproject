package mrmed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import medicine.login;



public class mrmedtesting {
WebDriver driver;
    
	@BeforeTest
	public void launchApplication() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mrmed.in/");
		}
	@Test
	public void mrmed() {
	login Specialmedicine = new login(driver);
	Specialmedicine.Specialmedicine();
	
	login condition = new login(driver);
	condition.condition();
	
	login antivirus= new login(driver);
	antivirus.antivirus();
	
	login firstmedicine = new login(driver);
	firstmedicine.firstmedicine();
	
	login secondmedicine = new login(driver);
	secondmedicine.secondmedicine();
	
	login thirdmedicine = new login(driver);
	thirdmedicine.thirdmedicine();
	
	login fourthmedicine = new login(driver);
	fourthmedicine.fourthmedicine();
	
	login cart = new login(driver);
	cart.cart();
	
	login firstremove = new login(driver);
	firstremove.firstremove();
	
	login secondremove = new login(driver);
	secondremove.secondremove();
	
	login thirdremove = new login(driver);
	thirdremove.thirdremove();
	
	login fourthremove = new login(driver);
	fourthremove.fourthremove();
	}}
