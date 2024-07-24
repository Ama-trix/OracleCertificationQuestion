package oca;
interface Z{
	default void m1() {
		System.out.println("Hi Z");
	}
}
interface R extends Z{
	default void m1() {
		System.out.println("Hi R");
	}
}
class FF{
	public void m1() {
		System.out.println("Hello");
	}
}
public class OCATest77 extends FF implements Z,R{
//	public void m1() {
//		System.out.println("ok");
//	}
	public static void main(String[] args) {
		OCATest77 o=new OCATest77();
		o.m1();
	}
}
