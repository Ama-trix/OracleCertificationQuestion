package oca;

import java.util.Arrays;
import java.util.List;

public class OCATest89 {
	public static void main(String[]args) {
		Integer a[]= {3,4,5,7,2,24,5,7};
		List l=Arrays.asList(a);
		System.out.println(l);
		System.out.println(l.size());
		

		List l1=Arrays.asList(5,6,7,93,2);
		System.out.println(l1);
		
		int a2[]= {3,4,5,7,2,24,5,7};
		List l2=Arrays.asList(a2);
		System.out.println(l2);
		System.out.println(l2.toString());
		System.out.println(Arrays.toString((int[])l2.get(0)));
		System.out.println(l2.size());
	}


}
