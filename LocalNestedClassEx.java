package oca;

class E{     //outer or upper or enclosing class
	private int p=50;
	int x=10;
	static int y=20;
	void m1() {
		System.out.println(x);
		System.out.println(y);
		//B b=new B();//error
		class B{ //local nested class 
			//static int h=50;//error: static members(variable/method/block) not allowed
			final static int g=60;//allowed: if static variable is final also then allowed
			int z=30;
			void m2() {
				System.out.println(x);
				System.out.println(y);
				System.out.println(p);
				System.out.println(z);
			}
		}
		System.out.println(B.g);
		B b=new B();
		System.out.println(b.z);
		b.m2();
	}
	void m() {
		//B b=new B();//error
	}
}
public class LocalNestedClassEx {
	public static void main(String[] args) {
		//B b=new B(); //error
		//E.B b=new E.B();//error
		E e=new E();
		//E.B b=e.new B();//error
		e.m1();
	}

}
