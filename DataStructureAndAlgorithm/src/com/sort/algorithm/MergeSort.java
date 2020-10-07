package com.sort.algorithm;

public class MergeSort implements Sort {

	@Override
	public void sort(int[] array) {
		int start = 0;
		int end = array.length;
		int temp[] = new int[end];
		merge(array, temp, start, end - 1);
	}

	public static void merge(int array[], int temp[], int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			merge(array, temp, start, middle);
			merge(array, temp, middle + 1, end);
			merging(array, temp, start, end);

		}
	}

	public static void merging(int[] array, int temp[], int leftStart, int rightEnd) {
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		int leftIndex = leftStart;
		int rightIndex = rightStart;
		int index = leftStart;
		while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
			if (array[leftIndex] <= array[rightIndex]) {
				temp[index] = array[leftIndex];
				leftIndex++;
			} else {
				temp[index] = array[rightIndex];
				rightIndex++;
			}
			index++;
		}
		System.arraycopy(array, leftIndex, temp, index, leftEnd - leftIndex + 1);
		System.arraycopy(array, rightIndex, temp, index, rightEnd - rightIndex + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);

	}

	@Override
	public void sort(String[] array) {
		int start = 0;
		int end = array.length;
		String temp[] = new String[end];
		merge(array, temp, start, end - 1);
	}

	public static void merge(String array[], String temp[], int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			merge(array, temp, start, middle);
			merge(array, temp, middle + 1, end);
			merging(array, temp, start, end);
		}

	}

	public static void merging(String[] array, String temp[], int leftStart, int rightEnd) {
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		int leftIndex = leftStart;
		int rightIndex = rightStart;
		int index = leftStart;
		while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
			if (array[leftIndex].compareTo(array[rightIndex]) <= 0) {
				temp[index] = array[leftIndex];
				leftIndex++;
			} else {
				temp[index] = array[rightIndex];
				rightIndex++;
			}
			index++;
		}
		System.arraycopy(array, leftIndex, temp, index, leftEnd - leftIndex + 1);
		System.arraycopy(array, rightIndex, temp, index, rightEnd - rightIndex + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);

	}

}
