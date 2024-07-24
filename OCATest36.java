package oca;

public class OCATest36 {
	static int m() {
		int x=9;
		System.out.println("hi");
		x=m2();
		System.out.println(x);
		return x;
	}
	static int m2() {
		int x=12;
		System.out.println("hi");
		return x;
	}
	public static void main(String[] args) {
		int a=m();
		System.out.println(a);
	}

}
