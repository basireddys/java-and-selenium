package com.collections;


//Java Program Demonstrate removeIf() 
//method of ArrayList 

import java.util.*; 
public class RemoveIfDemo { 

	public static void main(String[] args) 
	{ 

		// create an ArrayList which going to 
		// contains a list of Numbers 
		ArrayList<Integer> Numbers = new ArrayList<Integer>(); 

		// Add Number to list 
		Numbers.add(23); 
		Numbers.add(32); 
		Numbers.add(45); 
		Numbers.add(63); 

		// apply removeIf() method 
		// we are going toremove numbers divisible by 3 
		Numbers.removeIf(n -> (n % 3 == 0)); 

		// print list 
		for (int i : Numbers) { 
			System.out.println(i); 
		} 
	} 
} 
