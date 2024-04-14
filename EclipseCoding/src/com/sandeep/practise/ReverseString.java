package com.sandeep.practise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "reverse";
		
		String newstr = "";
		
		for (int i = 0; i < str.length(); i++) {
			newstr = str.charAt(i) + newstr;
			// System.out.println(i);
		}
		System.out.println("Reversed string output: "+newstr);
	}

}
