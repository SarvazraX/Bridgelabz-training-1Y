package com.gla.arrays;

import java.util.Scanner;

public class YoungestTallest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][2];

        for (int i = 0; i < 3; i++) {
			if(i == 0) System.out.println("Amar's Details: ");
			if(i == 1) System.out.println("Akbar's Details: ");
			if(i == 2) System.out.println("Anthony's Details: ");
			
            for(int j = 0;j < 2;j++) {
				if(j == 0) {
					System.out.print("Age: ");
					a[i][j] = sc.nextInt();
				}
				
				if(j == 1) {
					System.out.print("Height: ");
					a[i][j] = sc.nextInt();
				}
			}
        }
		int tallest = 0;
		int youngest = 0;
		
		for (int i = 0; i < 3; i++) {
			
			if(a[tallest][1] < a[i][1]) {
				tallest = i;
			}
			if(a[youngest][0] > a[i][0]) {
				youngest = i;
			}
        }
		
		if(tallest == 0)	System.out.println("Amar is tallest");
		if(tallest == 1)	System.out.println("Akbar is tallest");
		if(tallest == 2)	System.out.println("Anthony is tallest");
		if(youngest == 0)	System.out.println("Amar is youngest");
		if(youngest == 1)	System.out.println("Akbar is youngest");
		if(youngest == 2)	System.out.println("Anthony is youngest");
		
    }
}