package com.search.algorithm;
/**
 * 
 * @author Ashwith
 *
 */
public class SearchDriver {
	
	public static void main(String[] args) {
		/*
		 * System.out.println("Enter the array size"); Scanner scanner=new
		 * Scanner(System.in); int n=scanner.nextInt(); int arr[]=new int[n]; for(int
		 * i=0;i<n;i++) { arr[i]=scanner.nextInt(); }
		 * System.out.println("Enter the Key to be searh");
		 * 	int key=scanner.nextInt();

		 */
		
		
		/*
		 * Don't HardCode
		 */
	int int_array[]= {56,89,78,36,45,56};
	double double_array[]= {20.0,78.0,65.63,563.556,565.23};
	long long_array[]= {156423L,4896456l,45697454L,5454554L,5864556545L};
	String string_array[]= {"helloworld","hackerearth","hackerrank","github"};
	float float_array[]= {78.0f,5545.0f,20.56f,89565.5f};
		Search linearSearch=new LinearSeach();
		linearSearch.search(int_array, 45);
		linearSearch.search(double_array, 20.0);
		linearSearch.search(long_array, 5454554L);
		linearSearch.search(string_array, "github");
		linearSearch.search(float_array, 20.6f);
		System.out.println("----------------------------------");
		Search binarSearch=new BinarySeach();
		binarSearch.search(int_array, 45);
		binarSearch.search(double_array, 565.23);
		binarSearch.search(long_array, 5454554L);
		binarSearch.search(string_array, "github");
		binarSearch.search(float_array, 20.6f);
		//scanner.close();
	}

}
