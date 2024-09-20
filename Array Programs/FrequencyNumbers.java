package com.jsp.logics;

public class FrequencyOfNumbers {

    public static void main(String[] args) {
        int n = 1223445612;
        int num=2;
        int count = 0; 
        while(n>0) {
        int rem=n%10;
        if(rem==num) {
        	count++;
        }
        n=n/10;
        }
        System.out.println(num  + " occurs at " +count + " Times");
    }
    
}
