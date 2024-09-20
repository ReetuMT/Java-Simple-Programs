package com.jsp.logics;

public class RotateLeftArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int n=3;
		for(int i=0;i<n;i++) {
			int first=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1]= first;
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

}
