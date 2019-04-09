package com.initial.state;
//A Java program to demonstrate working of a Class type 
//object created by JVM to represent .class file in 
//memory. 
import java.lang.reflect.Field; 
import java.lang.reflect.Method; 

//Java code to demonstrate use of Class object 
//created by JVM 
public class ClassNameMethodAndFieldsOfClassFile
{ 
 public static void main(String[] args) 
 { 
     Student s1 = new Student(); 
     FirstProgram s2 = new FirstProgram();

     // Getting hold of Class object created 
     // by JVM. 
     Class c1 = s1.getClass(); 
     Class c2 = s2.getClass();
    

     // Printing type of object using c1. 
     System.out.println(c1.getName()); 
     System.out.println(c2.getName()); 
     
     // getting all methods in an array 
     Method m1[] = c1.getDeclaredMethods(); 
     for (Method method : m1) 
         System.out.println(method.getName()); 

     Method m2[] = c2.getDeclaredMethods(); 
     for (Method method : m2) 
         System.out.println(method.getName()); 
     
     // getting all fields in an array 
     Field f1[] = c1.getDeclaredFields(); 
     for (Field field : f1) 
         System.out.println(field.getName()); 
     
     Field f2[] = c2.getDeclaredFields(); 
     for (Field field : f2) 
         System.out.println(field.getName()); 
 } 
} 

