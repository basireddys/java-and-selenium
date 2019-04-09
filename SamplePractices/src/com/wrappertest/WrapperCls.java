package com.wrappertest;


//Java program to demonstrate that prmitive 
//wrapper classes are immutable 
class WrapperCls 
{ 
	public static void main(String[] args) 
	{ 
		Integer i = new Integer(12); 
		System.out.println(i); //12
		modify(i); 
		System.out.println(i++); //12
	} 

	private static int modify(Integer i) 
	{ 
		i = i + 1; 
        return i;
	} 
} 
