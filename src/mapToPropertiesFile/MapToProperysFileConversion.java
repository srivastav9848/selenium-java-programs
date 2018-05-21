package mapToPropertiesFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class MapToProperysFileConversion {
public static void main(String[] args) throws Exception {
	Map datamap=new HashMap();
	datamap.put("Name","Sanjana");
	datamap.put("City","Mumbai");
	datamap.put("Country","India");
	File file=new File("D:\\cucumber_jobs\\RishabAgarwal\\datamap.properties");
	FileOutputStream fos=new FileOutputStream(file);
	Properties prop=new Properties();
	
	Iterator keys=datamap.keySet().iterator();
	while(keys.hasNext())
	{
		String key= (String) keys.next();
		prop.setProperty(key, (String) datamap.get(key));
	}
	prop.store(fos, null);
}
}
