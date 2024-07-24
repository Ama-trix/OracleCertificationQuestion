package oca;

public class ocatest56 {
	int x=10;
	String y="k";
	ocatest56(){
		System.out.println("Hi");
	}
	ocatest56 o;
	void m(ocatest56 o) {
		System.out.println(o.x+o.y);
	}
	
	public static void main(String[] args) {
		ocatest56 o=new ocatest56();
		o.o=new ocatest56();
		o.x+=90;
		o.y+="j";
		o.m(o);
		o.m(o.o);
		o.m(o.o.o);
		o.m(o.o.o.o.o.o.o.o.o);
	}


}
