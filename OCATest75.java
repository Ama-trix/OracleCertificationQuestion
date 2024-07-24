package oca;

interface W1{
	int a=9;//by-default public static final
	int b=4;//by-default public static final
	static void m1() {
		System.out.println("Hi W1");
	}
}
interface W2{
	int a=5;//by-default public static final
}
public class OCATest75 implements W1,W2{

	public static void main(String[] args) {
		//System.out.println(a);//Due to duplicate a in W1 & W2 
		System.out.println(b);//allowed
		System.out.println(W1.a);
		System.out.println(W2.a);
		W1 w=null;
		System.out.println(w.a);
		OCATest75 o=new OCATest75();
		//System.out.println(o.a);//error //Due to duplicate a in W1 & W2
		System.out.println(o.b);
		W1.m1();//static method of interface never inherited
		//OCATest75.m1();//error
		//o.m1();//error
		//w.m1();//error
	}
}