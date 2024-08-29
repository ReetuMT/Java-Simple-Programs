package com.jsp.logics;

public class RotateRight {

	public static void main(String[] args) {
		int [] arr= new int [] {1,2,3,4,5};
		int n=3;
		for(int i=0;i<n;i++) {
			int last=arr[arr.length -1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
				
			}
			arr[0]=last;
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
