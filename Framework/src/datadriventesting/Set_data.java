package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Set_data
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream fis= new FileInputStream("./Excel/selenium.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet1");
	Row r = sh.createRow(0);
	Cell c = r.createCell(0);
	c.setCellValue("selenium");
	
	FileOutputStream fos= new FileOutputStream("./Excel/selenium.xlsx");
	book.write(fos);
			
}
}
