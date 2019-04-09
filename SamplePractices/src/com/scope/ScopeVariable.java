package com.scope;

public class ScopeVariable 
{ 
	static int x = 11; 
	int y = 33; 
	public void method1(int x) 
	{ 
		ScopeVariable t = new ScopeVariable(); 
		this.x = 22; 
		y = 44; 
		System.out.println("Test.x: " + ScopeVariable.x); 
		System.out.println("t.x: " + t.x); 
		System.out.println("t.y: " + t.y); 
		System.out.println("y: " + y); 
	} 

	public static void main(String args[]) 
	{ 
		ScopeVariable t = new ScopeVariable(); 
		t.method1(5); 
	
	} 
} 
