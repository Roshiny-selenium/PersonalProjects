package baseurl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class handlingNestedframes
{
	public WebDriver driver;
  
  @BeforeTest
  public void Openbrowser() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\eclipse-java-2025-03-R-win32-x86_64\\eclipse\\driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	     FirefoxDriver driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.automationtesting.in/Frames.html");
	     Thread.sleep(1000);
	     //driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
  }

	@Test
	  public void nestedframes() throws InterruptedException 
	{
		//click framein frame heading
		WebElement frameinframe = driver.findElement(By.xpath("//a[text()= 'Iframe with in an Iframe']"));
		frameinframe.click();
		Thread.sleep(1000);
		
		//click outerframe
		WebElement outerframe = driver.findElement(By.xpath("//h5[text()= 'Nested iFrames']"));
		driver.switchTo().frame(outerframe);
		System.out.println("switched to outerframe");
		Thread.sleep(1000);
		
		//click innerframe
		WebElement innerframe = driver.findElement(By.xpath("//h5[text() ='iFrame Demo']"));
		innerframe.getText();
		driver.switchTo().frame(innerframe);
		System.out.println("switched to innerframe");
		
		//Enter text
		driver.findElement(By.cssSelector("input[type = 'text']")).sendKeys("aa");
		
		
	  }
  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }
   
}
