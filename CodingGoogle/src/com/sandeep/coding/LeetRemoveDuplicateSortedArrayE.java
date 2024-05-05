package com.sandeep.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeetRemoveDuplicateSortedArrayE {

    public int removeDuplicates(int[] nums) {
        
//        int result = 1;
//        int len = nums.length;
//        if(0 == len)    return 0;
//        int temp = nums[0];
//        for(int i = 1; i < len; i++){
//            int cur = nums[i];
//            if(temp != cur){
//                nums[result++] = cur;
//                temp = cur;
//            }
//        }
//        return result;
    	
    	
    	
    	
    	// Initial and final list should remain the same. After unique no we have to append with '_"
    	// And needs to return k no of unique number 
    	
    	// To remove duplicate element
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	for (int num : nums) {
			set.add(num);
		}
    	
    	System.out.println(set);
    	
//    	int[] uniqueArray = new int[set.size()];
    	int[] uniqueArray = new int[nums.length];
    	
    	int i = 0;
    	
    	for (int num : set) {
			uniqueArray[i++] = num;
		}
    	
    	String[] stringArray = new String[nums.length];
    	
    	for (int j = 0; j < stringArray.length; j++) {
			stringArray[j]= Integer.toString(uniqueArray[j]);
		}
    	
//    	System.out.println(stringArray);
    	
    	for (int k = set.size(); k < stringArray.length; k++) {
			stringArray[k]= "_";
		}
    	
    	System.out.println(Arrays.toString(stringArray));

        return set.size();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
				
		LeetRemoveDuplicateSortedArrayE obj = new LeetRemoveDuplicateSortedArrayE();
		
		System.out.println("Number of Unique element in the Array: " + obj.removeDuplicates(nums));
		
	}

}
