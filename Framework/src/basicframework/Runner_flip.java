package basicframework;

import org.testng.annotations.Test;

public class Runner_flip extends Generic_flip
{
@Test
public void flipkart()
{
	POM_flip p= new POM_flip(driver);
	p.popup();
	p.search("realme mobiles");
	p.submit();
	p.phone();
	p.button();
			
}

}
