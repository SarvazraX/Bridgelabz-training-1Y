package com.gla.arrays;

import java.util.Scanner;

public class SecondLargestLargest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int MaxIndex = 10;
        long[] arr = new long[MaxIndex];
		long n = sc.nextLong();
		int i = 0;
		while(n>0) {
			arr[i++] = n % 10;
			n /= 10;
			if(i == 10) {
				MaxIndex += 10;
				long[] temp = new long[MaxIndex];
				for(int k = 0;k < i;k++) {
					temp[k] = arr[k];
				}
				arr = temp;
			}
		}
		long largest = 0;
		long secondlargest = 0;
		for(int j = 0;j < MaxIndex;j++) {
			if(largest < arr[j]) {
				secondlargest = largest;
				largest = arr[j];
			} else if(secondlargest <  arr[j] && arr[j] != largest) {
				secondlargest = arr[j];
			}
		}
		System.out.println("Largest element : " + largest);
		System.out.println("Second Largest element : " + secondlargest);
    }
}