package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_script 
{
	public WebDriver driver;
  @BeforeMethod
  public void OpenApp()
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in");
  }
  
  @AfterMethod
  public void closeApp()
  {
	  driver.close();
  }
}
