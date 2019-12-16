package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task02 {
	/*
	 * Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
	 * [0, 9].
	 */

	public static void main(String[] args) {
		int[][] mas = new int[2][3];

		init(mas);
		printMas(mas);
	}

	public static void init(int[][] mas) {
		int i;
		int j;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
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

}
