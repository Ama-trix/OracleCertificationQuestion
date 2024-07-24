package oca;

public class ocatest45 {
	int foo=10;
	String ee="ee";
	void faa(int foo,String e) {
		foo=foo+2;
		ee=e;
		System.out.println('e'+foo++-++foo+ee+'e'+e);
	}
	public static void main(String[] args) {
		ocatest45 a=new ocatest45();
		ocatest45 a2=new ocatest45();
		a.faa(5,"kk");
		a2.faa(20,"rr");
		System.out.println(a.foo+a.ee);
		System.out.println(a2.foo+a2.ee);
	}

}
