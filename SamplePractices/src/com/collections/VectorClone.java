package com.collections;

//Java code illustrating clone() 
import java.util.*; 
class VectorClone { 
	public static void main(String[] arg) 
	{ 

		// create default vector 
		Vector v = new Vector(); 

		//Vector v_clone = new Vector(); 

		v.add(0, 1); 
		v.add(1, 2); 
		v.add(2, "geeks"); 
		v.add(3, "forGeeks"); 
		v.add(4, 3); 

		Vector v_clone = (Vector)v.clone(); 

		// checking vector 
		System.out.println("Clone of v: " + v_clone); 
	} 
}
