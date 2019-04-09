package com.arraylist;


//Java Program Demonstrate spliterator() 
//method of ArrayList 

import java.util.*; 

public class ArrayListSpliterator { 
	public static void main(String[] args) 
	{ 

		// create an ArrayList which contains 
		// user details from user class 
		ArrayList<user> list = new ArrayList<user>(); 

		// Add emails to list 
		list.add(new user("Aman", 24)); 
		list.add(new user("Suraj", 23)); 
		list.add(new user("Amar", 24)); 
		list.add(new user("Kajal", 22)); 

		// create Spliterator of ArrayList 
		// using spliterator() method 
		Spliterator<user> users = list.spliterator(); 

		// print result from Spliterator 
		System.out.println("Spliterator splitting username and age \n"); 

		// forEachRemaining method of Spliterator 
		//users.forEachRemaining((n) -> print(n)); 
		users.tryAdvance((n) -> System.out.println(n)); 
	} 

	public static void print(user u) 
	{ 
		System.out.println("User name : " + u.name 
						+ " and user age: " + u.age); 
	} 
} 

//create a user class 
class user { 

	String name; 
	int age; 

	user(String name, int age) 
	{ 
		this.name = name; 
		this.age = age; 
	} 
} 
