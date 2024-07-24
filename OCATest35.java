package oca;

public class OCATest35 {
	static int m() {
		int x=9;
		System.out.println("hi");
		return 'h';
	}
	static int mmm() {
		if(2<3) 
		return 1;
		return 2;
	}
	public static void main(String[] args) {
		int a=m();
		System.out.println(a);
		System.out.println(m());
		System.out.println(mmm());
	}
}
