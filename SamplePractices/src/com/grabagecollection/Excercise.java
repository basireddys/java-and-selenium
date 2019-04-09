package com.grabagecollection;

public class Excercise {
	
	String obj; 
	
	public Excercise(String obj1) {
		this.obj = obj1;
	}
	public static void main(String [] args) throws InterruptedException
	{ 
		Excercise t1 = new Excercise("t1"); 
		Excercise t2 = m1(t1); 
		Excercise t3 = new Excercise("t3"); 
		t2 = t3; 
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		System.gc();
	
		
	} 

	static Excercise m1(Excercise temp) 
	{ 
	temp = new Excercise("t2"); 
	return temp; 
	} 

	@Override
	 protected void finalize() 
    { 
		System.out.println(this.hashCode());
        System.out.println("Successfully garbage collected:" + this.obj); 
    } 
} 

