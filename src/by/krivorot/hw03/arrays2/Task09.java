package by.krivorot.hw03.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task09 {
	/*
	 * Алгоритм фон Неймана. Упорядочить массив a1, a2, ..., an по неубыванию с
	 * помощью алгоритма сортировки слияниями: 1) каждая пара соседних элементов
	 * сливается в одну группу из двух элементов (последняя группа может состоять из
	 * одного элемента); 2) каждая пара соседних двухэлементных групп сливается в
	 * одну четырехэлементную группу и т. д. При каждом слиянии новая укрупненная
	 * группа упорядочивается.
	 */

	public static void main(String[] args) {
		int[] mas = new int[50];

		init(mas, 99);
		printMas(mas);
		sortMerge(mas);
		printMas(mas);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	private static void sortMerge(int[] mas) {
		int len = mas.length;
		int n = 1; // кратность сравнений (сравнивать по 1-му элем., 2-м ...)
		int shift; // сдвиг в перебираемом массиве
		int two_size; // количество элементов для 2-го массива
		int[] mas2;
		
		while (n < len) {
			shift = 0;
			while (shift < len) {
				if (shift + n >= len)
					break;
				two_size = (shift + n * 2 > len) ? (len - (shift + n)) : n;
				mas2 = merge(Arrays.copyOfRange(mas, shift, shift + n),
						Arrays.copyOfRange(mas, shift + n, shift + n + two_size));
				for (int i = 0; i < n + two_size; ++i)
					mas[shift + i] = mas2[i]; // замена на отсортированное
				shift += n * 2;
			}
			n *= 2;
		}
	}

	private static int[] merge(int[] mas_1, int[] mas_2) {
		int len_1 = mas_1.length, len_2 = mas_2.length;
		int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
		int[] result = new int[len];
		
		for (int i = 0; i < len; i++) {
			if (b < len_2 && a < len_1) {
				if (mas_1[a] > mas_2[b])
					result[i] = mas_2[b++];
				else
					result[i] = mas_1[a++];
			} else if (b < len_2) {
				result[i] = mas_2[b++];
			} else {
				result[i] = mas_1[a++];
			}
		}
		return result;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
	}
}