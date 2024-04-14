package com.sandeep.practise;

import java.util.Arrays;

public class AnagramString {

	public static String isAnagram(String a, String b) {

		// To lowercase 

		a= a.toLowerCase();
		b= b.toLowerCase();

		// To convert String into Arrary and sort them 
		
		char[] charArrayA = a.toCharArray();
		Arrays.sort(charArrayA);
		
		char[] charArrayB = b.toCharArray();
		Arrays.sort(charArrayB);
		
		// Compare both the strings 
		
		if (Arrays.equals(charArrayA, charArrayB)) {
			return "Anagram";
		}else {
			return "Not an Anagram";
		}

//		if ( a.compareTo(b)) {
//			return true;
//			
//		}else {
//			return false;
//		}
//		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="Race";
		String b ="Care";

		System.out.println("Given strings are " + isAnagram(a, b));
	}

}
