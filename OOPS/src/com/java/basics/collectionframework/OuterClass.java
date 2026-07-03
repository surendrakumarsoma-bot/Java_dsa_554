package com.java.basics.collectionframework;

public class OuterClass {
          private int a,b;
          OuterClass()
          {
        	  a=100;
        	  b=200;
        	  System.out.println("Statement from Outer class Constructor");
          }
          void display()
          {
        	  System.out.println("The value of a is"+a);
        	  System.out.println("The value of b is"+b);
        	  
          }
          class InnerClass
          {
        	 private int x,y;
        	 InnerClass()
        	 {
        		 x=10;
        		 y=30;
        		 System.out.println("Statement from Inner Class");
        	 }
        	 void showValues()
        	 {
        		 System.out.println("The value of x is"+x);
        		 System.out.println("The value of y is"+y);
        	 }
          }
}
