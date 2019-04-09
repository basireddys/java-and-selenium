package com.blankfinalandfinal;

//A sample Java program to demonstrate use and 
//working of blank final 
class Test 
{ 
	// We can initialize here, but if we 
	// initialize here, then all objects get 
	// the same value. So we use blank final 
	final int i; 

	Test(int x) 
	{ 
		// Since we have initialized above, we 
		// must initialize i in constructor. 
		// If we remove this line, we get compiler 
		// error. 
		i = x; //Blank final variables are used to create immutable objects (objects whose members can’t be changed once initialized).
	} 
} 

//Driver Code 
class BlankFinal 
{ 
	public static void main(String args[]) 
	{ 
		Test t1 = new Test(10); 
		System.out.println(t1.i); 

		Test t2 = new Test(20); 
		System.out.println(t2.i); 
	} 
} 
