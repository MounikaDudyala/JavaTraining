package com.imaginea.javaTraining.interfaces;

import java.util.Random;
/*
 * finding first row values divisible by 3
 * and
 * second row values divisible by 6
 */
public class Exercise {
	public static void main(String args[]) {
		int[][] array = new int[2][6];
		Random random = new Random();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = random.nextInt(100);
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(array[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println();
	
		for (int j = 0; j < 6; j++) {
			if (array[0][j] % 3 == 0)
				array[0][j] = 1;
			else
				array[0][j] = 0;
			System.out.print(array[0][j] + "\t");
		}
		System.out.println();
		for (int j = 0; j < 6; j++) {
			if (array[1][j] % 6 == 0)
				array[1][j] = 1;
			else
				array[1][j] = 0;
			System.out.print(array[1][j] + "\t");

		}
	}
}
