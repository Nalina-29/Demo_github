package basicframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_flip
{
@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement pop;
@FindBy(xpath="//input[@title='Search for products, brands and more']")
private WebElement sea;
@FindBy(xpath="//button[@type='submit']")
private WebElement sub;
@FindBy(xpath="//div[text()='realme C33 2023 (Night Sea, 64 GB)']")
private WebElement pho;
@FindBy(xpath="//button[@type='button']")
private WebElement but;

public POM_flip(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void popup()
{
	pop.click();
}
public void search(String send)
{
	sea.sendKeys(send);
}
public void submit()
{
	sub.click();
	
}
public void phone() {
	pho.click();
}
public void button() {
	but.click();
}
}
