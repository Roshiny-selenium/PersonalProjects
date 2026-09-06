package baseurl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Iframe extends Base_url_code
{
  @Test
  public void click_iframe() throws InterruptedException
  {
	//scroll to specific element
	  WebElement AFW = driver.findElement(By.linkText("Alerts, Frame & Windows"));
 JavascriptExecutor js2 = (JavascriptExecutor) driver;
 js2.executeScript("arguments[0].scrollIntoView(true);",AFW);
	  
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("Alerts, Frame & Windows")).click();
	  Thread.sleep(1000);
	//  driver.findElement(By.xpath("//div[text() = 'Alerts, Frame & Windows']")).click();
	  driver.findElement(By.xpath("//span[text()= 'Frames']")).click();
	  
	  
	//switching to frame1
	  WebElement iframe1 = driver.findElement(By.id("frame1"));

	  driver.switchTo().frame(iframe1);

	  System.out.println("Switched to frame 1");
	  
	  //get text from n number of h1
//	  List<WebElement> headings = driver.findElements(By.tagName("h1"));
//
//	  System.out.println("Number of h1: " + headings.size());
//
//	  for (WebElement heading : headings) {
//	      System.out.println(heading.getText());
	  
	  String frametext = driver.findElement(By.xpath("//iframe[text()='This is a sample page']")).getText();
	  System.out.println(frametext);
	  
	  }
	  
  }
  }
  


