package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task07 {
	/*
	 * Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
	 * элементов.
	 */

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		init(mas, 100);
		printMas(mas);
		print(findSumOfModulsOfNegativeOddElements(mas));
	}

	public static void init(int[][] mas, int limit) {
		int i;
		int j;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(limit) - 50;
			}
		}
	}

	public static int findSumOfModulsOfNegativeOddElements(int[][] mas) {
		int i;
		int j;
		int sum = 0;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0 && mas[i][j] % 2 != 0) {
					sum = sum + Math.abs(mas[i][j]);
				}
			}
		}
		return sum;
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
	}

	public static void print(int value) {
		System.out.println(value);
	}
}
