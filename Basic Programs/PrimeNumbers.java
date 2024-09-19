package com.jsp.logics;

public class PrimeNumbers {
	public static boolean prime(int n) {
		int flag=0;
		if(n==0 || n==1) {
			return true;
		}
		
		for(int i=2;i<=n;i++) {
			if(n%i == 0) {
				return false;
			}
			if(flag==0) {
				return true;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(prime(17));
	}

}
