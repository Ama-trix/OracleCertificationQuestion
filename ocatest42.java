package oca;

public class ocatest42 {
	static int x=9;
	static int m(int y) {
		System.out.println("hi");
		System.out.println(x++);
		if(x<=y) {
			
			System.out.println(x++);
			x=m(x);
			System.out.println(--x+x++);
		}
		System.out.println(x++);
		return x++;
	}
	public static void main(String[] args) {
		int a=m(10);
		System.out.println(a);
	}


}
