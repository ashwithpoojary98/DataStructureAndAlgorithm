package com.search.algorithm;

import java.util.Arrays;

public class BinarySeach implements Search {

	@Override
	public void search(int[] array, int key) {
		try {

			Arrays.sort(array);
			int high = array.length;
			int low = 0;
			while (low <= high) {
				int middle = (high + low) / 2;
				if (array[middle] > key) {
					high = middle - 1;
				} else if (array[middle] == key) {
					System.out.println(key + " found in the array");
					return;
				} else {
					low = middle + 1;
				}
			}
			if (low > high) {
				System.out.println(key + " is not found the array");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void search(long[] array, long key) {
		try {
		Arrays.sort(array);
		int high = array.length;
		int low = 0;
		while (low <= high) {
			int middle = (high + low) / 2;
			if (array[middle] > key) {
				high = middle - 1;
			} else if (array[middle] == key) {
				System.out.println(key + " found in the array");
				return;
			} else {
				low = middle + 1;
			}
		}
		if (low > high) {
			System.out.println(key + " is not found the array");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void search(String[] array, String key) {
		try {
		
		Arrays.sort(array);
		int high = array.length;
		int low = 0;
		while (low <= high) {
			int middle = (high + low) / 2;
			if (array[middle].compareTo(key) > 0) {
				high = middle - 1;
			} else if (array[middle].equals(key)) {
				System.out.println(key + " found in the array");
				return;
			} else {
				low = middle + 1;
			}
		}
		if (low > high) {
			System.out.println(key + " is not found the array");
		}
		
		} catch (Exception e) {
e.printStackTrace();		}
	}

	@Override
	public void search(float[] array, float key) {
		try {
			
		
		Arrays.sort(array);
		int high = array.length;
		int low = 0;
		while (low <= high) {
			int middle = (high + low) / 2;
			if (array[middle] > key) {
				high = middle - 1;
			} else if (array[middle] == key) {
				System.out.println(key + " found in the array");
				return;
			} else {
				low = middle + 1;
			}
		}
		if (low > high) {
			System.out.println(key + " is not found the array");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void search(double[] array, double key) {
		try {
			
		
		Arrays.sort(array);
		int high = array.length;
		int low = 0;
		while (low <= high) {
			int middle = (high + low) / 2;
			if (array[middle] > key) {
				high = middle - 1;
			} else if (array[middle] == key) {
				System.out.println(key + " found in the array");
				return;
			} else {
				low = middle + 1;
			}
		}
		if (low > high) {
			System.out.println(key + " is not found the array");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
