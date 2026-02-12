package com.prac;

public class Calculator {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String reverseString(String data) {
		String rev="";
		
		for(int i=data.length()-1;i>=0;i--) {
			rev=rev+data.charAt(i);
		}
		return rev;
	}
	public static int factorial(int x) {
		int r = 1;
		for(int i=2;i<=x;i++) {
			r*=i;
		}
		return r;
	}
	
	public static boolean isPalindrom(String s) {
		String rev = "";
		for(int i=s.length();i>=0;i--) {
			rev+=s.charAt(i);
		}
		return s.equals(rev);
		
		
		
	}

}