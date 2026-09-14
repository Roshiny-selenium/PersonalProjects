package Windows_handling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class MultipleWindowshandling 
{
	protected WebDriver driver;
	
	 @BeforeTest
	  public void OpenBrowser() throws InterruptedException 
	 {
		 //open firefox browser
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(1000);
	      }
	 
  @Test
  public void OpenWindow()throws InterruptedException 
  {
	  driver.get("https://demoqa.com/browser-windows");
	  
	  //click on the new tab
	  driver.findElement(By.id("tabButton")).click();
	  Thread.sleep(1000);
	   String parentwindow = driver.getWindowHandle();
	  System.out.println("switched to new tab");
	  driver.getTitle();
	  
	  //get text from new tab 
	  Set<String> newtab = driver.getWindowHandles();
			  for(String tab : newtab)
			  {
				  if(!tab.equals(parentwindow))
				  {
					  driver.switchTo().window(tab);
					  System.out.println("switched to new tab:"+newtab );
					  String newtaburl = driver.getCurrentUrl();
					  System.out.println("newtab text is:"+ newtaburl);
					  Thread.sleep(1000);
					  
					  //Get the text from new tab
					  String newtabtext = driver.findElement(By.id("sampleHeading")).getText();
					  System.out.println("new tab text is:"+newtabtext);
					  
					  //navigate back to parent window
					  driver.switchTo().window(parentwindow);
					  System.out.println("switched to parent window");
				  }
			  }
					  //click on 2nd new window button
					  driver.findElement(By.id("windowButton")).click();
					  Thread.sleep(1000);
				
					  
					  Set<String> newwindow = driver.getWindowHandles();
					  for(String opennewwindow : newwindow )
					  {
						  if(!newwindow.equals(parentwindow))
						  {
						    driver.switchTo().window(opennewwindow);
						    System.out.println("new window opened");
						    driver.manage().window().maximize();
						    
						    // get url of new window 
						   String Url = driver.getCurrentUrl();
						    System.out.println("new window url:"+ Url);
						    
						    //minimize opened window
						   driver.manage().window().minimize();
						    
						    
						  }
					  }
					  
					  
				  }
			  
	  
  

 @AfterTest
 public void closeallwindows()
 {
	 driver.close();
	 System.out.println("windows quit");
 }
 }


