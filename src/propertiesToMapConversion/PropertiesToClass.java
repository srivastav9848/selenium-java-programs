package propertiesToMapConversion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesToClass {
public static void main(String[] args) throws Exception {
	Map empmap=new HashMap();
	File file=new File("D:\\cucumber_jobs\\RishabAgarwal\\datamap.properties");
	FileInputStream fis=new FileInputStream(file);
	Properties prop=new Properties();
	prop.load(fis);
	fis.close();
	Enumeration enumkeys=prop.keys();
	while(enumkeys.hasMoreElements())
	{
		String key=(String) enumkeys.nextElement();
		String value=prop.getProperty(key);
		empmap.put(key, value);
	}
	System.out.println(empmap);
	
	
} 
}
