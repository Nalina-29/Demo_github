package basicframework;

import org.testng.annotations.Test;

public class Runner_class extends Generic_class
{ 
	//public WebDriver driver;
@Test
public void validlogin() throws InterruptedException
{
	POM p= new POM(driver);
	Thread.sleep(2000);
	p.unData("9741511136");
	Thread.sleep(2000);
	p.pwdData("Naliname@29");
	Thread.sleep(2000);
	p.login();
}
}

