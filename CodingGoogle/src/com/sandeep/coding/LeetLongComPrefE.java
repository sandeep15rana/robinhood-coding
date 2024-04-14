package com.sandeep.coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetLongComPrefE {
	
	//Input: strs = ["flower","flow","flight"] --> fl
//	Input: strs = ["dog","racecar","car"] --> ''
	
    public String longestCommonPrefix(String[] strs) {
    	
    	if(strs==null || strs.length ==0) {
    		return "";
    	}
    	
    	//Start with first string as potential prefix
    	String prefix = strs[0];
    	
    	//Iterate through remaining string 
    	
    	for (int i = 1; i < strs.length; i++) {
			//while current string doesn't start with prefix
    		while (!strs[i].startsWith(prefix)) {
				// shorten the prefix by one character 
    			prefix = prefix.substring(0, prefix.length()-1);
    			
    			// If prefix become empty there is no common prefix 
    			if (prefix.isEmpty()) {
					return "";
				}
			}
		}

//  	System.out.println("Duplicate substring :"+substring); // It will show duplicate elements
//    	
//    	// To remove duplicate element
//    	HashSet<String> set = new HashSet<String>(substring);
//    	
//    	System.out.println("Unique element : "+set);
//    	
        return prefix;
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs= {"flower","flow","flight"};
//		String[] strs= {"dog","racecar","car"};

		
		LeetLongComPrefE obj = new LeetLongComPrefE();
		System.out.println("Longest Common Prefix: " + obj.longestCommonPrefix(strs));

	}

}
