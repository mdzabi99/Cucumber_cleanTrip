package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  extends BaseClass {

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[name()='svg'  and @data-testid='closeIcon']") WebElement LoginPopUp;
	
	@FindBy(xpath = "(//p[@cursor='pointer'])[1]") WebElement offerButton;
	
	@FindBy(xpath="(//ul//li//a)[4]") WebElement HotelFAQ_Link;
	
	
	
	
	
	public void LoginPOPUP() throws InterruptedException 
	{
		LoginPopUp.click();
		Thread.sleep(2000);
	}
	
	
	public void ClickOffer() throws InterruptedException
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
			
		
	WebElement OfferBtn=	wait.until(ExpectedConditions.visibilityOf(offerButton));
		
		
	OfferBtn.click();
		Thread.sleep(2000);
	}
	
	public void Click_HotelFAQ_Link() throws InterruptedException
	{
		HotelFAQ_Link.click();
		Thread.sleep(2000);
	}
	
	public String HomePageTile()
	{
		driver.navigate().back();
		String Tilte=driver.getTitle();
		
		return Tilte;
	}
	
}
