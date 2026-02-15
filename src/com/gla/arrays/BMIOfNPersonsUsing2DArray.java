package com.gla.arrays;

import java.util.Scanner;

public class BMIOfNPersonsUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of person: ");
		int n = sc.nextInt();
        double[][] personData = new double[n][3];
		String[] weightStatus = new String[n];
		for(int i = 0;i < n;i++) {
			System.out.print("Enter Details of person " + (i+1) + " : ");
			for(int j = 0;j < 2;j++) {
				if(j == 0) {
					System.out.println("Height(m): ");
					personData[i][j] = sc.nextDouble();
				}
				if(j == 1) {
					System.out.println("Weight(Kg): ");
					personData[i][j] = sc.nextDouble();
				}
			}
			personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
		}
		for(int i = 0;i < n;i++) {
			if(personData[i][2] <= 18.4) weightStatus[i] = "Underweight";
			else if(personData[i][2] >= 18.5 && personData[i][2] <= 24.9) weightStatus[i] = "Normal";
			else if(personData[i][2] >= 25.0 && personData[i][2] <= 39.9) weightStatus[i] = "Overweight";
			else if(personData[i][2] >= 40.0) weightStatus[i] = "Obese";
		}
		for(int i = 0;i < n;i++) {
			System.out.println("BMI of person " + i+1 + " : " + personData[i][2]);
			System.out.println("Height(m): " + personData[i][0]);
			System.out.println("Weight(Kg): " + personData[i][1]);
			System.out.println("Status of person " + (i+1) + " : " + weightStatus[i]);
		}
    }
}