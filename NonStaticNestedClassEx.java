package oca;
class AAAAAA{     //outer or upper or enclosing class
	private int p=50;
	int x=10;
	static int y=20;
	class B{ //non-static nested class or inner class
		//static int h=50;//error: static members(variable/method/block) not allowed
		final static int g=60;//allowed: if static variable is final also then allowed
		int z=30;
		void m2() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(p);
		}
	}
	void m1() {
		System.out.println(x);
		System.out.println(y);
		//System.out.println(z); //error
		System.out.println(B.g);
		B b=new B();
		System.out.println(b.z);
		b.m2();
	}
}
public class NonStaticNestedClassEx {
	public static void main(String[] args) {
		System.out.println(AAAAAA.B.g);
		//B b=new B(); //error
		AAAAAA a=new AAAAAA();
		System.out.println(a.x);
		a.m1();
		AAAAAA.B b=a.new B();//syntax for object construction of non-static nested class
		System.out.println(b.z);
		b.m2();
		//System.out.println(b.x); //error
		//System.out.println(a.z); //error
	}
}