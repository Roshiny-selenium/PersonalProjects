package baseurl;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Base_url_code 
{
  protected WebDriver driver;
  
  
  @Test
  public void URL() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver","C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/");
	  Thread.sleep(1000);
  }
	  //scroll to bottom
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("window.scrollTo(0,document.body.Scrollheight);");
	  
	  //scroll to specific amount
//	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
//	  js1.executeScript("window.scrollBy(0,500);");
	  
	  //scroll to specific element
	 
	  
  }


//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
//  
//
//  @AfterClass
//  public void afterClass() {
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//}

