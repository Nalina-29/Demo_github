package project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft extends GenericScript
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
		 SoftAssert sa= new SoftAssert();
		 sa.assertEquals(title, "Face");
		 System.out.println("2");
		 sa.assertAll();
}
}
