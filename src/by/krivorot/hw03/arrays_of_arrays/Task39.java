package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task39 {
	/* Найдите произведение двух матриц. */

	public static void main(String[] args) {
		int[][] mas1 = new int[6][7];
		int[][] mas2 = new int[7][3];

		init(mas1, 20);
		init(mas2, 20);

		printMas(mas1);
		printMas(mas2);
		printMas(multiplyMas(mas1, mas2));
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

	public static int[][] multiplyMas(int[][] mas1, int[][] mas2) {
		int i;
		int j;
		int k;
		int tmp;
		int[][] multiplyMas = new int[mas1.length][mas2[0].length];

		for (i = 0; i < multiplyMas.length; i++) {
			for (j = 0; j < multiplyMas[i].length; j++) {
				tmp = 0;
				for (k = 0; k < mas1[0].length; k++) {
					tmp = tmp + (mas1[i][k] * mas2[k][j]);
				}
				multiplyMas[i][j] = tmp;
			}
		}
		return multiplyMas;
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%8d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
