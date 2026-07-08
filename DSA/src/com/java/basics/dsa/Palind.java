package com.java.basics.dsa;

public class Palind {
	public static void checkPalind(String s)
	{
		int left=0;
		int right=s.length()-1;
		if(s.charAt(left)!=s.charAt(right))
		{
			System.out.println("not palindrome");
			return;
		}
		left++;
		right--;
		System.out.println("Palindrome");
	}

	public static void main(String[] args) {
		String s="levels";
		checkPalind(s);
		

	}

}
