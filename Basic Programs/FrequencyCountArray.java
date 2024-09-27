package com.jsp.logics;

public class FrequencyArray {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,2,3};
		int [] fr=new int[arr.length];
		int enter=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					fr[j]=enter;
				}
			}
			if(fr[i]!=enter) {
				fr[i]=count;
			}
	
		}
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=enter) {
				System.out.println(arr[i] +  " occurs at " + fr[i] + " times");
			}
		}
	}

}
