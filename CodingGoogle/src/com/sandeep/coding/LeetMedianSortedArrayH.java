package com.sandeep.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LeetMedianSortedArrayH {

//  Given two sorted arrays nums1 and nums2 of size m and n respectively, 
//	return the median of the two sorted arrays.
//	nums1 = [1,2], nums2 = [3,4] --> Merge --> Sort --> logic
    
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the arrays and sort
        int[] mergedArray = mergeSortedArrays(nums1, nums2);
        
        // Calculate the median based on the merged and sorted array
        return calculateMedian(mergedArray);
	}
    
	private int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }

    private double calculateMedian(int[] sortedArray) {
        int length = sortedArray.length;
        if (length % 2 == 0) {
            int mid = length / 2;
            return (sortedArray[mid - 1] + sortedArray[mid]) / 2.0;
        } else {
            return sortedArray[length / 2];
        }
    }
//		double median =1.2333;
////		System.out.println();
//
//		ArrayList<Integer> digit = new ArrayList<Integer>()	;
//		
//		// To merge both the Array
//		
//		for (int i = 0; i < nums2.length; i++) {
//			digit.add(nums2[i]);
//		}
//		
//		for (int j = 0; j < nums1.length; j++) {
//			digit.add(nums1[j]);
//		}
//		
//		// To sort the ArrayList
//		
//		Collections.sort(digit);
//		System.out.println(digit);
//		
//		
//		// To find out median of an ArrayList logic 
//		
//		if ( digit.size() %2 == 0) {
//			int sum =0;
//			for (int k = 1; k < digit.size()-1; k++) {
//				sum += digit.get(k);
//			}
//			median= sum/2;
//			
//			return median;
//		} else {
//			int mid = digit.size()/2;
//			median= digit.get(mid-1);
//			return median;
//		}
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {1,2};
		int[] arr2= {3,4};

//		int[] arr1= {1,3};
//		int[] arr2= {2};

		//[1,3], nums2 = [2]

		LeetMedianSortedArrayH obj = new LeetMedianSortedArrayH();
		
		System.out.println("Median of a sorted Array: "+ obj.findMedianSortedArrays(arr1,arr2));
		
	}

}
