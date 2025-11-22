package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UTILITIES.Helper_Wait;
import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;

public class BaseClass 
{
  
 public	WebDriver driver;
 Helper_Wait wait;
	
    public BaseClass(WebDriver driver)
    {
    	this.driver=driver;
    	wait = new Helper_Wait(driver); 
    	PageFactory.initElements(driver, this);
    	
    	
    }
 
}
