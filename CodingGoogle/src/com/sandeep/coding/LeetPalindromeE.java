package com.sandeep.coding;

import java.util.ArrayList;
import java.util.Iterator;

public class LeetPalindromeE {

	
    public boolean isPalindrome(int x) {
        
    	int originalNumber = x;
    	if (x ==0 ) {
//			throw new IllegalArgumentException("Invalid Argument");	
    		return true;
		}
    	
//    	System.out.println(x);
    	ArrayList<Integer> digits = new ArrayList<Integer>();
    	
//    	int rem = x % 10;
//    	result.add(rem);
//    	x= x/10;
//    	System.out.println(x);

    	while ( x > 0 ) {
    		int remainder= x % 10;
    		digits.add(remainder);
//        	System.out.println(result);
    	    x=x/10;
    	}
    	
    	int reverseNumber=0;
    	
    	for (Integer digit: digits) {
			reverseNumber = reverseNumber*10 + digit;
		}
    	
    	
    	// Below method involve extra overhead
    	
//    	// To convert it Int[] into number: []--> string --> number
//    	StringBuilder string = new StringBuilder();
//    	
//    	for (Integer num : result) {
//			string.append(num);
//		}
//    	
//    	int output = Integer.parseInt(string.toString());

    	if ( reverseNumber  == originalNumber) {
        	return true;

    	}else {
        	return false;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		
		LeetPalindromeE obj = new LeetPalindromeE();
		boolean result = obj.isPalindrome(num);
		
		if (num == 0) {
			System.out.println("Number is invalid"+ num);
		}else if (result == true) {
			System.out.println("Given number is palindrome number !!!");
		}else {
			System.out.println("Given number is not a palindrome number !!!");
		}

	}

}
