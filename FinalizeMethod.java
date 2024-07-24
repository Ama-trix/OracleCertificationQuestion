package oca;

public class FinalizeMethod {

	public static void main(String[] args) {
		System.out.println("Hi Main");
		My m1=new My();
		My m2=new My();
		m1=m2=null;
		System.gc();//invoke Garbage Collector Forcefully
		System.out.println("Bye Main");
		for(;;) {
//			System.out.println("KK");
		}
	}

}
class My{
	int a=90;
	void m() {
		System.out.println("Hello My");
	}
	@Override
	protected void finalize() {
		System.out.println("Object Collected!");
	}

}
