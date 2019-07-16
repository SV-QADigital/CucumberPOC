package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileReader {
	
	public static String propertyreader(String filepath,String Keyvalue) throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(filepath)));
		String property = prop.getProperty(Keyvalue);
		return property;
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException,
	 IOException { String propertyreader = propertyreader(
	  "C:\\Users\\amaresh.rout\\eclipse-workspace\\CucumberPOC\\src\\main\\propertyfiles\\ApplicationDetails.properties",
	"URL"); System.out.println(propertyreader); }
	 
}


