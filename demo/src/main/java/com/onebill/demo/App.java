package com.onebill.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.ResourceBundle;

public class App {
	
public static void main(String[] args) throws Exception {
//	FileReader reader = null;
//	try {
//		reader = new FileReader("/home/onebill/eclipse-workspace/demoproject/demo/resources/congif/config.properties");
//		
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	}  
//	Properties p=new Properties();  
//    p.load(reader); 
//    System.out.println(p.getProperty("1"));  
//    System.out.println(p.getProperty("2"));  
//	   String browser = rb.getString("browser");

      ResourceBundle rb= ResourceBundle.getBundle("demoproject.resources.congif.config");
      System.out.println(rb.getString("user"));
      System.out.println(rb.getString("company1"));
}
    	
	}


