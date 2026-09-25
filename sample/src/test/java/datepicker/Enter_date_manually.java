package datepicker;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Enter_date_manually extends Base_datepicker
{
  @Test
  public void Enter_date() throws InterruptedException
  {
	 
	  // assign variable as today for local current date 
	  LocalDate currentdate = LocalDate.now();
	  
	  String today = currentdate.toString();
	  System.out.println("today's date is : " + today);
	  
	  WebElement datepicker = driver.findElement(By.id("dp-basic-input"));
	  datepicker.sendKeys(today);
	  
	  //verify the date is entered correctly
	  
	  String selecteddate =datepicker.getAttribute("value");
	  System.out.println("selected date is : " + selecteddate);
	 
	  String entereddate = driver.findElement(By.id("result-s01")).getText();
	  System.out.println("entered date is : " + entereddate);
	  
	  
	
  }
}
