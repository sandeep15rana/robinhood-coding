package com.sandeep.coding;

public class TestCode {

	
	protected int protectedField=10;

    // Step 1: Declare a protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
    
    int defaultField;
     
    // Default (package-private) constructor
    TestCode() {
        defaultField = 0;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Hello World");
		
//		Access Modifier testing 
		

	    
		Abc obj1 = Abc.getInstance();
		Abc obj2 = Abc.getInstance();
		
		if ( obj1 == obj2) {
			System.out.println("Only one instance of a class is created");
		}else {
			System.out.println("Multiple instance of a class is created");
		}
	}

}

class Abc{
	
//	1. Static object creation | static variable to hold the signle instance
//	2. Don't allow user to create instance with default constructor 
//	3. static method creation which should return instance of a class
	
	private static Abc instance;
	
	private Abc() {
		
	}
	
	public static Abc getInstance() {
		return instance;
	}

}


