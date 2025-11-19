package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;

public class BaseClass 
{
  
 public	WebDriver driver;
	
    public BaseClass(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    	
    }
 
}
