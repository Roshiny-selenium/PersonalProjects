package utility;

import org.testng.annotations.Test;

import Base_datadriven.BaseTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ExcelReader extends BaseTest
{
 

  @DataProvider
  public static Object[][] getExcelData(String filepath, String sheetname) throws IOException
  {
	  //create object to open file excel
	  FileInputStream fis = new FileInputStream(filepath);
	  
	  // create object to open workbook
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  
	  // create object to open sheet
	  XSSFSheet sh = wb.getSheet(sheetname);
	  
	  //initiate and get the rows and columns 
	  int rowcount = sh.getPhysicalNumberOfRows();
	  int columncount = sh.getRow(0).getPhysicalNumberOfCells();
	 
	  //create object and get the arrays 
     Object[][] data = new Object[rowcount-1][columncount];
     
     //looping the excel  , here for rows i==1  because 0 initializes the header
     for(int i=1 ; i<rowcount ; i++)
     {
       for(int j=1 ; i<columncount ; j++)
       {
    	   data [i-1][j]= sh.getRow(1).getCell(1).toString();
        }
     }
     
	return data;
    
  }
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }

}
