package oca;

public class DM2 {

	public static void main(String[] args) {
		int a=10;
		if(a++<11){
			//int a=5; //error
			a++;
			System.out.println("Hello"+a);
		}
		System.out.println("Bye"+a);
	}



}
