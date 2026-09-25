package screenshot;

import org.testng.annotations.Test;

import Base_datadriven.BaseTest;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SampleScreenshot  extends BaseTest
{
	
  @Test
  public void homepageScreenshot()throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@href='/account/login']")).click();
	  driver.findElement(By.id("customer_email")).sendKeys("roshinyharidharan1998@gmail.com");
	  driver.findElement(By.xpath("//input[@id ='customer_password']")).sendKeys("Roshy@12345");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@value='Sign In']")).click();
	  Thread.sleep(1000);
	  
	  //Wait until the element My acccount appears 
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));
	 WebElement myaccount =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/account']")));
	 System.out.println("My account is displayed : " + myaccount.isDisplayed());
		
	 if(myaccount.isDisplayed())
	 {
		 System.out.println("Login is successful");
		 //take screenshot of the homepage 
		  TakesScreenshot ts = (TakesScreenshot) driver;

		  File source = ts.getScreenshotAs(OutputType.FILE);

		  // Save screenshot in the same package
		  File destination = new File(
				  "src/test/java/screenshot/Homepage.png"
		  );
		  source.renameTo(destination);

		  System.out.println("Screenshot saved successfully");
	 }
	 else
	 {
		 System.out.println("Login is unsuccessful");
		 driver.close();
	 }
	 
	 //StringBuilder sb = new StringBuilder();
	  
  }
  }
			  

