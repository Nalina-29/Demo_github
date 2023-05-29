package project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testscript  extends GenericScript
{
   @Test
   public void validlogin() throws InterruptedException
   {
	   driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("9741511136");
	   driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("Naliname@29");
	   driver.findElement(By.xpath("//button[@ type='submit']")).click();
	   Thread.sleep(2000);
	   System.out.println(driver.getTitle());
   }
}
