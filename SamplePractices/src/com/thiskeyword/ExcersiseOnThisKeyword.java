package com.thiskeyword;

//Java code for using this() to 
//invoke current class constructor 
public class ExcersiseOnThisKeyword {
	int a; 
	int b; 
	
	//Default constructor 
	ExcersiseOnThisKeyword() 
	{ 
		this(10, 20); 
		System.out.println("Inside default constructor \n"); 
		System.out.println(a);
		System.out.println(b);
	} 
	
	//Parameterized constructor 
	ExcersiseOnThisKeyword(int a, int b) 
	{ 
		this.a = a; 
		this.b = b; 
		System.out.println("Inside parameterized constructor"+ a + b); 
	} 
	

	public static void main(String[] args) 
	{ 
		ExcersiseOnThisKeyword obj = new ExcersiseOnThisKeyword(); 
		
	} 
} 


