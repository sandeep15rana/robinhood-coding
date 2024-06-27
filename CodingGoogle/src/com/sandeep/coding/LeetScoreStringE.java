class LeetScoreStringE{

	public static void main(String[] args){
		String str = "zaz";
		// zaz hello
		int target=0;
		// how to get ASCII value
		
		// absolute difference between adjacent digit 
		for ( int i=0; i< str.length()-1; i++){
			int diff;
			diff = (int) str.charAt(i) - (int) str.charAt(i+1);
			target+= Math.abs(diff);
			// System.out.println(target);
			
		}
		
		// return score of string
		System.out.println(target);	
	}
}
