package com.collections;

//Java code illustrating copyInto() method 
import java.util.*; 
class CopyIntoArray { 
	public static void main(String[] arg) 
	{ 
		Vector vec = new Vector(7); 

		// use add() method to add elements in the vector 
		vec.add(1); 
		vec.add(2); 
		vec.add(3); 
		vec.add(4); 
		vec.add(5); 
		vec.add(6); 
		vec.add(7); 

		Integer[] arr = new Integer[7]; 

		// copy componnent of vector int array arr 
		vec.copyInto(arr); 

		System.out.println("elements in array arr: "); 
		for (Integer num : arr) { 
			System.out.println(num); 
		} 
	} 
} 
