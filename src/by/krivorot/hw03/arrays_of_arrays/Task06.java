package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task06 {
	/*
	 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
	 * больше последнего.
	 */
	public static void main(String[] args) {
		int[][] mas = new int[8][7];

		init(mas, 20);
		printMas(mas);
		printOddColumns(mas);
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

	public static void printOddColumns(int[][] mas) {
		int i;
		int j;

		System.out.println();
		for (i = 0; i < mas.length; i++) {
			for (j = 1; j < mas[i].length; j = j + 2) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
					System.out.printf("%3d", mas[i][j]);
				}
			}
			System.out.println();
		}

	}
}
