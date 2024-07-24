package oca;

class DDD{
	int x=10;
	void m1() {
		System.out.println("Hi DDD");
	}
}
class EE extends DDD{
	int x=90;
	int y=70;
	void m2() {
		System.out.println(y);
		//System.out.println(super.y);//error
		int z=50;
		System.out.println(z);
		//System.out.println(this.z);//error
		int x=80;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
		m1();
		this.m1();
		super.m1();
	}
	void m1() {
		System.out.println("Hi EE");
	}
	
}
public class OCATest63 {
	public static void main(String[] args) {
		EE e=new EE();
		e.m2();
		System.out.println(e.x);
		//System.out.println(e.super.x);//error
		e.m1();
		//e.super.m1();//error
	}

	

}
