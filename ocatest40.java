package oca;

public class ocatest40 {
	static int x=9;
	static int m() {
		System.out.println("hi");
		System.out.println(x++);
		if(x<=10) x=m();
		return 1;
	}
	public static void main(String[] args) {
		int a=m();
		System.out.println(a);
	}


}
