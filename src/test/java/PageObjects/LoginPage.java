package PageObjects;

import java.time.Duration;
import java.util.List;

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
	
	@FindBy(xpath = "//input[contains(@placeholder,'Where from?')]" ) WebElement FromCity_InputBox;
	
	
	@FindBy(xpath = "//div[@class='mr-1 o-hidden']//p") List<WebElement> SourceCitys;
	
	@FindBy(xpath = "//*[@placeholder='Where to?']") WebElement ToCity_InputBox;
	
	@FindBy(xpath = "//p[contains(@class,'tt-ellipsis o-hidden fs-14 fw-500')]") List<WebElement> Dest_Citys;
	
	@FindBy(xpath = "(//button)[2]") WebElement searchflight;
	
	public void LoginPOPUP() throws InterruptedException 
	{
		LoginPopUp.click();
		Thread.sleep(2000);
	}
	
	public void FromCity_Box()
	{
		FromCity_InputBox.click();
	}
	
	
	public void  FromCity()
	{
		
		for(WebElement city:SourceCitys)
		{
			//System.out.println(city.getText().toString());
			
		        String reqCity=	city.getText().toString();
			     if(reqCity.contains("Bengaluru"))
			     {
				         city.click();
				         break;
			     }
		}
		
	}
	
	
	
	
	public void ToCity_Box()
	{
		ToCity_InputBox.click();
	}
	
	public void ToCity()
	{

		
		for(WebElement city:Dest_Citys)
		{
			  /* 	System.out.println(city.getText().toString());*/
			
		     String reqCity=	city.getText().toString();
			     if(reqCity.contains("New Delhi"))
			     {
				         city.click();
				         break;
			     }
		}
	}
	
	public void searchButton()
	{
		wait.WaitForElement(searchflight,Duration.ofSeconds(30));
		
		searchflight.click();
	}
	
	
}
