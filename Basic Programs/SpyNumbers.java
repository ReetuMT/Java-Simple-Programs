package com.jsp.logics;

public class SpyNumbers {
	public static void spy(int n) {
		int sum=0,mul=1;
		while(n>0) {
			int rem = n%10;
			mul=rem*mul;
			sum=sum+rem;
			n=n/10;
		}
		if(sum==mul) {
			System.out.println("Spy number");
		}
		else {
			System.out.println("Not a Spy number");
		}
	}

	public static void main(String[] args) {
		spy(1234);

	}

}
