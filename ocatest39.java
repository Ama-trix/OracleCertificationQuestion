package oca;

public class ocatest39 {
	static void m() {
		m();//java.lang.StackOverflowError at Runtime
	}
	public static void main(String[] args) {
		m();
	}
}


