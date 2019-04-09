package com.boundedtype;
//Bounded type parameters can be used with methods as well as classes and interfaces.

//Java Generics supports multiple bounds also, i.e . In this case A can be an interface or class. 
//If A is class then B and C should be interfaces. 
//We can’t have more than one class in multiple bounds.

class Bound1<T extends D & E> 
{ 
	
	private T objRef; 
	
	public Bound1(T obj){ 
		this.objRef = obj; 
	} 
	
	public void doRunTest(){ 
		this.objRef.displayClass(); 
	} 
} 

interface E 
{ 
	public void displayClass(); 
} 

class D implements E 
{ 
	public void displayClass() 
	{ 
		System.out.println("Inside super class D"); 
	} 
} 

public class MultipleBound 
{ 
	public static void main(String a[]) 
	{ 
		//Creating object of sub class A and 
		//passing it to Bound as a type parameter. 
		Bound1<D> bea = new Bound1<D>(new D()); 
		bea.doRunTest(); 
		
	} 
} 
