package com.runtimeclass;
import java.io.File;

//Java program to illustrate addShutdownHook() 
	// method of Runtime class 
public class ShutdownHook {
	
	  // a class that extends thread that is to be called when program is exiting 
	    static class Message extends Thread 
	    { 
	        public void run() 
	        { 
	            System.out.println("Program exiting"); 
	        } 
	    } 
	    
	    static class Message2 extends Thread 
	    { 
	        public void run() 
	        { 
	            System.out.println("Program exiting2"); 
	        } 
	    }
	    public static void main(String[] args) 
	    { 
	        try
	        { 
	            // register Message as shutdown hook 
	            Message m = new Message(); 
	            Runtime.getRuntime().addShutdownHook(m);
	            Runtime.getRuntime().addShutdownHook(new Message2());
	            System.out.println(Runtime.getRuntime().availableProcessors());
	            // cause thread to sleep for 3 seconds 
	            System.out.println("Waiting for 5 seconds..."); 
	            Thread.sleep(500); 
	           // Runtime.getRuntime().exit(0);
	           // Runtime.getRuntime().removeShutdownHook(m);
	           // create a file with the working directory we wish 
				File f = new File("C:\\Users\\shivakumar\\Desktop"); 
				
				// create a process and execute itunes and current environment 
				Process process = Runtime.getRuntime().exec("C:\\Program Files\\iTunes\\iTunes.exe",null, f); 
				System.out.println("Itunes  opening."); 
	        } 
	        catch (Exception e) 
	        { 
	            e.printStackTrace(); 
	        } 
	    } 
} 
