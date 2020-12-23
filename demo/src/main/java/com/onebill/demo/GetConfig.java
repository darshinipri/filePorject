package com.onebill.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetConfig {
	
	String result = "";
	InputStream inputStream;
 
	public String getPropValues() throws IOException {
		
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
		    
//			inputStream =  getClass().getClassLoader().getResourceAsStream("/home/onebill/eclipse-workspace/demoproject/demo/resources/congif/config.properties");
			inputStream = new FileInputStream("/home/onebill/eclipse-workspace/demoproject/demo/resources/congif/config.properties");
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				
	
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
				
		      // get the property value and print it out
				    String user = prop.getProperty("user");
					String company1 = prop.getProperty("company1");
					String company2 = prop.getProperty("company2");
					String company3 = prop.getProperty("company3");
					
					result = "Company List = " + company1 + ", " + company2 + ", " + company3;
				
		
					
				} catch (Exception e) {
					System.out.println("Exception: " + e);
				} finally {
					inputStream.close();
				}
				return result;

}
}
