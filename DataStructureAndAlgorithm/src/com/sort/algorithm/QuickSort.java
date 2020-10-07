package com.sort.algorithm;

public class QuickSort implements Sort {

	@Override
	public void sort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}

	public static void quicksort(int array[], int low, int high) {
		if (low < high) {
			int j = partion(array, low, high);
			quicksort(array, low, j - 1);
			quicksort(array, j + 1, high);
		}
	}

	public static int partion(int temparray[], int low, int high) {
		int pivot = temparray[low];
		int start = low;
		int end = high;
		while (start < end) {
			while (start < end && temparray[start] <= pivot) {
				start++;
			}
			while (temparray[end] > pivot) {
				end--;
			}
			if (start <= end) {
				swap(temparray[start], temparray[end]);
			}
		}
		temparray[low] = temparray[end];
		temparray[end] = pivot;
		return end;
	}

	private static void swap(int value, int swap) {
		int temp = value;
		value = swap;
		swap = temp;
	}

	@Override
	public void sort(String[] array) {
		quicksort(array, 0, array.length - 1);
	}

	public static void quicksort(String array[], int low, int high) {
		if (low < high) {
			int j = partion(array, low, high);
			quicksort(array, low, j - 1);
			quicksort(array, j + 1, high);
		}
	}

	public static int partion(String temparray[], int low, int high) {
		String pivot = temparray[low];
		int start = low;
		int end = high;
		while (start <end) {
			while ( start <end &&(temparray[start].compareTo(pivot)<=0)) {
				start++;
			}
			while (temparray[end].compareTo(pivot) >0) {
				end--;
			}
			if (start < end) {
				String temp=temparray[start];
				temparray[start]=temparray[end];
				temparray[end]=temp;
			}
		}
		temparray[low] = temparray[end];
		temparray[end] = pivot;
		return end;
	}

}
