package com.java.basics.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
	public void display()
	{
		System.out.print("This is  a  display method");
	}
	
    public static void main(String[] args) {
		List list=new ArrayList();
		list.add("RED");
		list.add("GREEN");
		list.forEach(l1->System.out.println(l1));
		
		
		

	}

}
