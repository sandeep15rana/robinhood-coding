package com.sandeep.coding;


public class LeetMergeTwoSortedListE {
	
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
    	ListNode newList = new ListNode(-1);
    	ListNode recent = newList;
    	
//    	System.out.println(list1.val);
    	
    	while (list1 !=null && list2 !=null) {
			if (list1.val < list2.val) {
				recent.next = list1;
				list1 = list1.next;
			} else {
				recent.next = list2;
				list2 = list2.next;
			}
			recent = recent.next;
		}
    	
    	// Attach the remaining nodes from l1 or l2, if any
        if (list1 != null) {
            recent.next = list1;
        } else {
            recent.next = list2;
        }
        
    	return newList.next;
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
		
		int[] arr1 = {1,2,4};
		int[] arr2 = {1,3,4};
		
		ListNode head1 = createLinkedList(arr1);
		ListNode head2 = createLinkedList(arr2);
		
		
		LeetMergeTwoSortedListE obj = new LeetMergeTwoSortedListE();
				
		ListNode curr = obj.mergeTwoLists(head1, head2);
		System.out.println(curr);
	

	}

}
