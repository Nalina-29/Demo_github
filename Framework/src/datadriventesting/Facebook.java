package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException 
  {
	 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://facebook.com");
	 
	 FileInputStream fis= new FileInputStream("./Excel/selenium.xlsx");
     Workbook book = WorkbookFactory.create(fis);
     Sheet sh = book.getSheet("Sheet1");
     Row r = sh.getRow(0);
    Cell c = r.getCell(0);
    String value = c.toString();
  
    driver.findElement(By.name("email")).sendKeys(value);
    Row r1 = sh.getRow(0);
    Cell c1 = r1.getCell(1);
    String value1 = c1.toString();
    
    driver.findElement(By.name("pass")).sendKeys(value1);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
} 
}
