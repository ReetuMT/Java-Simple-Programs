package com.jsp.logics;

public class SumOfPrime {
	public static void prime(int n) {
		
		int sum=0;
		for(int i=2;i<=n;i++) {
			int count =0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		prime(30);

	}

}
