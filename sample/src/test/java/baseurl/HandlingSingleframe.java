package baseurl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HandlingSingleframe
{
	public WebDriver driver;
	 @BeforeTest
	  public void beforeTest() throws InterruptedException 
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	     driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.hyrtutorials.com/p/frames-practice.html?utm_source=chatgpt.com");
	     Thread.sleep(1000);
	     driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
	     
	 
	 }
 
  @Test
  public void singleframe() throws InterruptedException 
  {
	  //scroll to specific element
	  // WebElement scrollHYR = driver.findElement(By.tagName("[h1][4]"));
	  
	  //scroll to specific amount
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,500);");
	  System.out.println("scrollcompleted");
	  Thread.sleep(1000);
	  
	  //switch to frame1
	  WebElement iframe1 = driver.findElement(By.id("frm1"));
	  driver.switchTo().frame(iframe1);
	  System.out.println("switched to iframe");
	  Thread.sleep(1000);
	  
	 
	  //read text inside the frame1
	  
	  String element = driver.findElement(By.xpath("//li[normalize-space()='Single-Selection Dropdown']")).getText();
	  System.out.println(element);
	  Thread.sleep(1000);
	  driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
	  
//	List<WebElement> readinframe = driver.findElements(By.xpath("//div/li[113]"));
//	
//	for (WebElement item : readinframe)
//	{
//	
//		System.out.println(item);
//		Thread.sleep(1000);
//	}
	  
	//scroll to specific element
	  WebElement scrollcourse = driver.findElement(By.xpath("//b[normalize-space()='Course Name:']"));
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
	  js1.executeScript("arguments[0].scrollIntoView(true);",scrollcourse);
	  System.out.println(scrollcourse);
	  Thread.sleep(1000);
	  driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
	  
	  
	  //select dropdown inside frame 
//WebElement selectcourse = driver.findElement(By.id("course"));
//Select course =new Select(selectcourse);
//course.selectByValue("java");
//System.out.println(course);
//course.deselectByValue("Select");

//WebElement coursejava = driver.findElement(By.id("course"));

//if (coursejava.isSelected()) {
//    System.out.println("Selected");
//} else {
//    System.out.println("Deselected");
//}


  }
 

  

//  @AfterTest
//  public void afterTest() {
//  }

}
