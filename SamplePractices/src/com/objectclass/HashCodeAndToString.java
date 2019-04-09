package com.objectclass;
// Java program to demonstrate working of 
// hasCode() and toString() 

public class HashCodeAndToString {

		static int last_roll = 100; 
		int roll_no; 

		// Constructor 
		HashCodeAndToString() 
		{ 
			roll_no = last_roll; 
			last_roll++; 
		} 

		// Overriding hashCode() 
		@Override
		public int hashCode() 
		{ 
			return roll_no; //Hexadecimal for 100 is 64
		} 

		// Driver code 
		public static void main(String args[]) 
		{ 
			HashCodeAndToString s = new HashCodeAndToString(); 

			// Below two statements are equivalent 
			System.out.println(s); 
			System.out.println(s.toString()); 
		}  

}
