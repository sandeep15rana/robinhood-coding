package com.sandeep.coding;


public class LeetMergeTwoSortedListE {
	
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
    	ListNode newList;
    	
    	return list1;
    }
    
    public static ListNode createLinkedList(int[] arr) {
    	
    	ListNode head = new ListNode(arr[0]);
    	ListNode current =  head;
    	
    	for (int i = 1; i < arr.length; i++) {
			ListNode newNode = new ListNode(arr[i]);
			current.next = newNode;
			
			current = newNode;
		}
    	
    	return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		list1 = [1,2,4], list2 = [1,3,4]
		
		int[] arr1 = {1,2,4};
		int[] arr2 = {1,3,4};
		
		ListNode head1 = createLinkedList(arr1);
		ListNode head2 = createLinkedList(arr2);
		
		
		LeetMergeTwoSortedListE obj = new LeetMergeTwoSortedListE();
		
//		System.out.println("Merged sorted Liste: " + obj.mergeTwoLists(head1, head2));
		
		ListNode curr = obj.mergeTwoLists(head1, head2);
		while(curr != null) {
			System.out.println(curr.val + " ");
			curr = curr.next;
		}
	

	}

}
