package assignment1;

import java.util.Set;

import org.testng.annotations.Test;

public class Runner_class3 extends Generic_script
{
  @Test
  public void cart() 
  {
	  POM_Script p= new POM_Script(driver);
	  p.search("iphone 13");
	  p.button();
	  
	 p.phone();
	Set<String> all = driver.getWindowHandles();
	for (String wh : all)
	{
		driver.switchTo();
	}
	p.cart();	
	}
     
  }

