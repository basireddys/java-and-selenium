package com.initial.state;

import java.text.DecimalFormat;

class ForLoop { 
    public static void main(String[] args) { 
//      for(int i = 0; 1; i++) 
//      { 
//          System.out.println("Hello"); 
//          //break; 
//      } 
    	
    	Double object = new Double("2.4");
        int a = object.intValue();
        byte b = object.byteValue();
        float d = object.floatValue();
        double c = object.doubleValue();
        double e = a + b + c + d;
//        DecimalFormat df = new DecimalFormat("#.###");
//        String dx=df.format(e);
//        double x = Double.valueOf(dx);
 
        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d +"    " + e);
    } 
} 
