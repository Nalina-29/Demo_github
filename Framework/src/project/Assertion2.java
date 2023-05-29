package project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 extends GenericScript
{ 
	@Test

	 public void asser() throws InterruptedException
	 {
		 driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("9741511136");
		   driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("Naliname@29");
		   driver.findElement(By.xpath("//button[@ type='submit']")).click();
		   Thread.sleep(2000);
		  String title = driver.getTitle();
		   System.out.println(title);
		   Assert.assertEquals(title, "Facebo");
		   System.out.println("1");

}
}

