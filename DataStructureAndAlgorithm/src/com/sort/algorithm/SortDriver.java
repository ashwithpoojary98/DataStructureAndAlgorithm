package com.sort.algorithm;
/**
 * 
 * @author Ashwith
 *
 */
public class SortDriver {

	public static void main(String[] args) {

		int sample0[]= {562,784,7864,12563,5622};
		int sample1[]= {5,1,1,2,7,6,5,1};
		String sample2[]= {"Virat","MSDhoni","Yuvaraj","KLrahul","Abd"};
		int sample3[]= {1,2365,17,8,10};
		String[] sample4= {"Google","Facebook","Microsoft","Apple"};
		String[] sample5= {"CSE","MECH","ECE","EEE"};
		
		/**
		 * Different sort object creation
		 */
		
		Sort bubbleSort=new BubbleSort();
		Sort countSort=new CountSort();
		Sort heaSort=new HeapSort();
		Sort inserSort=new InsertionSort();
		Sort mergeSort=new MergeSort();
		Sort selectionSort=new SelectionSort();
		
		/**
		 * Based on the object reference it will execute the methods
		 * Run time polymorphism
		 */
		bubbleSort.sort(sample0);
		countSort.sort(sample1);
		heaSort.sort(sample2);
		inserSort.sort(sample3);
		mergeSort.sort(sample4);
		selectionSort.sort(sample5);
		
		display(sample0);
		display(sample1);
		display(sample2);
		display(sample3);
		display(sample4);
		display(sample5);

		
	}
	/**
	 * To display the array
	 * Method override(Based on the reference variable method will be execute)
	 * @param array
	 */
public static void display(String[] array) {
	for(int i=0;i<array.length;i++) {
	System.out.print(array[i]+" ");
	}
	System.out.println();
}
public static void display(int[] array) {
	for(int i=0;i<array.length;i++)
	{System.out.print(array[i]+" ");}
	System.out.println();
}
}
 