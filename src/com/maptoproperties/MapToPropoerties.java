package com.maptoproperties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class MapToPropoerties {
	public static void main(String[] args) throws Throwable {
		Map detailsmap=new HashMap();
		detailsmap.put("EmpId", "10023");
		detailsmap.put("Designation", "Senior QA");
		detailsmap.put("Location", "Bengaluru");
		detailsmap.put("BloodGroup", "O+ve");
		File file =new File("D:\\cucumber_jobs\\RishabAgarwal\\src\\com\\maptoproperties\\empdetails.properties");
		FileOutputStream fod=new FileOutputStream(file);
		Properties prop=new Properties();
		Iterator keys=detailsmap.keySet().iterator();
		while(keys.hasNext())
		{
			String key=(String) keys.next();
			prop.setProperty(key, (String) detailsmap.get(key));
		}
		prop.store(fod, "done");
		
	}

}
