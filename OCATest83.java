package oca;
public class OCATest83 {
	public static void main(String[] args) {
		//int a[]= {5,6,72,3};//allowed
		//int a[]= new int[]{5,6,72,3};//allowed
		//int a[]= new int[4]{5,6,72,3};//error
		int a[];
		//int []a;//allowed
		//a= {5,6,72,3};//error
		a=new int[] {5,6,72,3}; 
		for(int x:a) {
			System.out.println(x);
		}
		m(a);//call by reference
		for(int x:a) {
			System.out.println(x);
		}
		m(a[2]);//call by value
		for(int x:a) {
			System.out.println(x);
		}
	}
	static void m(int a[]) {
		a[3]=55;
	}
	static void m(int a) {
		a=22;
	}
}
