package table_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Table 
{
	public WebDriver driver;
  @Test
  public void Rowscolumns()
  {
	  System.setProperty("webdriver.gecko.driver","C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://qaplayground.com/practice/data-table");
	  
	  //get header names 
	  WebElement headernames = driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[2]/div/div/section/div/div[2]/table/thead"));
	 String heading =  headernames.getText();
	 System.out.println(heading);
	 
	 //get rows count
	 List<WebElement> rowscount = driver.findElements(By.xpath("//table[@id='dataTable']"));
      rowscount.size();
	 System.out.println("Total rows count is : " + rowscount.size());
	 
	 //get 2nd row data 
	 List<WebElement> secondrowdata = driver.findElements(By.xpath("//table[@id ='dataTable']/tbody/tr[2]"));
	 for(WebElement rowdata : secondrowdata)
	 {
		 String rowtext = rowdata.getText();
		 System.out.println("2nd row data is : " + rowtext);
	 }
	 
	 //get 3rd column data 
	 List<WebElement> thirdcolumndata = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/td[3]"));
	 for(WebElement columndata : thirdcolumndata)
	 {
		 String columndata1 =columndata.getText();
		 System.out.println("3rd column data is : " + columndata1);
	 }
	 
	 //get 3rd row second column data 
	 WebElement thirdrowsecondcolumndata = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]/td[2]"));
	String data=  thirdrowsecondcolumndata.getText();
	 System.out.println(data);
  }
}
