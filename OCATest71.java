package oca;

class NN{
	int x=90;
	static void classMethod() {
		System.out.println("nn");
	}
	void instanceMethod() {
		System.out.println("jj");
	}
}
public class OCATest71 extends NN{
	int x=50;
	static void classMethod() {
		System.out.println("kk");
	}
	void instanceMethod() {
		System.out.println("yy");
	}
	public static void main(String[] args) {
		NN n=new NN();
		n.classMethod();//nn
		n.instanceMethod();//jj
		System.out.println(n.x);//90
		n=new OCATest71();
		n.classMethod();//nn
		n.instanceMethod();//yy
		System.out.println(n.x);//90
	}
}