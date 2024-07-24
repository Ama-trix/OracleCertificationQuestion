package oca;

class KK{
	int x=90;
	double mm(int x) {
		x=x;
		System.out.println("Hi mm");
		return x;
	}
}
public class OCATest68 extends KK{
	int x=90;
	int mm(double x) {
		x=x;
		System.out.println("Hello mm");
		return (int)x;
	}
	public static void main(String[] args) {
		System.out.println(new OCATest68().mm(20));
		System.out.println(new OCATest68().mm(2.8));
	}
}
