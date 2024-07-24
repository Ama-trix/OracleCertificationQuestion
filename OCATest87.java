package oca;

import java.util.Arrays;

public class OCATest87 {
	public static void main(String[]args) {
		int a[]=new int[] {5,6,3,5,56,7,89,5,4,7};
		//Arrays.sort(a); //does not work with boolean type array
		Arrays.sort(a,3,7); //does not work with boolean type array
		for(int x:a) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(a)); 
		
	//	Arrays.fill(a, 1);
		Arrays.fill(a, 2,6,1);
		System.out.println(Arrays.toString(a));
		
		int b[]= {4,5,567,8,8,3};
		int c[]= {4,5,567,8,8,3};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(c, b));
		
		//int x[]=Arrays.copyOf(a, 5);
		int x[]=Arrays.copyOfRange(a, 5,8); //no exception if index or range goes out of bounds, java gives default value
		System.out.println(Arrays.toString(x));
		
		int y[]= {4,5,2,9,1,4,7,2,64,3,23,12,4};
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		//[1, 2, 2, 3, 4, 4, 4, 5, 7, 9, 12, 23, 64]
		System.out.println(Arrays.binarySearch(y, 4));
		System.out.println(Arrays.binarySearch(y, 64));
		System.out.println(Arrays.binarySearch(y, 6));//-(expected+1) 
		System.out.println(Arrays.binarySearch(y, 13));//-(expected+1)   
		System.out.println(Arrays.binarySearch(y, 7));
		System.out.println(Arrays.binarySearch(y, 2,6,5));
		
	}

}
