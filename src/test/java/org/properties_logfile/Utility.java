package org.properties_logfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	
	public  static String getProperty(String key) {
		Properties p = new Properties();
		try {
			p.load(new FileReader("C:\\Users\\sasik\\eclipse-workspace\\Rest_Assured_Project\\PropertyFolder\\Config.properties"));
		}
			catch (Throwable e) {
		
			e.printStackTrace();
		}
		
		String property = p.getProperty(key);
		return property;
	}

	
	
	

		
	

}