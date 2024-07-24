package oca;

public class OCATest66 {
	void m(byte x) {
		System.out.println("byte");
	}
	void m(short x) {
		System.out.println("short");
	}
	void m(int x) {
		System.out.println("int");
	}
	void m(long x) {
		System.out.println("long");
	}
	void m(float x) {
		System.out.println("float");
	}
	void m(double x) {
		System.out.println("double");
	}
	void m(Integer x) {
		System.out.println("Integer");
	}
	void m(Number x) {
		System.out.println("Double");
	}
	void m(Object x) {
		System.out.println("Object");
	}
	void m(int ...x ) {
		System.out.println("int ...");
	}
	void m(Double x) {
		System.out.println("Double");
	}
	public static void main(String[] args) {
		new OCATest66().m(10);
		
		double a=9;
		//Double b=9;//error
		
		//new OCATest66().kk(10);//error - method kk(int[]) is ambiguous
	}

	void kk(int ...x ) {
		System.out.println("i ...");
	}
	void kk(Object ...x ) {
		System.out.println("Object ...");
	}
}