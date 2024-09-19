package com.jsp.logics;

public class NthPrime {
	public static void prime(int n) {
		int res=0;
		int prime=0;
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
//				res=i;
				System.out.println(i + " ");
				res=i;
				prime++;
			}
			if(prime==n) {
				break;
			}
		}
		System.out.println("nth Prime number is  " + res);
	}

	public static void main(String[] args) {
		prime(20);

	}

}
