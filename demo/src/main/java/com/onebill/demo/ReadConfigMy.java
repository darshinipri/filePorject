package com.onebill.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadConfigMy {
	
	public static Properties readPropertiesFile(String file) throws Exception {
		FileReader reader= null;
		Properties p=null;
		try {
			reader = new FileReader(file);
	         p = new Properties();
	         p.load(reader);
		} catch (FileNotFoundException e) {
			System.out.println("Exception: " + e);
		}finally {
	         reader.close();
	      }
		return p;
	}

}
