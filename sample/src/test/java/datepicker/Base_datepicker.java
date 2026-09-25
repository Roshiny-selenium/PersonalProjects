package datepicker;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;


public class Base_datepicker
{
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void Setup(String browser)throws InterruptedException
	
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("WebDriver.gecko.driver", "C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome.dirver","C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver = new ChromeDriver();
		}
		
		driver.get("https://qaplayground.com/practice/date-picker");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	
	}

	
	}
	
  

//  @AfterMethod
//  public void afterMethod()
//  {
//	  if(driver!=null)
//	  {
//		  driver.quit();
//	  }
//  }





