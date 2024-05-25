package com.sandeep.coding;

public class LeetFirstOccurraceOfStringE {
	
	public static void main(String[] args) {
		
		String haystack = "sadbutsad";
		String needle = "sad";
		
		if ( haystack.contains(needle)) {
			System.out.println("Needle present in the string");
		}
		
		System.out.println(haystack.indexOf(needle));
	}
	
}
