package com.clone;

//A Java program to demonstrate deep copy 
//using clone() 

//An object reference of this class is 
//contained by Test2 
class Test3 
{ 
	int x, y; 
} 


//Contains a reference of Test and implements 
//clone with deep copy. 
class Test4 implements Cloneable 
{ 
	int a, b; 

	Test3 c = new Test3(); 

	public Object clone() throws
				CloneNotSupportedException 
	{ 
		// Assign the shallow copy to new reference variable t 
		Test4 t = (Test4)super.clone(); 
		
		// Create a new object for the field c 
		// and assign it to shallow copy obtained, 
		// to make it a deep copy 

		t.c = new Test3(); 
		System.out.println(t.c);
		System.out.println(t);
		return t; 
	} 
} 

public class DeepCopy
{ 
	public static void main(String args[]) throws
							CloneNotSupportedException 
	{ 
	Test4 t1 = new Test4(); 
	t1.a = 1000; 
	t1.b = 20; 
	t1.c.x = 30; 
	t1.c.y = 40; 
//	int a;
//	System.out.println(a);
	System.out.println(t1);
	
	Test4 t3 = (Test4)t1.clone(); 
	t3.a = 100; 
	System.out.println(t3);
	// Change in primitive type of t2 will not 
	// be reflected in t1 field 
	//t3.c.x = 300; 

	// Change in object type field of t2 will not 
	// be reflected in t1(deep copy) 
	System.out.println(t1.a + " " + t1.b + " " + 
						t1.c.x + " " + t1.c.y); 
	System.out.println(t3.a + " " + t3.b + " " + 
						t3.c.x + " " + t3.c.y); 
	} 
} 
