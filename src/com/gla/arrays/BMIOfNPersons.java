package com.gla.arrays;

import java.util.Scanner;
public class BMIOfNPersons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of person: ");
		int n = sc.nextInt();
        double[][] arr = new double[n][2];
		double[] bmi = new double[n];
		for(int i = 0;i < n;i++) {
			System.out.print("Enter Details of person " + (i+1) + " : ");
			for(int j = 0;j < 2;j++) {
				if(j == 0) {
					System.out.println("Height(m): ");
					arr[i][j] = sc.nextDouble();
				}
				if(j == 1) {
					System.out.println("Weight(Kg): ");
					arr[i][j] = sc.nextDouble();
				}
			}
		}
		int k = 0;
		String[] status = new String[n];
		for(int i = 0;i < n;i++) {
			bmi[i] = arr[i][1] / (arr[i][0] * arr[i][0]);
			if(bmi[i] <= 18.4) status[k++] = "Underweight";
			else if(bmi[i] >= 18.5 && bmi[i] <= 24.9) status[k++] = "Normal";
			else if(bmi[i] >= 25.0 && bmi[i] <= 39.9) status[k++] = "Overweight";
			else if(bmi[i] >= 40.0) status[k++] = "Obese";
		}
		for(int i = 0;i < n;i++) {
			System.out.println("BMI of person " + i+1 + " : " + bmi[i]);
			for(int j = 0;j < 2;j++) {
				System.out.println("Height(m): " + arr[i][j]);
				System.out.println("Weight(Kg): " + arr[i][j]);
			}
			System.out.println("Status of person " + i+1 + " : " + status[i]);
		}
    }
}