package com.sort.algorithm;

public class InsertionSort implements Sort {

	@Override
	public void sort(int[] array) {
		try {
			int n=array.length;
			for(int i=1;i<n;i++) {
				int value=array[i];
				int postion=i;
				while(postion>0&&array[postion-1]>value) {
					array[postion]=array[postion-1];
					postion=postion-1;
				}
				array[postion]=value;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void sort(String[] array) {
		try {
			int n=array.length;
			for(int i=1;i<n;i++) {
				String value=array[i];
				int postion=i;
				while(postion>0&&(array[postion-1].compareTo(value)>0)) {
					array[postion]=array[postion-1];
					postion=postion-1;
				}
				array[postion]=value;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
