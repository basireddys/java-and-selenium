package com.generics;

//A Simple Java program to show working of user defined 
//Generic classes 

//We use < > to specify Parameter type 
class Test1<T> 
{ 
	// An object of type T is declared 
	T obj; 
	Test1(T obj) { this.obj = obj; } // constructor 
	public T getObject() { return this.obj; } 
} 

//Driver class to test above 
class SimpleGeneric 
{ 
	public static void main (String[] args) 
	{ 
		// instance of Integer type 
		Test1 <Integer> iObj = new Test1<Integer>(15); 
		System.out.println(iObj.getObject()); 

		// instance of String type 
		Test1 <String> sObj = 
						new Test1<String>("GeeksForGeeks"); 
		System.out.println(sObj.getObject()); 
	} 
}
