package com.staticclause;

class Test { 
	static int i; 
	int j; 
	
	// start of static block 
	static { 
		i = 10; 
		System.out.println("Static1 block called "); 
	} 
	// end of static block 
	static void pain() { 
		i = 10; 
		System.out.println("Static2 block called "); 
	} 
} 

class StaticTest { 
	public static void main(String args[]) { 

		// Although we don't have an object of Test, static block is 
		// called because i is being accessed in following statement. 
		//Test a = new Test();
		System.out.println("In Static Test"); 
		Test.pain();
		Test.pain();
	} 
} 
