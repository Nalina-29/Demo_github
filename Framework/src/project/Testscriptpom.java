package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testscriptpom 
{
  @Test
  public void login() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 POM_script p=new POM_script(driver);
	 Thread.sleep(2000);
	 p.unData("9741511136");
	 Thread.sleep(2000);
	 p.pwdData("Naliname@29");
	 Thread.sleep(2000);
	 p.login();
  }
}
