package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.LoginPage;
import io.cucumber.java.en.*;


public class Login extends TestBaseClass {
	
	

 
	 
	  
@Given("User launches Chrome browser")
public void user_launches_chrome_browser() 
{
  
	
	 driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
     LP = new LoginPage(driver);
}

@When("User opens URL {string}")
public void user_opens_URL(String string) {

	driver.get(string);
	
}

@When("User closes the login popup")
public void user_closes_the_login_popup() throws InterruptedException {
   
	LP.LoginPOPUP();
	
}

@Then("User clicks on the Offer option")
public void user_clicks_on_the_offer_option()  throws InterruptedException {

	 LP.ClickOffer();

	 
}



@And("User is navigated to the home page and tile should be {string}")
public void user_is_navigated_to_the_home_page_and_tile_should_be(String string) {
	 
		
		String actual=LP.HomePageTile();
		Assert.assertEquals(actual, string);
		}


}
