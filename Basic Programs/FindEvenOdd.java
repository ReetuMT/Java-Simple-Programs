package com.jsp.logics;

public class SameEvenNumbers {
	public static void evens(int n) {
		int even=0;
		int odd=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
			n=n/10;
		}
		System.out.println(even + " " +odd);
	}
	

	public static void main(String[] args) {
		evens(123456789);

	}

}
