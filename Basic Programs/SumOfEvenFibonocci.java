package com.jsp.logics;

//WAJP Print the sum of Even fibonocci number
public class SumofEvenFibonocci {
	public static void fibo(int n) {
		int n1=0;
		int n2=1;
		int n3;
		int sum=0;
		System.out.println(n1 + " " + n2);
		for(int i=2;i<=n;i++) {
			n3=n1+n2;
			if(n3%2==0) {
				System.out.println(n3);
				sum=sum+n3;
			}
			
			n1=n2;
			n2=n3;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		fibo(10);

	}

}
