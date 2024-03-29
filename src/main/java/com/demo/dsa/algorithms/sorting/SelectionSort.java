package com.demo.dsa.algorithms.sorting;

public class SelectionSort {

	void selectionSort(int[] integers) {
		int n = integers.length;

		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (integers[minIndex] > integers[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = integers[i];
				integers[i] = integers[minIndex];
				integers[minIndex] = temp;
			}
		}
	}

	void display(int[] integers) {
		for (int i : integers) {
			System.out.println(i);
		}
	}
}
