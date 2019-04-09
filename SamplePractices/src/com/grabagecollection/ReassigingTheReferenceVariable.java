package com.grabagecollection;

public class ReassigingTheReferenceVariable {
	/* Java program to demonstrate gc 
	 when one object referred to other object */
	  
	    // to store object name 
	    String obj_name; 
	      
	    public ReassigingTheReferenceVariable(String obj_name)  
	    { 
	        this.obj_name = obj_name; 
	    } 
	      
	    // Driver method 
	    public static void main(String args[]) 
	    { 
	    	ReassigingTheReferenceVariable t1 = new ReassigingTheReferenceVariable("t1"); 
	    	ReassigingTheReferenceVariable t2 = new ReassigingTheReferenceVariable("t2"); 
	        System.out.println(t1.hashCode());
	        //t1 now referred to t2 
	        t1 = t2; 
	          
	        // calling garbage collector 
	        System.gc(); 
	        System.out.println(t1.hashCode());
			System.out.println(t2.hashCode());
		
	    } 
	      
	    @Override
	    /* Overriding finalize method to check which object 
	     is garbage collected */
	    protected void finalize() throws Throwable  
	    { 
	        // will print name of object 
	    
			System.out.println(this.hashCode());
	        System.out.println(this.obj_name + " successfully garbage collected"); 
	    } 
	} 
