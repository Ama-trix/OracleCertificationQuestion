package oca;

class KKK{
	int x=90;
	double mm(int a) {
		System.out.println("Hi mm");
		return x;
	}
}
public class OCATest69 extends KKK{
	int x=80;
	double mm(int b) {
		System.out.println("Hello mm");
		return x;
	}
	public static void main(String[] args) {
		System.out.println(new OCATest69().mm(20));
	}
}


