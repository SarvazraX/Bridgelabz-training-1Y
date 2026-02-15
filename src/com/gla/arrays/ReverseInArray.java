package com.gla.arrays;

import java.util.Scanner;

public class ReverseInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
		int n = sc.nextInt();
		int i = 0;
		while(n>0) {
			arr[i++] = n % 10;
			n /= 10;
		}
		for(int j = 0;j<i;j++) {
			System.out.print(arr[j]);
		}
    }
}