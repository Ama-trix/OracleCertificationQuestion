package oca;
class HH{
	static void m() {
		System.out.println("PP");
	}
	static {
		System.out.println("HHHH");
	}
}
public class OCATest49 {
	static String rr="yoyo";
	static {
		System.out.println("hi"+rr);
	}
	public static void main(String[] args) {
		HH.m();
	}


}
