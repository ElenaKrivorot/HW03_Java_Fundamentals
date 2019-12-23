package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task40 {
	/*
	 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
	 * составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу,
	 * каждой строке и каждой из двух больших диагоналей равны между собой.
	 * Построить такой квадрат. Пример магического квадрата порядка 3: 6 1 8 7 5 3 2
	 * 9 4
	 */

	public static void main(String[] args) {
		int n = 4;
		int[][] mas = new int[n][n];

		initMagicSquare(mas);
		printMas(mas);
	}

	public static void initMagicSquare(int[][] square) {
		do {
			initSquare(square);
		} while (!isMagic(square));
	}

	public static void initSquare(int[][] square) {
		int i;
		int j;
		int tmp;

		startInitSquare(square);
		Random rand = new Random();

		for (i = 0; i < square.length; i++) {
			for (j = 0; j < square[i].length; j++) {
				do {
					tmp = rand.nextInt(square.length * square.length) + 1;
				} while (!isUnique(square, tmp));
				square[i][j] = tmp;
			}
		}
	}

	public static boolean isUnique(int[][] mas, int x) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == x) {
					return false;
				}
			}
		}
		return true;
	}

	public static void startInitSquare(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = -1;
			}
		}
	}

	public static boolean isMagic(int[][] mas) {
		int i;
		int j;
		int[] magicSum = new int[mas.length + mas[0].length + 2];

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				magicSum[i] = magicSum[i] + mas[i][j];
				magicSum[j + mas.length] = magicSum[j + mas.length] + mas[i][j];
				if (i == j) {
					magicSum[magicSum.length - 2] = magicSum[magicSum.length - 2] + mas[i][j];
				}
				if (i == mas.length - 1 - j) {
					magicSum[magicSum.length - 1] = magicSum[magicSum.length - 1] + mas[i][j];
				}
			}
		}
				
		for (i = 1; i < magicSum.length; i++) {
			if (magicSum[i] != magicSum[0]) {
				return false;
			}
		}
		return true;

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
