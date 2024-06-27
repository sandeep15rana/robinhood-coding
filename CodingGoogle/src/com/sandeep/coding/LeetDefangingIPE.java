class LeetDefangingIPE{

// A defanged IP address replaces every period "." with "[.]".

// Example 2:
// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"

	public static void main(String[] arg){
		
		String input = "255.100.50.0";
		
		StringBuilder str = new StringBuilder(input);
		System.out.println(input.replace(".","[.]"));
//		str.insert('.','[.]')
		
	}
}

