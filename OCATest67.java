package oca;

public class OCATest67 {
	static public void m() {
		System.out.println("Hi A");
	}
	static int m(double a) {
		System.out.println("Hello A");
		return 2;
	}
	private void m(String a) {
		System.out.println("Ok A");
	}
	public static void main(String[] args) {
		m();
		m(5);
		//m("h");//error
		new OCATest67().m("h");
		new OCATest67().m();
		new OCATest67().m(3);
	}
}
