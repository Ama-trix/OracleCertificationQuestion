package oca;

class N{
	int x=90;
	static void m() {
		System.out.println("nnn");
	}
	double mm(int a) {
		System.out.println("Hi mm");
		return x;
	}
	void jj() {
		System.out.println("jj");
	}
}
public class OCATest70 extends N{
	int x=80;
	static void m() {
		System.out.println("mmmmm");
	}
	double mm(int b) {
		System.out.println("Hello mm");
		return super.x;
	}
	void gg() {
		System.out.println("gg");
	}
	public static void main(String[] args) {
		N n=new OCATest70();
		System.out.println(n.mm(1));
		System.out.println(n.x);
		n.m();
		n.jj();
		//n.gg();//error
		OCATest70 nn=new OCATest70();
		System.out.println(nn.mm(1));
		System.out.println(nn.x);
		nn.m();
		nn.jj();
		nn.gg();
	}
}