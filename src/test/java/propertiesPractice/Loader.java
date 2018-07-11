package propertiesPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Loader {
	private static Properties prop ;
	
	 
	  
	    static {
	         prop = new Properties();
	      
	      try {
	        FileInputStream fis = new FileInputStream("info.properties");
	        prop.load(fis);
	      
	      
	      } catch (IOException e) {
	        
	        e.printStackTrace();
	      }
	      
	      
	    }
	    public static String getMyValue(String key) {
	    String value=prop.getProperty(key);
		return value;
	}
}
