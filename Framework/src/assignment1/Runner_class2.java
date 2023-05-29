package assignment1;

import org.testng.annotations.Test;

public class Runner_class2 extends Generic_script
{
 @Test
 public void phone()
 {
	 POM_Script p1=new POM_Script(driver);
	 p1.search("iphone 13");
	  p1.button();
	  
	 p1.phone();
	  
 }
}
