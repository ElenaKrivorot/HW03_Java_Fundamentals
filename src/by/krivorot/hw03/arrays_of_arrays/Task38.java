package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task38 {
	/* Найдите сумму двух матриц */

	public static void main(String[] args) {
		int[][] mas1 = new int[6][7];
		int[][] mas2 = new int[6][7];

		init(mas1, 50);
		init(mas2, 50);

		printMas(mas1);
		printMas(mas2);
		printMas(sumMas(mas1, mas2));

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

	public static int[][] sumMas(int[][] mas1, int[][] mas2) {
		int i;
		int j;
		int[][] sumMas = new int[mas1.length][mas1[0].length];

		for (i = 0; i < sumMas.length; i++) {
			for (j = 0; j < sumMas[i].length; j++) {
				sumMas[i][j] = mas1[i][j] + mas2[i][j];
			}
		}
		return sumMas;
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
