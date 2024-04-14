package com.sandeep.coding;

import java.util.Stack;

public class LeetValidParenE {

    public boolean isValid(String s) {
    	
    	if (s.length()%2!=0) {
			return false;
		}
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	for (char c : s.toCharArray()) {
			if (c =='(' || c =='[' || c =='{') {
				stack.push(c);
			}else if (c==')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}else if (c=='}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}else if (c==']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else {
				return false;
			}
    	}
			
    	return stack.isEmpty();
    }
			
			
//			else {
//				if (stack.isEmpty()) {
//					return false;
//				}
//				
//				char top = stack.pop();
//				if ((c=='(' && top!='(' ) || (c =='[' && top!=']') || (c=='{' && top!='}'))  {
//					return false;
//				}
//
//			}
//		}
    	
////    	System.out.println(s.charAt(1));
    	
//    	if (s.length()<=2) {
////    		System.out.println("in if condition");
//        	if (s.charAt(0) == ')' || s.charAt(0)==']' || s.charAt(0)=='}') {
//    			return false;
//    		}
//        	if (s.charAt(0) == '(') {
//    			if (s.charAt(1)==')') {
//					return true;
//				}
//			} if(s.charAt(0)=='[') {
//				if (s.charAt(1)==']') {
//					return true;
//				}
//				
//			}else {
//				if (s.charAt(1)=='}') {
//					return true;
//				}
//			}
//        	
//		}else {
//			
//	    	Stack<Character> stack = new Stack<Character>();
//	    	
//	    	for (char c : s.toCharArray()) {
//				if (c =='(' || c =='[' || c =='{') {
//					stack.push(c);
//				} else {
//					if (stack.isEmpty()) {
//						return false;
//					}
//					
//					char top = stack.pop();
//					if ((c=='(' && top!='(' ) || (c =='[' && top!=']') || (c=='{' && top!='}'))  {
//						return false;
//					}
//
//				}
//			}
    	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input= "()[]{}";
//		String input="()";
		
		LeetValidParenE obj = new LeetValidParenE()	;
		
		if (obj.isValid(input)) {
			System.out.println(" Valid Parenthesis !!");
		} else {
			System.out.println("Not a Valid Parenthesis !!");
		}
//		System.out.println("String have" + " " + obj.isValid(input) + " parenthesis" );
		
	}

}
