package com.sandeep.coding;

public class LeetRegExpH {

    public boolean isMatch(String s, String p) {
    	
    	//#1: both pattern & string are empty 
    	if ( p.isEmpty()) {
    		return s.isEmpty()	;
    	}
    	
    	//#2: check current char matches the pattern 
    	
//    	boolean firstMatch = !s.isEmpty()&& s.charAt(0)== p.charAt(0) || p.charAt(0)=='.';
    	
    	//#3: Handle when next char is "*"
    	
//    	System.out.println(s.substring(0));
    	
    	
//    	matching with support for '.' and '*' where:
//
//    		'.' Matches any single character.​​​​
//    		'*' Matches zero or more of the preceding element.
//    	

    	if (s.length() >= p.length()) {
      for (int i = 0; i < s.length(); i++) {
    	  
		  if (p.charAt(i) == '.' || p.charAt(i)== s.charAt(i)) {
			  if (p.charAt(i+1)=='*' ){
				  
				  return true;	  
			  }else {
					break;
			  }
//				return false;    
		  } else {
			  break;
		}
	 } // for loop closed
  } // if statement closed

    	
    	return false;

    }// method body closed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetRegExpH obj = new LeetRegExpH()	;

		String s = "aa";
		String p = "a";
		if (obj.isMatch(s, p)) {
			System.out.println("Given string matches the pattern");
		} else {
			System.out.println("Given string doesn't matches the pattern");
		}
	}

}
