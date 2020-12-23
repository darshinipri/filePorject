package com.onebill.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AnotherConfig {

	   public static void main(String args[]) throws IOException {
	      Properties prop = readPropertiesFile("/home/onebill/eclipse-workspace/demoproject/demo/resources/congif/config.properties");
	      System.out.println("username: "+ prop.getProperty("user"));
	      System.out.println("company1: "+ prop.getProperty("company1"));

}

	private static Properties readPropertiesFile(String filename) throws IOException {
		FileInputStream fis=null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(filename);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
	}
