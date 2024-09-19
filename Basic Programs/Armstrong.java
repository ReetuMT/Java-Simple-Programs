package com.jsp.logics;

public class ArmstrongNumber {
	public static boolean arms(int n) {
		int temp=n;
		int sum=0;
		int count=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0) {
			int rem=temp%10;
			sum+=Math.pow(rem, count);
			temp=temp/10;
		}
		return n==sum;
	}

	public static void main(String[] args) {
		System.out.println(arms(153));
		System.out.println(arms(193));

	}

}
