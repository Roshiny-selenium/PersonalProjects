package test;

import org.testng.annotations.Test;

import Base_datadriven.BaseTest;
import utility.ExcelReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginTest extends BaseTest
{
	String excelPath = "src/test/resources/LoginData.xlsx";


  @DataProvider(name= "Logindata")
  public Object[][] logindata() throws 	IOException
  {
	  
  
    return ExcelReader.getExcelData( excelPath,"Logindata");
  } 
  
  @Test (dataProvider = "Logindata")
  public void Logintest (String username , String password , String expected)
  {
	  System.out.println("Username is : " + username );
	  System.out.println("Password is : " + password );
	  System.out.println("Expected is : " + expected );
	  
	  //click on login link
	  driver.findElement(By.xpath("//a[@href='/account/login']")).click();
	  
	  //Enter username 
	  driver.findElement(By.id("customer_email")).sendKeys("roshinyharidharan1998@gmail.com");
	  
	  //Enter password
	  driver.findElement(By.id("customer_password")).sendKeys("Roshy@12345");
	  
	  //Click on login button
	  driver.findElement(By.xpath("//input[@value='Sign In']")).click();
	  
	  //Get the actual result
	 
	  
	  if(expected.equals("success"))
	  {
		  
		 driver.findElement((By.xpath("//a[@href='/account']"))).getText();
		
	 }
                
	  else if (!expected.equals("success"))
	  {
		  System.out.println("Incorrect email or password");
		  
		  Assert.assertTrue(
                  expected.contains("Incorrect email or password"));
	  }
		  
			 
  }
  

//  @AfterTest
//  public void afterTest() {
//  }

}
