package com.grabagecollection;

public class ReferencingObjectInFinalize {
	
	static ReferencingObjectInFinalize t ; 
	
	static int count =0; 
	
	public static void main(String[] args) throws InterruptedException 
	{ 
		ReferencingObjectInFinalize t1 = new ReferencingObjectInFinalize(); 
			
		// making t1 eligible for garbage collection 
		t1 = null; // line 12 
			
		// calling garbage collector 
		System.gc(); // line 15 
			
		// waiting for gc to complete 
		Thread.sleep(1000); 
	
		// making t eligible for garbage collection, 
		t = null; // line 21 
			
		// calling garbage collector 
		System.gc(); // line 24 
	
		// waiting for gc to complete 
		Thread.sleep(1000); 
		
		String str = new String("GeeksForGeeks"); 
        
        // making str eligible for gc 
        str = null;  
              
        // calling garbage collector 
        System.gc(); // finalize will not be called as the object is not Test class and is String class. 
        //Therefore, finalize() method of String class(if overridden in String class) is called on str. 
        //If a class doesn’t override finalize method, then by default Object class finalize() method is called.
			
		System.out.println("finalize method called "+count+" times"); 
		
	}
	
	@Override
	protected void finalize() 
	{ 
		count++; 
		System.out.println("Here in finalize");
		System.out.println(10/0); //Exceptions in finalize are ignored and program continues normally
		t = this; // line 38 
			
	} 
	
} 



