package com.sandeep.coding;

public class LeetRemoveElementE {
	
	public int removeElement(int[] nums, int val) {
		
        // return the number of elements in nums which are not equal to val.
        // 1. which datastructure 2. logic  { How to remove element }
        // int[] updatedElement = new int[nums.length];
        // int counter=0;
		
        int k=0;

        for( int i = 0; i< nums.length; i++){
            if ( nums[i] != val ){
                nums[k]= nums[i];
                // counter+=1;
                k+=1;
            }
        }

       // System.out.println(counter);
        return k;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeetRemoveElementE obj = new LeetRemoveElementE();
		
	    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
	    int val = 2;
	    
	    System.out.println(obj.removeElement(nums, val));
	    
	}

	
}
