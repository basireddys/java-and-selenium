package com.collections;

//Java code for Linked List implementation 

import java.util.*; 

public class LikedListDemo 
{ 
	public static void main(String args[]) 
	{ 
		// Creating object of class linked list 
		LinkedList<String> object = new LinkedList<String>(); 

		// Adding elements to the linked list 
//		object.add("A"); 
//		object.addFirst("B"); 
//		object.addLast("C"); 
//		object.add("D"); 
//		object.add("D"); 
//		object.addLast("san");
		object.addFirst("F"); 
		
		object.offer("cat");
		object.offerFirst("cow");
		object.offerLast("cattish");
		object.add(2, "E");
		object.add(3, "G"); 
		
		System.out.println("Linked list : " + object); 
		
		System.out.println(object.element());
		System.out.println(object.peek());
		System.out.println(object.peekFirst());
		object.push("A");
		// Removing elements from the linked list 
		object.remove("B"); 
		object.remove(3); 
		object.removeFirst(); 
		object.removeLast(); 
		System.out.println("Linked list after deletion: " + object); 
		System.out.println(object.element()); //Prints the first element.
		
		Iterator<String> i = object.descendingIterator(); //To display LinkedList in reverse order.
		System.out.println("Reverse Order of the list:" );
		while(i.hasNext())
			{
			System.out.println(i.next());
			}
		
		// Finding elements in the linked list 
		boolean status = object.contains("E"); 

		if(status) 
			System.out.println("List contains the element 'E' "); 
		else
			System.out.println("List doesn't contain the element 'E'"); 

		// Number of elements in the linked list 
		int size = object.size(); 
		System.out.println("Size of linked list = " + size); 

		// Get and set elements from linked list 
		Object element = object.get(2); 
		System.out.println("Element returned by get() : " + element); 
		object.set(2, "Y"); 
		System.out.println("Linked list after change : " + object); 
	} 
} 
