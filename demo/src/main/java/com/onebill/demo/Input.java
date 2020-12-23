package com.onebill.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Input {

	public static void main(String[] args) {
		String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
		 List<String> arrayList = new ArrayList<String>(Arrays.asList(strArray));
		 
		 System.out.println("before adding an element");
		 for(String val : arrayList){
	         System.out.print(val + " ");
	         
		 }
		 arrayList.add("Pune");
		 arrayList.add("Ap");
		 arrayList.add("TN");
		 arrayList.add("KA");
		 
		 System.out.println();
		 System.out.println("after adding an element");
		 
		 Iterator<String> iter = arrayList.iterator();
	    while (iter.hasNext()) {
	       System.out.println(iter.next());
	    }
	    
		 int maxsize=4;
		 System.out.println("execution of for loop");
		 
		 for(int j=0;j<arrayList.size();j++) {
			 System.out.println(j);
			  String str = arrayList.get(j);
			  System.out.println(str);
				if(str.length()>=maxsize) {
					String str1 = str.substring(0, maxsize);
					System.out.println(str1);
					arrayList.set(j, str1);	
					
				}
				else if(str.length()<maxsize) {
					String str1=StringUtils.rightPad(str, maxsize," ");
					System.out.println(str1);
					str1=arrayList.set(j,str1);			
				}
		 }
	}
}
			

		 
	



	
	
//	 arrayList.add("Pune");
	
//to fetch particular data in a list
//String str = arrayList.get(2); 
//System.out.println();
//System.out.println(str);
//	 Integer maxSize = 4;	
//	 if(str.length() >= maxSize ) {
//String str1 = str.substring(0, 4);
//System.out.println(str1);
//		}else 
//
//if (s.length()< maxSize ) {
//	int val=str.length()-maxSize;
//	
//	
//	str=StringUtils.rightPad(str, 10," ");
//	System.out.println(str);
////}
////int b=s.length();
////System.out.println(b);
//	
//	 System.out.println("Iterator");
//    Iterator<String> iter = arrayList.iterator();
//    while (iter.hasNext()) {
//       System.out.println(iter.next());
//    }
//	
//}
 

