package oca;

public class ocatest54 {
	int x=10;
	String y="k";
	ocatest54(){
		System.out.println("Hi");
	}
	void m(ocatest54 o) {
		o.x+=5;
		o.y+="j";
	}
	public static void main(String[] args) {
		ocatest54 o=new ocatest54();
		System.out.println(o.x+o.y);
		o.m(o);
		System.out.println(o.x+o.y);
	}
}