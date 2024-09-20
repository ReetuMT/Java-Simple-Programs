package com.jsp.logics;

public class AscendingOrderArray {

	public static void main(String[] args) {
		int [] arr= new int[] {1,8,4,7,3};
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted in Ascending Order");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
