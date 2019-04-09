package com.runtimeclass;

// Java program to illustrate Process exec() 
// method of Runtime class 

public class CallWebBrowser {


	    public static void main(String[] args) 
	    { 
	        try
	        { 
	            // create a process and execute google-chrome 
	            Process process = Runtime.getRuntime().exec("chrome"); 
	            System.out.println("Google Chrome successfully started on Windows Operatin System"); 
	        } 
	        catch (Exception e) 
	        { 
	            e.printStackTrace(); 
	        } 
	    } 
} 