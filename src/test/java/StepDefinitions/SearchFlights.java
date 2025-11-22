package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.LoginPage;
import io.cucumber.java.en.*;


public class SearchFlights extends TestBaseClass {
	
	

 
	 
	  
@Given("User launches Chrome browser")
public void user_launches_chrome_browser() 
{
  
	
	 driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
     LP = new LoginPage(driver);
}

@When("User opens URL {string}")
public void user_opens_URL(String string) 
{

	driver.get(string);
	
}

@When("User closes the login popup")
public void user_closes_the_login_popup() throws InterruptedException 
{
   
	LP.LoginPOPUP();
	
}



@When("User clicks on from input box Drop Down will Displayed")
public void user_clicks_on_from_input_box_drop_down_will_displayed() 
{
    LP.FromCity_Box();
}

@Then("User Selects  source City from the Drop Down")
public void user_selects_source_city_from_the_drop_down() throws InterruptedException 
{
    LP.FromCity();
    Thread.sleep(2000);
}

@When("User clicks on ToCity input box Drop Down will Displayed")
public void user_clicks_on_to_city_input_box_drop_down_will_displayed()
{
    LP.ToCity_Box();
}

@Then("User Selects  Destination City from the Drop Down")
public void user_selects_destination_city_from_the_drop_down()
{
    LP.ToCity();
}



@Then("User clicks on search flights Button")
public void user_clicks_on_search_flights_button() throws InterruptedException 
{
	Thread.sleep(2000);
	LP.searchButton();
}






}
