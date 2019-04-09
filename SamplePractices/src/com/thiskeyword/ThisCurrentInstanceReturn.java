package com.thiskeyword;

//Java code for using 'this' keyword 
//to return the current class instance 
public class ThisCurrentInstanceReturn {
	
	static int a; 
	int b; 

	//Default constructor 
	ThisCurrentInstanceReturn() 
	{ 
		a = 10; 
		b = 20; 
	} 
	
	//Method that returns current class instance 
	ThisCurrentInstanceReturn get() 
	{ 
		System.out.println(a);
		System.out.println(b);
		return this; 
		
	} 
	
	//Displaying value of variables a and b 
	void display() 
	{ 
		System.out.println("a = " + a + " b = " + b); 
	} 

	public static void main(String[] args) 
	{ 
		System.out.println(a);
		//System.out.println(b);
		ThisCurrentInstanceReturn object = new ThisCurrentInstanceReturn(); 
		//object.get().display(); 
		object.display();
	} 
} 


