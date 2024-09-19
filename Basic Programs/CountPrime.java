package com.jsp.logics;

public class CountPrime {
    public static void prime(int n) {
        int count = 0; 
        
        for (int j = 2; j <= n; j++) {
            boolean isPrime = true; 
            for (int i = 2; i <= j-1; i++) {
                if (j % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
            if (isPrime) {
            	System.out.println(j);
                count++;
            }
        }
        
        System.out.println("Number of prime numbers up to " + n + ": " + count);
    }

    public static void main(String[] args) {
        prime(30); // Example input
    }
}
