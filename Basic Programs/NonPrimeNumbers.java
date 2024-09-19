package com.jsp.logics;

public class NonPrimeNumber {
	public static void nonprime(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			boolean prime=true;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
			if(prime == false) {
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		nonprime(30);
	}

}
