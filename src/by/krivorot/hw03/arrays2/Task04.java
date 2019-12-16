package by.krivorot.hw03.arrays2;

import java.util.Random;

public class Task04 {
	/*
	 * Сортировка обменами. Дана последовательность чисел a1, a2, ..., an.Требуется
	 * переставить числа в порядке возрастания. Для этого сравниваются два соседних
	 * числа ai и ai+1 . Если ai  ai+1 , то делается перестановка. Так продолжается
	 * до тех пор, пока все элементы не станут расположены в порядке возрастания.
	 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
	 */

	public static void main(String[] args) {
		int q;
		int[] mas = new int[20];

		init(mas, 100);
		printMas(mas);
		q = sortMas(mas);
		printMas(mas);
		System.out.println("Количество перестановок " + q);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static int sortMas(int[] mas) {
		int i;
		int j;
		int tmp;
		int q = 0;

		for (i = mas.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {

				if (mas[j] > mas[j + 1]) {
					tmp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = tmp;
					q++;
				}
			}
		}
		return q;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

}
