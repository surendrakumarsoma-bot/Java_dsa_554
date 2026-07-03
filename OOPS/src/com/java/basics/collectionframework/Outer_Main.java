package com.java.basics.collectionframework;

import com.java.basics.collectionframework.OuterClass.InnerClass;

public class Outer_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass o1=new OuterClass();
		o1.display();
		InnerClass i1=new OuterClass().new InnerClass();
		OuterClass.InnerClass ic1=o1.new InnerClass();
		i1.showValues();
		

	}

}
