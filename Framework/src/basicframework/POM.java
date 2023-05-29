package basicframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM 
{
	  @FindBy(xpath="//input[@ type='text']")
	   private WebElement untbox;
	   @FindBy(xpath="//input[@ type='password']")
	   private WebElement pwdtbox;
	   @FindBy(xpath="//button[@ type='submit']")
	   private WebElement loginbtn;
	  
	   public POM(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   public void unData(String un)
	   {
		    untbox.sendKeys(un);
	   }
	   public void pwdData(String pwd)
	   {
		   pwdtbox.sendKeys(pwd);
	   }
	   public void login()
	   {
		   loginbtn.click();
	   }
	}

