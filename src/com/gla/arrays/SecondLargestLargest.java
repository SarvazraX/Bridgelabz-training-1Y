package com.gla.arrays;

import java.util.Scanner;

public class SecondLargestLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long[] arr = new long[10];
		long n = sc.nextLong();
		int i = 0;
		while(n>0) {
			arr[i++] = n % 10;
			n /= 10;
			if(i == 10) break;
		}
		long largest = 0;
		long secondlargest = 0;
		for(int j = 0;j < 10;j++) {
			if(largest < arr[j]) {
				secondlargest = largest;
				largest = arr[j];
			}
		}
		System.out.println("Largest element : " + largest);
		System.out.println("Second Largest element : " + secondlargest);
    }
}