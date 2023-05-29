

package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Script 
{
	String value="";
    public static String get_data(String sh,int r,int c)
    {
    	String value="";
    	try {
    	FileInputStream fis= new FileInputStream("./Excel/selenium.xlsx");
    	Workbook book = WorkbookFactory.create(fis);
    	Sheet shee = book.getSheet(sh);
    	Row row = shee.getRow(r);
    	Cell cel = row.getCell(c);
    	 value= cel.toString();
    	}
    	catch (Exception e) 
    	{
			System.out.println(e);
		}
  return value;
}
}

