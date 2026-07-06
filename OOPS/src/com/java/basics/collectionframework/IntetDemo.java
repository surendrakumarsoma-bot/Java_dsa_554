package com.java.basics.collectionframework;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress inet = null;
		try {
			inet = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(inet);
	
		System.out.println(inet.getHostAddress());
		System.out.println(inet.getHostName());
		System.out.println(inet.getAddress());

	}

}
