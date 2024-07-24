package oca;
//abstract interface W{ //optional to use abstract keyword
interface W{
	void m() ; //this is by-default public and abstract
}
class Q{
	void m2() {
		System.out.println("Q m2");
	}
}
public class OCATest74 extends Q implements W{
	@Override
	// void m(){ //error
	public void m() {
		System.out.println("Hi");
	}
	
	@Override
	//public void m2() { //allowed
	void m2() {
		System.out.println("hi m2");
	}
	public static void main(String[] args) {
		OCATest74 o=new OCATest74();
		o.m();
		o.m2();
	}
}