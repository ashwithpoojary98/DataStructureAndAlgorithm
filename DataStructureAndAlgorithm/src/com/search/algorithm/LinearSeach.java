package com.search.algorithm;

public class LinearSeach implements Search {

	@Override
	public void search(int[] array,int key) {
		try {
			
		
		int n = array.length;
		int i;
		for (i = 0; i < n; i++) {
			if(array[i]==key) {
				System.out.println(key+"  Key is found at index="+(i+1));
				return;
			}
			}
		if(i==n) {
			System.out.println(key+" Not found in the given array");
		}
		} catch (Exception e) {
e.printStackTrace();		}
	}

	@Override
	public void search(long[] array,long key) {
		try {
	
		int n = array.length;
		int i; 
		for (i=0;i < n; i++) {
			if(array[i]==key) {
				System.out.println(key+"  Key is found at index="+(i+1));
				return;
			}
			}
		if(i==n) {
			System.out.println(key+" Not found in the given array");
		}
		} catch (Exception e) {
			e.printStackTrace();		}
	}

	@Override
	public void search(String[] array,String key) {
		try {
			
		
		int n = array.length;
		int i;
		for (i = 0; i < n; i++) {
			if(array[i].equals(key)) {
				System.out.println(key+"  Key is found at index="+(i+1));
				return;
			}
			}
		if(i==n) {
			System.out.println(key+" Not found in the given array");
		}
		} catch (Exception e) {
			e.printStackTrace();		}
	}

	@Override
	public void search(float[] array,float key) {
		try {
			
		int n = array.length;
		int i;
		for (i = 0; i < n; i++) {
			if(array[i]==key) {
				System.out.println(key+"  Key is found at index="+(i+1));
			}
			}
		if(i==n) {
			System.out.println(key+" Not found in the given array");
		}
		} catch (Exception e) {
			e.printStackTrace();		}
	}

	@Override
	public void search(double[] array,double key) {
		try {
			
		int n = array.length;
		int i;
		for (i= 0; i < n; i++) {
			if(array[i]==key) {
				System.out.println(key+"  Key is found at index="+(i+1));
				return;
			}
			}
		if(i==n) {
			System.out.println(key+" Not found in the given array");
		}
	} catch (Exception e) {
		e.printStackTrace();		}
	}
}
