package com.jsp.logics;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=323;
		int rev=0;
		int temp=n;
		
		while(n>0) {
			int rem=n%10;
			rev=rem+( 10*rev);
			n=n/10;
		}
		
		if(temp==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
