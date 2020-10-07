package com.sort.algorithm;

public class SelectionSort implements Sort {

	@Override
	public void sort(int[] array) {
try {
	int n=array.length;
	int minimum=0;
	for(int i=0;i<n-1;i++) {
		minimum=i;
		for(int j=i+1;j<n;j++) {
			if(array[j]<array[minimum]) {
				minimum=j;
			}
		}
		if(i!=minimum) {
			int temp=array[i];
			array[i]=array[minimum];
			array[minimum]=temp;
		}
	}
} catch (Exception e) {
	e.printStackTrace();
}		
	}

	@Override
	public void sort(String[] array) {
		try {
			int n=array.length;
			int minimum=0;
			for(int i=0;i<n-1;i++) {
				minimum=i;
				for(int j=i+1;j<n;j++) {
					if(array[j].compareTo(array[minimum])<0) {
						minimum=j;
					}
				}
				if(i!=minimum) {
					String temp=array[i];
					array[i]=array[minimum];
					array[minimum]=temp;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}

}
