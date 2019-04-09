package com.staticclause;

class Test1 { 
	// Initializer block starts.. 
	 	{ 
	        // This code is executed before every constructor. 
	        System.out.println("Common part of constructors invoked1 !!"); 
	       // The order of initialization constructors and initializer block doesn’t matter, initializer block is always executed before constructor.
	    } 
	 // Initializer block ends 
	static int i = 10; 
	int j;
	static { // Static blocks executes first, then initializers and constructor calls.
		
		System.out.println("static block called " + i); 
	} 
	Test1(){ 
		System.out.println("Constructor called"); 
	} 
	{ 
        // This code is executed before every constructor. 
        System.out.println("Common part of constructors invoked2 !!"); 
       // The order of initialization constructors and initializer block doesn’t matter, initializer block is always executed before constructor.
    } 
} 

class StaticTestForOnceCall { 
	public static void main(String args[]) { 

	// Although we have two objects, static block is executed only once. 
	Test1 t1 = new Test1(); 
	Test1 t2 = new Test1(); 
	} 
} 
