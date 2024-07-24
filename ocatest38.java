package oca;

public class ocatest38 {static int m() {
	int x=9;
	System.out.println("hi");//infinite hi and java.lang.StackOverflowError at Runtime
	x=m();
	System.out.println(x);
	return x;
}
public static void main(String[] args) {
	int a=m();
	System.out.println(a);
}


}
