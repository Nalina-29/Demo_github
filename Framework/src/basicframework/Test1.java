package basicframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Test1 
{
 @Test
 public void data() throws FileNotFoundException, IOException
 {
	 Properties p=new Properties();
	 p.load(new FileInputStream("./p.properties"));
	String val = p.getProperty("id");
	System.out.println(val);
 }
}
