package Windows_handling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Windowshandling 
{
	public WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() throws InterruptedException 
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
	  driver.get("https://the-internet.herokuapp.com/windows");
	  String parentWindow = driver.getWindowHandle();//==>main syntax to get click element in parent window

	  driver.findElement(By.xpath("//a[@href ='/windows/new\']")).click();
	  Thread.sleep(1000);
	  
	  Set<String>allwindows =driver.getWindowHandles();
	  for(String window :allwindows)
	  {
	  if(!window.equals(parentWindow))
	  {
		  driver.switchTo().window(window);
		  System.out.println("switched to new window");
		  
	  }
	  else
	  {
		  System.out.println("switched to parent window");
	  }
	  }
	  
	  //get the text from new window
	  String newwindowtext = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
	  System.out.println("new window text is :"+ newwindowtext);
	  Thread.sleep(1000);
	  driver.switchTo().window(parentWindow);  
	  System.out.println("switched to parent window");
	  
  }
//  @AfterTest
//  public void afterTest()
//  {
//  }

}
