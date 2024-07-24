package oca;
interface WW{
	default void m1() {
		System.out.println("Hi W1");
	}
	default void m2() {
		System.out.println("Hi W2");
	}
}
public class OCATest76 implements WW{
	public void m1() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		OCATest76 o=new OCATest76();
		o.m1();
		o.m2();
	}
}