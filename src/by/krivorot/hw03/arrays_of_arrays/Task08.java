package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task08 {
	/*
	 * Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
	 * число 7 среди элементов массива.
	 */

	public static void main(String[] args) {
		int[][] mas = new int[8][7];

		init(mas, 20);
		printMas(mas);
		print(countNumberOfSeven(mas));
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

	public static int countNumberOfSeven(int[][] mas) {
		int i;
		int j;
		int number = 0;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					number++;
				}
			}
		}
		return number;
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void print(int value) {
		System.out.println(value);
	}
}
