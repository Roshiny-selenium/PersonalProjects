package baseurl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class HandlingAds
{
	public WebDriver driver;
	
	 @Test
	  public void beforeTest() throws InterruptedException
	 { 
		 System.setProperty("webdriver.gecko.driver", "C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	     FirefoxDriver driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(1000);
	     driver.get("https://practice.expandtesting.com/?utm_source=chatgpt.com");
	     Thread.sleep(1000);
	      
	     //WAIT
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	     //use try catch to try the wait and click the close button  and catch the Timeoutexception
	     
	     try
	     {
	    	 //wait until element 
	    	 
	    	 WebElement closeAd = wait.until
	    			 (ExpectedConditions.elementToBeClickable( By.cssSelector("g[class ='down']")));
	    	            
	    	 closeAd.click();
	         System.out.println("Dynamic ad closed");
	    	 
	    	 
	     } 
	     
	    catch (TimeoutException e) {
	        System.out.println("No ad appeared");
	    }
	     
	 
	 
	 
	     }
	 }

  
 

//  @AfterTest
//  public void afterTest()
//  {
//  }


