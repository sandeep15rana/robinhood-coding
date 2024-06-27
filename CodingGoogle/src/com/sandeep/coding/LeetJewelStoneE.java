package com.sandeep.coding;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.toMap;
import static java.util.Map.Entry.comparingByValue;

class LeetJewelStoneE{
	public static void main(String[] arg){
	
		// System.out.println("Hello World");
		
// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Example 1:

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3
		
		String str = "aAcde";
		String stones = "aAcccceeeAbbbbddd";
		int  count =0;
		
		// To find count of each char in jewels
		
		// https://www.javatpoint.com/java-program-to-count-occurrences-of-each-character
		
		// Lets use HashMap method to find the occurrence
		
		HashMap<Character, Integer> charCount = new HashMap<>();

		// To convert String into stream of character
		
		List<Character> obj = stones.chars()
				.mapToObj(item -> (char) item)
				.collect(Collectors.toList());

//		System.out.println("Splitted string into char List: "+obj);
//
		// To get count of char in a String and their occurrence 

		stones.chars()
				.mapToObj(item -> (char) item)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 0)
				.forEach(entry -> System.out.println("Character: " + entry.getKey()+ ", count: " + entry.getValue()));
		
		// To get Map of string and their occurrence
		
		Map<Character, Long> obj1 = stones.chars()
				.mapToObj(item -> (char) item)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(obj1);
		
		// sum each count of a char

		for( char ch : str.toCharArray()) {
        // System.out.println(obj1.get(ch));
			// count  += obj1.get(ch);
			
			// Use getOrDefault to avoid NullPointerException
			count += obj1.getOrDefault(ch, 0L); 
		}
		
		// return the result 

		System.out.println(count);
		
		// Sort Map by value
		
		Map<Character, Long> sortedMap = 
				obj1.entrySet()
					.stream()
					.sorted(comparingByValue())
					.collect(toMap(Map.Entry::getKey, 
		                    Map.Entry::getValue, (e1,e2) -> e2 , LinkedHashMap::new));
		System.out.println(sortedMap);

		// use different approach to Iterator
		
		
	}
}
