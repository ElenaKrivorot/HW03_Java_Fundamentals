package by.krivorot.hw03.arrays2;

import java.util.Random;

public class Task05 {
	/*
	 * Сортировка вставками. Дана последовательность чисел a1, a2, ..., an.
	 * Требуется переставить числа в порядке возрастания. Делается это следующим
	 * образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е. a1
	 * <= a2 <=...<= an . Берется следующее число ai+1 и вставляется в
	 * последовательность так, чтобы новая последовательность была тоже
	 * возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до
	 * n не будут перебраны. Примечание. Место помещения очередного элемента в
	 * отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
	 * оформить в виде отдельной функции.
	 */

	public static void main(String[] args) {
		int[] mas = new int[20];

		init(mas, 20);
		printMas(mas);
		sortMas(mas);
		printMas(mas);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static void sortMas(int[] mas) {
		int i;
		int j;
		int k;
		int tmp;

		for (i = 1; i < mas.length; i++) {
			tmp = mas[i];
			k = binSearch(mas, i);
			for (j = i; j > k; j--) {
				mas[j] = mas[j - 1];
			}
			mas[k] = tmp;

		}
	}

	public static int binSearch(int[] mas, int i) {
		int firstIndex = 0;
		int lastIndex = i - 1;
		int middleIndex;

		if (mas[i] >= mas[lastIndex]) {
			return i;
		} else {
			while (firstIndex < lastIndex) {
				middleIndex = (firstIndex + lastIndex) / 2;

				if (mas[middleIndex] > mas[i]) {
					lastIndex = middleIndex;
				} else {
					firstIndex = middleIndex + 1;
				}
			}
			return firstIndex;
		}
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}
}
