package com.sandeep.coding;

public class SubClass {
//	TestCode myClass = new TestCode();
	
	public void accessDefault() {
        // Access defaultField, defaultMethod from MyClass
		TestCode myClass = new TestCode();
		
        System.out.println("Default field value: " + myClass.defaultField);
//        myClass.defaultMethod();
    }
//    System.out.println("Default field value: " + myClass.defaultField);
    
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
//		System.out.println("Protected field value:"+ protectedField);
	}
}


//public class SubClass  extends TestCode{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
////		System.out.println("Protected field value:"+ protectedField);
//	}
//	
//	public void accessProtected() {
//        // Can access protectedField and protectedMethod from superclass
//        System.out.println("Protected field value: " + protectedField);
//        protectedMethod();
//    }
//	
//}

//
//public class Subclass extends TestCode {
//    public void accessProtected() {
//        // Can access protectedField and protectedMethod from superclass
//        System.out.println("Protected field value: " + protectedField);
//        protectedMethod();
//    }
//}