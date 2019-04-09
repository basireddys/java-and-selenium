/**
 * 
 */
package com.initial.state;

/**
 * @author Basireddyz
 *
 */
public class FirstProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		
	        System.out.println("Hello World"); 
	        Integer i = new Integer(4);
	        System.out.println(i);
	        // the new Integer object is reachable  via the reference in 'i' 
	        i = null;
	        System.out.print(i);
	     	i = 5;
	     	System.out.print(i);
	}

}
