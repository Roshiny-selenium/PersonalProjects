package Base_datadriven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest

{
	public WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() throws InterruptedException 
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://sauce-demo.myshopify.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	
	}
	
	
  

 @AfterMethod
  public void closewindow()
  {
	  

    if (driver != null) 
    {
        driver.quit();
    }
  }
}
//	  
//  }


