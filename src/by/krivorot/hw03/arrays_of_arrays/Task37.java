package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task37 {
	/* Переставить строки матрицы случайным образом. */

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];

		init(mas, 50);
		printMas(mas);

		changeLines(mas);
		printMas(mas);
	}

	public static void init(int[][] mas, int limit) {
		int i;
		int j;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(limit);
			}
		}
	}
	
	public static void changeLines(int[][] mas) {
		int[] tmp;
		
		tmp = mas[0];
		Random rand = new Random();
		
	}
	
	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
