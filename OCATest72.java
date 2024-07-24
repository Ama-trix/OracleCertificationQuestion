package oca;

abstract class SH{
	SH(){
		System.out.println("SH");
	}
	void mm() {
		System.out.println("mm");
	}
}
public class OCATest72 extends SH{
	int x=50;
	static void m1() {
		System.out.println("kk");
	}
	void m2() {
		System.out.println("yy");
	}
	void mm() {
		System.out.println("oca mm");
	}
	public static void main(String[] args) {
		//SH s=new SH();//error
		OCATest72 o1=new OCATest72();
		o1.m2();
		o1.m1();
		o1.mm();
		System.out.println(o1.x);
		SH s=new OCATest72();
		s.mm();
		/* error
		s.m2();
		s.m1();
		System.out.println(s.x); */
	}


}
