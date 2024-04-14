package com.sandeep.practise;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {
	
//	public static int[] removeDuplicate(int[] a) {
//		int[] b = null;		
//		return b ;
//	}

	public static ArrayList<Integer> removeDuplicate( int[] a) {
		ArrayList<Integer> finalist = new ArrayList<Integer>();
		
		for (int num : a) {
			if (!finalist.contains(a)){
				finalist.add(num);
			}
		}
		return finalist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,5,2,25,56,19,50};
//		int[] result = removeDuplicate(a);
		
		System.out.println("Filtered Array result: "+ removeDuplicate(a));
	}
}
