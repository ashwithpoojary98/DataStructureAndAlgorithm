package com.sort.algorithm;

public class HeapSort implements Sort {

	@Override
	public void sort(int[] array) {
		int n=array.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(array, n, i);	
		}
		for(int i=n-1;i>=0;i--) {
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			heapify(array, i, 0);
		}
	}
public static void heapify(int arr[],int n,int i) {
	int largest=i;
	int l=2*i+1;
	int r=2*i+2;
	if(l<n&&arr[l]>arr[largest]) {
		largest=l;
	}
	if(r<n&&arr[r]>arr[largest]) {
		largest=r;
	}
	if(largest!=i) {
		int swap=arr[i];
		arr[i]=arr[largest];
		arr[largest]=swap;
		heapify(arr, n, largest);
	}
}
	@Override
	public void sort(String[] array) {
		// TODO Auto-generated method stub
		int n=array.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(array, n, i);	
		}
		for(int i=n-1;i>=0;i--) {
			String temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			heapify(array, i, 0);
		}
	}
public static void heapify(String arr[],int n,int i) {
	int largest=i;
	int l=2*i+1;
	int r=2*i+2;
	if(l<n&&arr[l].compareTo(arr[largest])>0) {
		largest=l;
	}
	if(r<n&&arr[r].compareTo(arr[largest])>0) {
		largest=r;
	}
	if(largest!=i) {
		String swap=arr[i];
		arr[i]=arr[largest];
		arr[largest]=swap;
		heapify(arr, n, largest);
	}

	}

}
