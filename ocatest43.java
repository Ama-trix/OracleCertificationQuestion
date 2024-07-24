package oca;

class AA{
	int x=10;
	void m() {
		System.out.println(x++);
	}
}

public class ocatest43 {
	public static void main(String[] args) {
		AA a=new AA();
		AA a2=new AA();
		a.x=90;
		System.out.println(a.x);
		a2.x++;
		System.out.println(a2.x);
		a.m();
		a2.m();
		System.out.println(a.x);
		System.out.println(a2.x);
	}
}
