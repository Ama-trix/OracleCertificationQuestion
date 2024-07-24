package oca;

public class ocatest44 {
	int foo=10;
	void faa(int foo) {
		System.out.println(foo++-++foo);
	}
	public static void main(String[] args) {
		ocatest44 a=new ocatest44();
		ocatest44 a2=new ocatest44();
		a.faa(5);
		System.out.println(a.foo);
		System.out.println(a2.foo);
	}

}
