package com.jsp.logics;

public class PowerOfn {

	public static void powerofn(int power,int value) {
		int res=1;
		for(int i=1;i<=power;i++) {
			res=res*value;
		}
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		powerofn(4,2);
	}

}
