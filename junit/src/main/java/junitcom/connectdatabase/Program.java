package junitcom.connectdatabase;

public class Program {
	public boolean isPalindrom(String str) {
		String rev = "";
		
		StringBuilder s = new StringBuilder();
		return(s.reverse().toString().equals(str))?true:false;
		
		
	}
	
	public int add(int a, int b) {
		return a+b;
	}
}
