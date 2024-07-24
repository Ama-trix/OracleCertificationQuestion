package oca;

interface ZZ{
	static void m1() {
		System.out.println("Hi Z");
	}
	static void m2() {
		System.out.println("Heloo Z");
	}
}
interface RR extends ZZ{
	static String m1() {
		System.out.println("Hi R");
		return "hi r";
	}
}
class TT implements ZZ{
	static String m1() {
		System.out.println("Hi R");
		return "hi r";
	}
}
public class OCATest78 implements RR{
	public static void main(String[] args) {
		ZZ.m1();
		ZZ.m2();
		RR.m1();
		//RR.m2();//error
		TT.m1();
		//TT.m2();//error
	}
}