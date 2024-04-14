package com.sandeep.practise;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a = [10,5,2,25,56,19,50];
		int[] a = {10,5,2,25,56,19,50};
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max= a[i];
			}		
		}
		System.out.println("Largest Element in an Array: " + max);
	}
}

