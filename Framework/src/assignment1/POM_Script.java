package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script
{
   @FindBy(xpath="//input[@placeholder='Search Amazon.in']")
   public WebElement sea;
   @FindBy(id="nav-search-submit-button")
   public WebElement butn;
   @FindBy(xpath="//span[.='Apple iPhone 13 (128GB) - Pink']")
   public WebElement phone;
   @FindBy(xpath="//input[@value='Add to Cart']")
   public WebElement cart;
   
   public POM_Script(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void search(String s)
   {
	   sea.sendKeys(s);
   }
   public void button()
   {
	   butn.click();
   }
   public void phone()
   {
	   phone.click();
   }
   public void cart() {
	   cart.click();
   }
}
