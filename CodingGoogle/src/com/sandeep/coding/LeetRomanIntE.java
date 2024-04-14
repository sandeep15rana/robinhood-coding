package com.sandeep.coding;

import java.util.HashMap;
import java.util.Map;

public class LeetRomanIntE {
	
//	Symbol       Value
//	I             1
//	V             5
//	X             10
//	L             50
//	C             100
//	D             500
//	M             1000

    public int romanToInt(String s) {
    	
    	// To create HashMap for Key value pair
    	
    	Map<Character, Integer> dictionary = new HashMap()	;
	    	dictionary.put('I', 1);
	    	dictionary.put('V', 5);
	    	dictionary.put('X', 10);
	    	dictionary.put('L', 50);
	    	dictionary.put('C', 100);
	    	dictionary.put('D', 500);
	    	dictionary.put('M', 1000);
    	
//    	System.out.println(s);
//    	System.out.println(dictionary);
    	
//	    	There are six instances where subtraction is used:
//
//	    		I can be placed before V (5) and X (10) to make 4 and 9. 
//	    		X can be placed before L (50) and C (100) to make 40 and 90. 
//	    		C can be placed before D (500) and M (1000) to make 400 and 900.

        int result =0;
//        
//        for (char ch : s.toCharArray()) {
//        	if (dictionary.containsKey(ch)) {
//                // Retrieve the value associated with the character and add it to result
//                result += dictionary.get(ch);
////            	System.out.println("Invalid Character:"+ ch. );
//                
//            }else {
//            	System.out.println("Invalid Character:"+ch );
//            }
//		}
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Check if dictionary contains the current character
            if (dictionary.containsKey(ch)) {
                // Retrieve the value associated with the character
                int currentValue = dictionary.get(ch);
                // Check for special cases where subtraction is used
                if (i < s.length() - 1) {
                    char nextCh = s.charAt(i + 1);
                    if ((ch == 'I' && (nextCh == 'V' || nextCh == 'X')) ||
                        (ch == 'X' && (nextCh == 'L' || nextCh == 'C')) ||
                        (ch == 'C' && (nextCh == 'D' || nextCh == 'M'))) {
                        result += (dictionary.get(nextCh) - currentValue);
                        i++; // Skip the next character
                        continue;
                    }
                }
                result += currentValue;
            } else {
                System.out.println("Invalid Character: " + ch);
            }
        }

    	return  result;
    }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	   String roman = "MCMXCIV";
	   LeetRomanIntE obj = new LeetRomanIntE();
	   System.out.println("Roman to Integer Conversion : " + obj.romanToInt(roman));
	   
	}

}
