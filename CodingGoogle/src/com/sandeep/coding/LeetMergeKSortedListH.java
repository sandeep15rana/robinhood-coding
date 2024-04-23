package com.sandeep.coding;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class LeetMergeKSortedListH {
	
    public ListNode mergeKLists(ListNode[] lists) {
    	
        // Create a dummy node as the head of the result linked list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
//    	ListNode newList = new ListNode(-1);
    	
		PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);
		
		for (ListNode listNode : lists) {
			if (listNode!=null) {
				minHeap.offer(listNode);
			}
		}
		
    	while (!minHeap.isEmpty()) {
			ListNode head = minHeap.poll();
//			System.out.println("Head value: " +  head.val);
			
			tail.next = head;
			tail = tail.next;
			
			if (head.next != null) {
                minHeap.offer(head.next); // Add the next node of the extracted element to the priority queue
            }
		}
    	
    	return dummy.next;
 
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	        
        // Create an array of arrays of ListNode
        ListNode[] arrayOfLists = new ListNode[3];

        // Populate the arrays with ListNode objects
        arrayOfLists[0] = new ListNode(1);
        arrayOfLists[0].next = new ListNode(2);

        arrayOfLists[1] = new ListNode(3);
        arrayOfLists[1].next = new ListNode(4);
        arrayOfLists[1].next.next = new ListNode(5);

        arrayOfLists[2] = new ListNode(6);
        arrayOfLists[2].next = new ListNode(7);
        arrayOfLists[2].next.next = new ListNode(8);
        arrayOfLists[2].next.next.next = new ListNode(9);

        // Pass the array of arrays of ListNode to a method
        processArrayOfLists(arrayOfLists);
        
//        System.out.println(arrayOfLists);
        
        LeetMergeKSortedListH obj = new LeetMergeKSortedListH();
//        System.out.println("Merged K sorted Array" + obj.mergeKLists(arrayOfLists));
        
        ListNode mergedList = obj.mergeKLists(arrayOfLists);
        
        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }

	}

	// Method to process the array of arrays of ListNode
    public static void processArrayOfLists(ListNode[] arrayOfLists) {
        for (ListNode list : arrayOfLists) {
            while (list != null) {
//                System.out.print(list.val + " ");
                list = list.next;
            }
//            System.out.println();
        }
    }

}
