package oca;

class D{     //outer or upper or enclosing class
	private int p=50;
	int x=10;
	static int y=20;
	static class B{ //static nested class 
		static int h=50;//allowed: static members(variable/method/block)  allowed
		final static int g=60;//allowed
		int z=30;
		void m2() {
			//System.out.println(x);//error
			System.out.println(y);
			//System.out.println(p);//error
			System.out.println(z);
		}
	}
	void m1() {
		System.out.println(x);
		System.out.println(y);
		//System.out.println(z); //error
		System.out.println(B.h);
		System.out.println(B.g);
		B b=new B();
		System.out.println(b.z);
		b.m2();
	}
}
public class StaticNestedClassEx {
	public static void main(String[] args) {
		System.out.println(D.B.h);
		System.out.println(D.B.g);
		//B b=new B(); //error
		D.B b=new D.B();//syntax for object construction of static nested class
		System.out.println(b.z);
		b.m2();
		//System.out.println(b.x); //error
	}

}
