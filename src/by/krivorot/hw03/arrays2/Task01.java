package by.krivorot.hw03.arrays2;

import java.util.Random;

public class Task01 {
	/*
	 * Заданы два одномерных массива с различным количеством элементов и натуральное
	 * число k. Объединить их в один массив, включив второй массив между k-м и (k+1)
	 * - м элементами первого, при этом не используя дополнительный массив.
	 */

	public static void main(String[] args) {
		int k = 5;
		int[] mas = new int[10];
		int[] mas2 = new int[15];
		int[] mas3;

		init(mas, 100);
		init(mas2, 100);
		mas3 = createNewMas(mas, mas2, k);
		printMas(mas);
		printMas(mas2);
		printMas(mas3);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit) + 1;
		}
	}

	public static int[] createNewMas(int[] mas, int[] mas2, int k) {
		int i;
		int j;
		int l;
		int[] mas3 = new int[mas.length + mas2.length];

		for (i = 0; i <= k; i++) {
			mas3[i] = mas[i];
		}
		for (j = 0; j < mas2.length; j++) {
			mas3[i] = mas2[j];
			i++;
		}
		for (l = k + 1; l < mas.length; l++) {
			mas3[i] = mas[l];
			i++;
		}

		return mas3;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

}
