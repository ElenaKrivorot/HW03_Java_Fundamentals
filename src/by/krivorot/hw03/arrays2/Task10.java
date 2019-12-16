package by.krivorot.hw03.arrays2;

import java.util.Random;

public class Task10 {
	/*
	 * Сортировка подсчетом. Выходной массив заполняется значениями -1. Затем для
	 * каждого элемента определяется его место в выходном массиве путем подсчета
	 * количества элементов строго меньших данного. Естественно, что все одинаковые
	 * элементы попадают на одну позицию, за которой следует ряд значений -1. После
	 * этого оставшиеся в выходном массиве позиции со значением -1 заполняются
	 * копией предыдущего значения.
	 */

	public static void main(String[] args) {
		int[] mas = new int[20];
		int[] mas2 = new int[mas.length];

		init(mas, 10);
		initMas2(mas2);
		printMas(mas);
		sort(mas, mas2);
		printMas(mas2);

	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static void initMas2(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			mas[i] = -1;
		}
	}

	private static void sort(int[] mas, int[] mas2) {
		int i;
		int j;
		int c;
		int k;

		for (i = 0; i < mas.length; i++) {
			c = 0;
			for (j = 0; j < mas.length; j++) {
				if (mas[j] < mas[i]) {
					c++;
				}
			}
			mas2[c] = mas[i];
		}
		for (k = 0; k < mas2.length; k++) {
			if (mas2[k] == -1) {
				mas2[k] = mas2[k-1];
			}
		}

	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
	}

}
