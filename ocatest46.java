package oca;

public class ocatest46 {
	static int x=10;
	void mm(int x) {
		x++;
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println(x);
		ocatest46 o=new ocatest46();
		o.mm(5);
		System.out.println(o.x);
	}
}


