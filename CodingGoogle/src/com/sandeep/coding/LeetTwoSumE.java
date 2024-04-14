package com.sandeep.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LeetTwoSumE {
    
	// TODO Auto-generated method stub
	public int[]  twoSum( int [] nums, int x ){
		
		// input validation
		
//#1 The throws keyword, on the other hand, is used in the method signature to declare that the method 
// may throw certain types of exceptions, but it does not handle them internally.
// using throws in the method signature would not be appropriate because it doesn't handle the exceptional condition of invalid input;
		
//#2 try-catch blocks are used to handle exceptions that occur within a specific block of code.
//	 In this scenario, using a try-catch block would not be suitable because the exception is not being caught and handled within the method.
		
		if(nums == null || nums.length <2) {
			throw new IllegalArgumentException("input array must be atlease two elements");
		}
		
//		System.out.println(nums); // it prints memory address of an array 
		
//		int[] result = {}; // later want to add elements to this array dynamically, you'll need to use one of the methods mentioned earlier for appending elements to an array in Java since arrays have a fixed size once they're initialized.
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
//				System.out.println(nums[i]);
//				System.out.println(nums[j]);
				if (nums[i]+ nums[j] ==x) {
					result.add(i);
					result.add(j);
				}
			}
		}
		
		// Convert ArrayList to int[] --> This code is very costly as involves stream overhead
		
//		int[] intArray = result.stream().mapToInt(Integer::intValue).toArray();
		
		int[] intArray = new int[(result.size())];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = result.get(i);
		}

		return intArray;
		
	}
	
	public static void main(String[] args) {
		int nums[] = {3,2,4};
		int x= 6;

		LeetTwoSumE obj = new LeetTwoSumE(); 
		int [] result= obj.twoSum(nums, x);
		
        
//		int[] result is an array object, and you can pass it as an argument to println()
//      System.out.println( result); --> Output : [I@e9e54c2
		
//      the println() method of the PrintStream class expects either a String or an Object as an argument.
//      to print the elements of an array without explicitly iterating over it, you can use the Arrays.toString() method from the java.util package. Here's how you can do it:
//      System.out.println("Array elements: " + Arrays.toString(result));
         
		
		// Output handling 

		if (result.length ==0 ) {
			System.out.println("No indices found that sum upto :"+x);
		}else {
			
			// Manual construction of string representation of an Array

			String outArray = "[" + result[0];
			for (int i = 1; i < result.length; i++) {
				outArray += ","+ result[i];
			}
	        
			outArray += "]";
			System.out.println("Array index matched the sum: "+ outArray);
		}	
        
	}	
}


