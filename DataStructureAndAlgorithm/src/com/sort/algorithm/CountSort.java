package com.sort.algorithm;

import java.util.Arrays;

public class CountSort implements Sort {

	@Override
	public void sort(int[] array) {
		countSort(array, array.length);
	}
	public static void countSort(int array[],int size) {
		int[] output=new int[size+1];
		int max=array[0];
		for(int i=0;i<size;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		int count[]=new int[max+1];
		for(int i=0;i<max;i++) {
			count[i]=0;
		}
		for (int i = 0; i <size; i++) {
			count[array[i]]++;
		}
		for(int i=1;i<=max;i++) {
			count[i]+=count[i-1];
		}
		for(int i=size-1;i>=0;i--) {
			output[count[array[i]] - 1] = array[i];
			--count[array[i]];
		}
		for(int i=0;i<size;i++) {
			array[i]=output[i];
		}
	}

	@Override
	public void sort(String[] array) {
			Arrays.fill(array, null);
			System.err.println("Count sort not support string");	
		}
}
