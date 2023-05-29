package assignment1;

import org.testng.annotations.Test;

public class Runner_class extends Generic_script
{
  @Test
  public void search()
  {
	  POM_Script p=new POM_Script(driver);
	  p.search("iphone 13");
	  p.button();
	  
	  
  }
}
