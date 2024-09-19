package com.jsp.logics;

public class NthFibonocci {
	public static void fibo(int n) {
		int n1=0;
		int n2=1;
		int n3 = 0;
		for(int i=2;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(n3);
		
	}
	public static void main(String[] args) {
		fibo(10);

	}

}
