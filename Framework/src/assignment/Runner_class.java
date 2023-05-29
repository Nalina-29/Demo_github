package assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner_class extends Generic
{
   @Test
   public void flip()
   {
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone13");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
   }
   
   
     @Test
    
   public void flip2()
   {
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("sumsung");
	   driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	   Assert.fail();
   }
   
   

}
