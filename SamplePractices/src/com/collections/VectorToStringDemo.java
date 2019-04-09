package com.collections;

//Java code illustrating toArray() method 
import java.util.*; 
class VectorToStringDemo { 
	public static void main(String[] arg) 
	{ 

		String elements[] = { "A", "N", "C", "P", "E" }; 
		for (int i = 0; i < elements.length; i++) { 
			System.out.println(elements[i]); 
		} 
		ArrayList <String> al = new ArrayList <String>(Arrays.asList(elements)); 
		System.out.println(al); 
		Set <Object> s = new HashSet <Object>(al);
		String[] strObj = new String[s.size()]; 

		strObj = (String[])s.toArray(strObj); 

		for (int i = 0; i < strObj.length; i++) { 
			System.out.println(strObj[i]); 
		} 
		System.out.println(s); 
	} 
} 
