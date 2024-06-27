package com.sandeep.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1222311";
		
		int counter=1;
//		int c = str.charAt(0);
		
//		HashSet<String> set = new HashSet<String>();
		ArrayList obj = new ArrayList();
		
		for( int i=0; i < str.length(); i++){
			
//			int counter=1;
//			String pattern = "";
			
		  if( i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
			
		    counter+=1;
		    
		  }else{
			  
//			 counter =1; 
			 System.out.println(counter);
		     String pattern = "(" + counter + ","+ str.charAt(i) + ")";
//		     set.add(pattern);
		     obj.add(pattern);
		     
		     counter =1;
		     
		  }
		  
		}
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i< obj.size(); i++) {
			
			result.append(obj.get(i));
			if(i < obj.size() -1) {
				result.append(", ");
			}
		}
		
		System.out.println(result);
		
//		set.add(list)
//		System.out.println(list);
		
	}

}
