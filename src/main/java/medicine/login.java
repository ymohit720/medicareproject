package medicine;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class login {
	private WebDriverWait wait;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/ul/div[1]/span/li/span")
	private WebElement Specialmedicine;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/ul/div[1]/div/a[1]/button/span")
	private WebElement condition;
	
	@FindBy (xpath = "/html/body/div[1]/div/div[5]/div/div/div[2]/div[1]/a")
	private WebElement antivirus;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[5]/div/div/div[2]/div[1]/div/div/button")
	private WebElement firstmedicine;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[5]/div/div/div[2]/div[3]/div/div/button")
	private WebElement secondmedicine;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[5]/div/div/div[2]/div[4]/div/div/button")
	private WebElement thirdmedicine;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[5]/div/div/div[2]/div[5]/div/div/button")
	private WebElement fourthmedicine;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/span")
	private WebElement cart;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[5]/div[1]/div/div[2]/div[1]/div/div[1]/div[3]/div[2]/span")
	private WebElement firstremove;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[5]/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/span")
	private WebElement secondremove;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[5]/div[1]/div/div[2]/div[1]/div/div[3]/div[3]/div[2]/span")
	private WebElement thirdremove;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/div/div[5]/div[1]/div/div[2]/div[1]/div/div[4]/div[3]/div[2]/span")
	private WebElement fourthremove;
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  
		}
	    public void Specialmedicine() {
	    	Specialmedicine.click();
	    }
	    public void condition() {
	    	condition.click();
	    }
	    public void antivirus() {
	    	wait.until(ExpectedConditions.visibilityOf(antivirus));
	    	antivirus.click();
	    }
	    public void firstmedicine() {
	    	firstmedicine.click();
	    }
	    public void secondmedicine() {
	    	  secondmedicine.click();
	    }
	    public void thirdmedicine() {
	    	thirdmedicine.click();
	    }
	    public void fourthmedicine() {
	    	fourthmedicine.click();
	    }
	    public void cart() {
	    	cart.click();
	    }
	    public void firstremove() {
	    	firstremove.click();
	    }
	    public void secondremove() {
	    	secondremove.click();
	    }
	    public void thirdremove() {
	    	  thirdremove.click();
	    }
	    public void fourthremove() {
	    	fourthremove.click();
	    }	

}
