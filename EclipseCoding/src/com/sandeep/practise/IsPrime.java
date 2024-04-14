package com.sandeep.practise;

public class IsPrime {

	public static Boolean isprime( int x) {
		
		if (x < 2) {
			return false;
		}
		
		int i =2;
		
		while ( i*i < x) {
			if (x % i==0) {
				return false;
			}
			i +=1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		
		Boolean result = isprime(a);
		
		if (result == false) {
			System.out.println("Given number is not a prime number !!");
		}
		else {
			System.out.println("Given number is a prime number !!");
		}
	}
}


