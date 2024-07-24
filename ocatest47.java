package oca;

public class ocatest47 {
	int y=20;
	static int x=10;
	void mm() {
		System.out.println(x+" "+y);
		x++;
		y++;
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ocatest47 o1=new ocatest47();
		ocatest47 o2=new ocatest47();
		o1.mm();
		o2.mm();
		System.out.println(o1.x+""+o1.y);
		System.out.println(o2.x+""+o2.y);
		System.out.println(new ocatest47().x);
		System.out.println(new ocatest47().y);
	}

}
