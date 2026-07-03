package com.java.basics.collectionframework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		DateFormat d1=DateFormat.getInstance();
		System.out.println(d1.format(date));
		SimpleDateFormat simple=new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(simple.format(date));
		
		
		

	}

}
