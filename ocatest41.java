package oca;

public class ocatest41 {
	static int x=9;
	static int m() {
		System.out.println("hi");
		System.out.println(x++);
		if(x<=10) {
			x=m();
			System.out.println("1");			
			System.out.println(x++);
		}
		System.out.println(x++);
		return x;
	}
	public static void main(String[] args) {
		int a=m();
		System.out.println(a);
	}


}
