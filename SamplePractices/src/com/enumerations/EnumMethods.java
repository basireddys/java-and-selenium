package com.enumerations;

//Java program to demonstrate working of values(), 
//ordinal() and valueOf() 
/*Enum declaration can be done outside a Class or inside a Class but not inside a Method.
 * internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
 }
 Every enum constant represents an object of type enum.
enum type can be passed as an argument to switch statement.
 * Every enum constant is always implicitly public static final. Since it is static, we can access it by using enum Name. Since it is final, we can’t create child enums.
We can declare main() method inside enum. Hence we can invoke enum directly from the Command Prompt.

Enum and Inheritance :

All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, so an enum cannot extend anything else.
toString() method is overridden in java.lang.Enum class,which returns enum constant name.
enum can implement many interfaces.
enum and constructor :

enum can contain constructor and it is executed separately for each enum constant at the time of enum class loading.
We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.
enum and methods :

enum can contain concrete methods only i.e. no any abstract method.
 */
enum Color 
{ 
	RED, GREEN, BLUE; 
} 
public class EnumMethods 
{ 
	public static void main(String[] args) 
	{ 
		// Calling values() 
		Color arr[] = Color.values(); 

		// enum with loop 
		for (Color col : arr) 
		{ 
			// Calling ordinal() to find index 
			// of color. 
			System.out.println(col + " at index "
					+ col.ordinal() + " " + col.toString()); 
		} 

		// Using valueOf(). Returns an object of 
		// Color with given constant. 
		// Uncommenting second line causes exception 
		// IllegalArgumentException 
		System.out.println(Color.valueOf("RED")); 
		// System.out.println(Color.valueOf("WHITE")); 
	} 
	} 
