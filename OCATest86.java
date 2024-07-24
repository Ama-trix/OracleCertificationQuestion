package oca;

public class OCATest86 {
	static int x[][];
	public static void main(String[]args) {
		
		System.out.println(x);
		
		int a[][]=new int[3][2];
		//int []a[]=new int[3][2];//allowed
		//int [][]a=new int[3][2];//allowed
		a[0][0]=9;
		a[0][1]=4;
		a[1][0]=5;
		a[1][1]=7;
		a[2][0]=1;
		a[2][1]=8;
		
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//int b[]=new int[3][2];//error
		//int b[][]=new int[][];//error
		//int b[][]=new int[][2];//error
		int b[][]=new int[3][];//allowed
		//System.out.println(b[2][0]);//NullPointerException
		b[1]=new int[3];
		System.out.println(b[1][0]);//allowed
		
		int c[][];
		//System.out.println(c);//error
		
		int d[][]=null;
		System.out.println(d);
	}
}
